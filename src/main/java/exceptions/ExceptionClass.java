package exceptions;

public class ExceptionClass {
    static int m1() {
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
//        return 40;
    }

    //error java: unreachable statement;
    public static void main(String[] args) {
        System.out.println(ExceptionClass.m1());
    }
}
