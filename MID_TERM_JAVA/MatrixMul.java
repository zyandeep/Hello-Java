import java.io.*;

class MatrixMul {
    
    public static void main(String[] args) throws Exception {
        DataInputStream br = new DataInputStream(System.in);
        int i, j, k;

        System.out.print("Enter the size of the 1st matrix: ");
        int r1 = Integer.parseInt(br.readLine());
        int c1 = Integer.parseInt(br.readLine());
        System.out.print("Enter the size of the 2nd matrix: ");
        int r2 = Integer.parseInt(br.readLine());
        int c2 = Integer.parseInt(br.readLine());

        // row of the 2nd matrix must be the same as the column of the 1st matrix 
        while (c1 != r2) {
            System.out.print("The row size of 2nd matrix: ");
            r2 = Integer.parseInt(br.readLine()); 
        }

        // the 3 matries
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];

        System.out.print("Enter the 1st matrix: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.print("Enter the 2nd matrix: ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                b[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // the multiplication
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                for (k = 0; k < c1; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }       
            }
        }

        System.out.println("The result is: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}