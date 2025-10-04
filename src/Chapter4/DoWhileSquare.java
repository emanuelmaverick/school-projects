package Chapter4;

public class DoWhileSquare {
    public static void main(String[] args) {
        int row = 0;
        do {
            int col = 0;
            do {
                System.out.print("@");
                col++;
            } while (col < 10);
            System.out.println();
            row++;
        } while (row < 5);
    }
}
