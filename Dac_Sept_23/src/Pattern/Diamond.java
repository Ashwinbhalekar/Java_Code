package Pattern;

public class Diamond {
   char c='A';
    void pyramid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+c);
            }
            c++;
            System.out.println("");
        }
    }

    void revPyramid() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" "+c);
            }
            c--;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Diamond d = new Diamond();
        d.pyramid();
        d.revPyramid();
    }
}
