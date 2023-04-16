package Solutions.KnowledgeTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class KnowledgeBase {
    private static final List<String> test = new ArrayList<>();
    private static final Map<String, Integer> questionAnswer = new HashMap<>();
    private static final List<List<String>> allQuestions = new ArrayList<>();
    private static final String START_MESSAGE = "Впишите Ваш ответ от 1 до 5";
    private static final String ERROR = "Не правильный ввод!";
    private static final String CORRECT = "Верно!";
    private static final String WRONG = "Не верно";
    private static Scanner sc = new Scanner(System.in);
    private static int userCorrectAnswers = 0;
    private static int wrongAnswer = 0;


    private static void readFile() {
        try (BufferedReader in = new BufferedReader
                (new FileReader("D:\\JavaPractice\\Practice\\src\\Solutions\\KnowledgeTest\\java1.test"))) {
            String str;
            while ((str = in.readLine()) != null) {
                test.add(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void prepareTest() {
        List<String> singleQuestion = new ArrayList<>();
        String question;
        int answer;
        for (int i = 0; i < test.size(); i++) {
            if (test.get(i).equals("@Question")) {
                i++;
                question = test.get(i);
                while (!test.get(i).contains("@Options")) {
                    singleQuestion.add(test.get(i));
                    i++;
                }
                answer = Integer.parseInt(String.valueOf(test.get(i).charAt(test.get(i).length() - 1)));
                questionAnswer.put(question, answer);
                i++;
                while (i < test.size() && !test.get(i).isBlank()) {
                    singleQuestion.add(test.get(i));
                    i++;
                }
                allQuestions.add(singleQuestion);
                singleQuestion = new ArrayList<>();
            }
        }
    }

    private static void printQuestions() {
        for (List<String> singleQuestion: allQuestions) {
            String question = singleQuestion.get(0);
            int correctAnswer = questionAnswer.get(question);
            for (String line: singleQuestion) {
                System.out.println(line);
            }
            System.out.println();
            System.out.println(START_MESSAGE);
            String userAnswer = sc.nextLine();
            while (!controller(userAnswer)){
                System.out.println(ERROR);
                System.out.println(START_MESSAGE);
                userAnswer = sc.nextLine();
            }
            validator(correctAnswer,Integer.parseInt(userAnswer));
        }
    }

    private static boolean controller(String answer) {
        boolean result;
        try {
            if(answer.length()>1||!Character.isDigit(answer.charAt(0))){
                result = false;
            }else result = Integer.parseInt(answer) >= 1 && Integer.parseInt(answer) <= 5;

        }catch (StringIndexOutOfBoundsException e){
            result = false;
        }
        return result;
    }

    private static void validator(int correctAnswer , int userAnswer){
        if(correctAnswer==userAnswer){
            userCorrectAnswers++;
            System.out.println(CORRECT);
        }else {
            wrongAnswer++;
            System.out.println(WRONG);
        }
    }

    private static void summary(){
        sc.close();
        System.out.println("Всего верных ответов: " + userCorrectAnswers);
        System.out.println("Всего неверных ответов: " + wrongAnswer);
    }


    public static void run() {
        readFile();
        prepareTest();
        printQuestions();
        summary();
    }
}
