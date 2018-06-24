import java.io.*;

//import java.util.Scanner;

class MatrixAdd {

    public static void main(String[] args) {
        try {
            DataInputStream br = new DataInputStream(System.in);
            //Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the matrix: ");
            int row = Integer.parseInt(br.readLine());
            int col = Integer.parseInt(br.readLine());

            //int row = sc.nextInt();
            //int col = sc.nextInt();

            // Decleration of 3 matries 
            int[][] a = new int[row][col];
            int[][] b = new int[row][col];
            int[][] c = new int[row][col];

            System.out.println("Enter the 1st matrix: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    //a[i][j] = sc.nextInt();
                    a[i][j] = Integer.parseInt(br.readLine());
                    
                }
            }
            System.out.println("Enter the 2nd matrix: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    //b[i][j] = sc.nextInt();

                    b[i][j] = Integer.parseInt(br.readLine());
                }
            }

            // the addition
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("The result is: ");
            // print the result
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }

        }
        catch(Exception e) {}
    }
}
