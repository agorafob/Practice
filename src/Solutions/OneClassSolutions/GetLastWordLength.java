package Solutions.OneClassSolutions;

public class GetLastWordLength {
    public static void main(String[] args) {
        String a = "";
        String b = " fefe5 6 !!! ";
        String c = "Good buy  ";
        System.out.println(lastWordLength(a));
        System.out.println(lastWordLength(b));
        System.out.println(lastWordLength(c));

    }

    static int lastWordLength(String line){
        int length = 0;
        int index = line.length()-1;
        if(line.length()==0){
            return length;
        }
        while (!(Character.isLetter(line.charAt(index))||Character.isDigit(line.charAt(index)))){
            index--;
        }
        while (index>=0&&!Character.isSpaceChar(line.charAt(index))&&(Character.isLetter(line.charAt(index))||Character.isDigit(line.charAt(index)))){
            length++;
            index--;
        }
        return length;
    }
}
