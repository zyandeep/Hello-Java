import java.util.Scanner;

class Ex6_9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the marks in three subjects: ");
        int math = sc.nextInt();
        int chem = sc.nextInt();
        int phy = sc.nextInt();

        int totalMarks = math + chem + phy;
        int mathPhy = math + phy;

        if ((math >= 60 && phy >= 50 && chem >= 40 && totalMarks >= 200) || 
            mathPhy >= 150) {
            System.out.println("Eligible");
        }
    }
}