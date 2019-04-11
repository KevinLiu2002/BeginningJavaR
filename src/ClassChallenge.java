public class ClassChallenge {

    public static final int SIZE = 4;

    public static void tophalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 0; space < -line + SIZE; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash < line; slash++) {
                System.out.print("/");

            }
            System.out.print("*");
            for (int backslash = 1; backslash < line; backslash++) {
                System.out.print("\\");
            }
            for (int space = 0; space < -line + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void dashline() {
        System.out.print("+");
        for (int count = 1; count <= SIZE * 2 - 1; count++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void bottomhalf() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int space = 0; space < -line + SIZE; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash < line; slash++) {
                System.out.print("\\");

            }
            System.out.print("*");
            for (int backslash = 1; backslash < line; backslash++) {
                System.out.print("/");
            }
            for (int space = 0; space < -line + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        dashline();
        tophalf();
        bottomhalf();
        dashline();
        bottomhalf();
        tophalf();
        dashline();
    }
}

