package practice.oct_30;

public class PrintwithoutLopp {

    public void printNos(int n) {
        if (n > 0) {
            printNos(n - 1);
            System.out.println("print "+ n);
        }
    }

    public static void main(String[] args) {
        PrintwithoutLopp test = new PrintwithoutLopp();
        test.printNos(10);
    }
}
