import java.util.Arrays;

class Ex6_8 {

    public static void main(String[] args) {
        int[] marks = {12, 69, 40, 60, 78, 90, 44, 99, 46, 10};
        int[] numberOfStudents = new int[4];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 80) {
                numberOfStudents[0]++;
            }
            else if (marks[i] > 60) {
                numberOfStudents[1]++;
            }
            else if (marks[i] > 40) {
                numberOfStudents[2]++;
            }
            else {
                numberOfStudents[3]++;
            }
        }

        System.out.println(Arrays.toString(numberOfStudents));
    }
}