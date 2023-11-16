package practice.day2;

public class MissingNoInArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5};
        int length = array.length;

        MissingNoInArray test = new MissingNoInArray();
        System.out.println(test.missingNumber(array, length));
    }

    int missingNumber(int array[], int n) {
        // Your Code Here

        int expectedLength = array.length + 1;
        int sum = expectedLength * (expectedLength + 1) / 2;

        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {

            sum2 = sum2 + array[i];
        }
        return (sum - sum2);
    }
}
