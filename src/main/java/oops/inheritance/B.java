package oops.inheritance;

public class B extends A {
    public static void main(String[] args) {
        B b1 = new B();
        A b2 = new B();

//        b1.m1();
        b2.m1();
//        a.m1();
//        b1.m2();
        b2.m2();
//        a.m2();


        A a = new A();
        B b = new B();
//            a=b;
//        b = (B) a;

//        b.m2();
        b.m2();

    }

    void m1() {
        System.out.println("B class m1");
    }

    void m2() {
        System.out.println("B  class m2");
    }
}
