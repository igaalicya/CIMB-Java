import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        byte inputMin = scanner.nextByte();
        System.out.print("Input second number: ");
        byte inputMax = scanner.nextByte();

        // int range = inputMax - inputMin + 1;
        // int numbers[] = new int[range];

        // for (int i = 0; i < range; i++) {
        // numbers[i] = i + inputMin;
        // }
        // System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = inputMin; i <= inputMax; i++) {
            numbers.add(i);
        }
        System.out.println((numbers));

    }

    public static void generateArrayfromRange(int inputMin, int inputMax) {

    }
}
