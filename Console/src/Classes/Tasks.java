package Classes;

public class Tasks {
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
    public static void Task2(String words){
        for(var word: words.split(",")){
            StringBuffer str = new StringBuffer(word);
            for(int i =0;i<str.length();i++){
                if(str.charAt(i) == 't'){
                    str.insert(i+1,'h');
                }
            }
            System.out.println(str);
        }


    }


}
