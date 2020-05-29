
// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.Scanner;

public class Includes {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        byte inputNum = scanner.nextByte();

        System.out.println(isIncludes(inputNum));
    }

    public static boolean isIncludes(int inputNum) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == inputNum) {
                return true;
            }
        }
        return false;
    }
}