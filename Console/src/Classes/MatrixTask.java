package Classes;

public class MatrixTask {
    public static int[] Task1(int[][] matrix) {
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int max = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (SumDigits(matrix[i][j]) > max){
                    max = SumDigits(matrix[i][j]);
                }
            }
            res[i] = max;
        }
        return res;
    }

    public static int SumDigits(int number) {
        int res = 0;
        while (number != 0) {
            res += number%10;
            number/=10;
        }
        return Math.abs(res);
    }
}
