class LabelLoops {
    
    public static void main(String[] args) {
        loop1: for (int i = 1; ;i++) {

            loop2: for (int j = 1; ;j++) {
                int k = 1;
                if (j == 7) {
                    break loop1;
                }

                loop3: while (k <= 10) {
                    System.out.println(i + " " + j + " " + k);

                    if (k == 7) {
                        continue loop2;
                    }

                    k++;
                }
            }
        }
    }
}