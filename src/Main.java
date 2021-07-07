import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner input= new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        int min = matrix[0][0];
        for(int k=0;k<matrix.length;k++){
            for(int f=0;f<matrix.length;f++){
                if(min>matrix[k][f]){
                    min= matrix[k][f];
                }
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng 2 chiều là" +min);
    }
}

