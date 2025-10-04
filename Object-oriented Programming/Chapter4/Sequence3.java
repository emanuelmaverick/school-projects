package Chapter4;

public class Sequence3 {
    public static void main(String[] args) {
        int left = 1;
        int right = 10;
        boolean printRight = true;

        while (left <= 5) {
            System.out.print(left + " ");
            left++;
            if (printRight && left <= 5) {
                System.out.print(right + " ");
                right--;
            }
            printRight = !printRight;
        }
        System.out.print(left + " " + left);
    }
}
