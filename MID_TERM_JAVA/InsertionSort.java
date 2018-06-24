import java.io.*;

class InsertionSort {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int i,j, temp, n = 0;
        int[] ar = null;

        System.out.println("How many elements: ");
        
        try {
            n = Integer.parseInt(br.readLine());
            ar = new int[n];
            System.out.println("Enter " + n + " elements: ");

            for (i = 0; i < ar.length; i++) {
                ar[i] = Integer.parseInt(br.readLine());
            }
        }
        catch(Exception e) {}

        // the sorting
        for (i = 1; i < ar.length; i++) {
            temp = ar[i];
            for (j = i-1; j >= 0; j--) {
                if (ar[j] > temp) {
                    ar[j+1] = ar[j];
                }
                else {
                    break;
                }
            }
            ar[j+1] = temp;
        }

        System.out.println("The sorted array: ");
        for (i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}