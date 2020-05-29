import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World");
        // System.out.println("Halo Dunia");

        // PRIMITIVE DATA TYPE
        // byte
        byte umur = 45;

        // short
        short iniShort = 128;

        // int (bisa dikasih underscore)
        int iniInt = 1_142_123;

        // long
        long iniLong = 123437643;

        // float dikasih F belakangnya(incase sensitive)
        float iniFloat = 147.22F;

        // double, biar aman kasih D di belakangnya
        double iniDouble = 142.23D;

        // String
        String nama = "Seto";

        // Char
        char grade = 'B';

        // boolean
        boolean isVerified = true;

        // REFERENCE DATA TYPE
        // array
        // String people[] = new String[5];
        // people[0] = "Seto";

        // System.out.println(Arrays.toString(people));

        // immutable array (gabisa diubah)
        // int people[] = { 3, 6, 8, 7, 2 };
        // System.out.println(Arrays.toString(people));

        // array 2 dimensi
        int matrix[][] = new int[4][3];
        matrix[0][1] = 17;
        matrix[1][0] = 7;
        System.out.println(Arrays.deepToString(matrix));

        // membuat constant (nama constant nya huruf capital)
        final float PI = 3.14F;
        // Scanner scanner = new Scanner(System.in);
        // byte inputAge = scanner.nextByte();
        // System.out.println("Age: " + inputAge);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nama anda: "); // output
        String inputName = scanner.nextLine(); // input
        System.out.println("Nama anda adalah: " + inputName); // output

        // System.out.println(
        // "Nama anda adalah <NAMA>, berumur <UMUR> tahun, tinggal di <TEMPAT_TINGGAL>,
        // lahir tahun <TAHUN_LAHIR>");
    }
}