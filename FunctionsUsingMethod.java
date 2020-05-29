import java.util.ArrayList;
import java.util.Scanner;

public class FunctionsUsingMethod {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        byte inputMin = scanner.nextByte();
        System.out.print("Input second number: ");
        byte inputMax = scanner.nextByte();

        if (inputMin > inputMax) {
            System.out.print("Error!");
        } else {
            System.out.println(generateArrayFromRange(inputMin, inputMax));
        }

    }

    public static ArrayList generateArrayFromRange(int inputMin, int inputMax) {
        if (inputMin < inputMax) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = inputMin; i <= inputMax; i++) {
                numbers.add(i);
            }
            // System.out.println((numbers));
            return numbers;
        }
        return new ArrayList<Integer>();
    }
}