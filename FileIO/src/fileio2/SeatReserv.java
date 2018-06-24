// seat reservation program in Java
// date: 11-07-2014

package fileio2;

import java.io.*;
import java.util.Scanner;

public class SeatReserv {

    static int ticketNo = 1;
    static Scanner sc = new Scanner(System.in);
    
    // file object to refer the file D:\seatResv.bin 
    static File f = new File("D:\\seatResv.bin");
    

    //// program execution starts from here...
    public static void main(String[] args) {
        
        char loopChoice;
        int userChoice;
        boolean testFile = true ;
        
        // check the existance of the file 
        if (f.exists())
            testFile = false ;

        try ( RandomAccessFile raf = new RandomAccessFile(f, "rw")) {

            //very first, this method is invoked to create the file with empty ticket no
            if ( testFile)
                bookSeat(0, raf);

            while (ticketNo <= 10) {

                userChoice = printMenu();

                switch (userChoice) {
                    case 1:
                        System.out.println("\n Enter the seat no: (1-10) ");
                        userChoice = sc.nextInt();
                        bookSeat(userChoice, raf);
                        break;
                    case 2:
                        viewSeat(raf);
                        break;
                    default:
                        continue;
                }

                System.out.println("\n want to exit (y/n) ");
                loopChoice = (sc.next()).charAt(0);

                if (loopChoice == 'y') {

                    // closing the stream
                    raf.close();
                    
                    // just quit the program
                    System.exit(0);
                }
            }
            
        } 
        catch (IOException e) {
            System.out.println("\n ERROR!! " + e);
        }

    }

    static int printMenu() {

        // this methods displays the menu and takes user choice
        int choice;

        System.out.println("*** SEAT RESERVATION PROGRAM ***");
        System.out.printf("------------------------------------\n");
        System.out.println("1. Request a seat...");
        System.out.println("2. View seat reservation...");
        System.out.printf("\n Enter choice: ");

        choice = sc.nextInt();

        if (choice < 1 || choice > 2) {
            System.out.println("\n wrong input!! \n");
            return -1;
        } 
        else {
            return choice;
        }
    }

    static void bookSeat(int s, RandomAccessFile raf) throws IOException {

        // this methods reads seat number and books seat
        int seatNo = s;

        if (seatNo == 0) {

            // file is written with 0 to indicates empty seat
            for (int i = 1; i <= 10; i++) {
                raf.writeInt(0);
            }

            System.out.println("\n seat reservation program is ready!!! \n");
            return;
        }

        // go to the starting of the requested seat number
        raf.seek(4 * (seatNo - 1));

        while (raf.readInt() != 0) {
            System.out.println("\n requesred seat is booked! try booking another seat.");
            System.out.println("\n Enter a seat no: (1-10) ");
            seatNo = sc.nextInt();

            raf.seek(4 * (seatNo - 1));
        }

        System.out.println("\n seat is not booked yet! ");

        // go to the starting byte of the requested seat number 
        // and write the ticket no in place of 0
        raf.seek(4 * (seatNo - 1));
        raf.writeInt(ticketNo);

        System.out.println("\n requested seat is booked. Your ticket number = " + ticketNo++);
    }

    static void viewSeat(RandomAccessFile raf) throws IOException {

        // this methods prints the seat number as well as ticket number
        System.out.printf("\n seat no\t ticket no");
        System.out.println("\n ******************************* ");

        // go to the first byte of the file
        raf.seek(0);
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\t%d \t %d\n", i, raf.readInt());
        }
    }
}