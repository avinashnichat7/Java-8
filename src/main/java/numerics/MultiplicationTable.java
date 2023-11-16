package numerics;

import java.util.ArrayList;

public class MultiplicationTable {
    static ArrayList<Integer> getTable(int N) {
        // code here
        ArrayList<Integer> table = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {

            table.add(i * N);
        }

        return table;

    }

    public static void main(String[] args) {
        getTable(9);
    }
}
