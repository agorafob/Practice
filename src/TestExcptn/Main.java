package TestExcptn;

public class Main {
    public static void main(String[] args) throws MyException {

        try{
            throw new MyException("my exception");
        }catch (MyException e){
            throw new IllegalArgumentException("Illegal in my exception",e);
        }

//        try {
//            new UserValidator().validate(new User("dddd",19,"hiuhi"));
//        } catch (TestException | TestException2 e){
//            System.out.println(e.getMessage());
//        }

//
//        try {
//          print();
//        }finally {
//            System.out.println("2");
//        }
//    }
//
//    static int print() {return 1;}

//        try {
//            System.out.println("try");
////            System.exit(-1);
//            throw new Error();
////        }catch (RuntimeException e){
////            System.out.println("catch runtime");
//        }
//        catch (Error e){
//            System.out.println("catch error");
//        }
//        finally {
//            System.out.println("finally");
//            throw new Error();
//        }
//        Main main = new Main();
//        System.out.println("In Main: " + main.getInt());
    }

//    public int getInt() {
//        int returnVal = 10;
//        try  {
//            String[] students = {"Harry", "Paul"};
//            System.out.println(students[5]);
//        }  catch (Exception e) {
//            System.out.println("About to return: " + returnVal);
//            return returnVal;
//        }  finally {
//            returnVal  += 10;
//            System.out.println("Return value is now: " + returnVal);
////            return returnVal;
//        }
//
//        System.out.println("Return outside try/catch: " + returnVal);
//        return returnVal;
//    }

}
