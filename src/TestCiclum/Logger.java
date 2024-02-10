package TestCiclum;

public class Logger {
    public static void main(String[] args) {
        String[] loggedMoves = {"o/","w/","e/","./","./","./"};
        System.out.println(minimumSteps(loggedMoves));
    }

    static int minimumSteps(String[] loggedMoves){
        int steps = 0;
        for (String loggedMove : loggedMoves) {
            switch (loggedMove){
                case "./":break;
                case "../":--steps;break;
                default:++steps;
            }
        }
        return steps;
    }
}
