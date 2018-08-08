import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập vào các giá trị của mảng 1: ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Tiếp tục đến mảng 2: ");
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập vào các giá trị của mảng 2: ");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[10];
    }
}
