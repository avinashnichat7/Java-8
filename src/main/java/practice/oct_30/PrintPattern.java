package practice.oct_30;

public class PrintPattern {
    public static void main(String[] args) {

        PrintPattern p = new PrintPattern();
        p.printPat(3);
    }

    void printPat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                for (int k = 0; k < n - i; k++) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("$");
        }
    }
}
