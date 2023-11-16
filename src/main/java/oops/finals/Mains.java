package oops.finals;

class FinalClass {
    final int a = 10;

    final static void m1() {
        System.out.println("m1");
    }
}

public class Mains extends FinalClass {
//     static void m1() {
/*
    getting error while overring the m1
    because we are declare as final
*/
//
//     }

    public static void main(String[] args) {
        FinalClass clazz = new FinalClass();
        FinalClass.m1();

        System.out.println(clazz.a);
    }
}

