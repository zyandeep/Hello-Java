import java.io.*;

class SelectionSort {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int i, temp, n = 0;
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
        for (i = 0; i < (ar.length - 1); i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        System.out.println("The sorted array: ");
        for (i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}