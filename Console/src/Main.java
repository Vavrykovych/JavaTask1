import Classes.MatrixTask;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Task1----------");
        System.out.println("Input n");
        int n = sc.nextInt();
        System.out.println("Input m");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        Random rand = new Random();
        int range = 1000; // якими числами заповнювати матрицю 0-range
        for (int i = 0; i < n; i++) {
            for(int j =0;j<m;j++){
                matrix[i][j] = Math.abs(rand.nextInt()) % range;
            }
        }

        var vector = MatrixTask.Task1(matrix);
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for(int j =0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Result: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.println("----------Task2----------");



    }
}
