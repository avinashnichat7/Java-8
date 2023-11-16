package practice.oct_30;

public class AlternateNoPrintInArray {
    public static void print(int arr[], int n) {

        int temp = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println("print :" + i);
            temp = arr[i];
            System.out.println("tempValue" + temp+ " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int length = arr.length;
        AlternateNoPrintInArray.print(arr, length);
    }
}
