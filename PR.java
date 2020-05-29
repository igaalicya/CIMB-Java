import java.util.Scanner;

public class PR {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nama anda: "); // output
        String inputName = scanner.nextLine(); // input

        System.out.print("Input umur anda: "); // output
        byte inputAge = scanner.nextByte(); // input
        scanner.nextLine();

        System.out.print("Input alamat anda: "); // output
        String inputAddress = scanner.nextLine(); // input

        System.out.print("Input tahun lahir anda: "); // output
        int inputYear = scanner.nextInt(); // input
        // System.out.println("Nama anda adalah: " + inputName + ", Umur anda adalah: "
        // + inputAge
        // + " tahun , Alamat anda di " + inputAddress + ", Tahun lahir anda adalah: " +
        // inputYear); // output

        // cara lain format string
        String template = "Nama anda adalah %s, berumur %s tahun, tinggal di %s, lahir tahun %s";
        String result = String.format(template, inputName, inputAge, inputAddress, inputYear);
        System.out.println(result);
    }
}