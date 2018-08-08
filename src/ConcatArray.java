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
        int[] array2 = new int[3];
        for (int j = 0; j < array2.length; j++) {
            System.out.print("Nhập vào các giá trị của mảng 2: ");
            array2[j] = sc.nextInt();
        }

        int[] array3 = new int[8];
        for (int k = 0; k < array1.length; k++)
            array3[k] = array1[k];
        for (int l = 0; l < array2.length; l++)
            array3[l + array1.length] = array2[l];

        System.out.println("Các phần từ của mảng 3: ");
        for (int m = 0; m < array3.length; m++)
        System.out.print(array3[m] + "\t");
    }
}
