import java.io.*;

class BubbleSort {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int i, temp, n = 0;
        int[] array = null;

        System.out.print("How many elements: ");

        try {
            n = Integer.parseInt(br.readLine());

            array = new int[n]; 
            
            System.out.println("Enter " + n + " elements: ");
            for (i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(br.readLine());
            }
        }
        catch(Exception e) {}

        // the sotring
        for (int pass = n-1; pass >= 1; pass--) {
            for (i = 0; i < pass; i++) {
                if(array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        System.out.println("\nElements of array after the sorting are:");
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}