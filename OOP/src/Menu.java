package OOP.src;

public class Menu {

    public static void tambahBuah() {
        while (true) {
            // System.out.print("Input nama buah: "); // output
            String inputName = Console.readInputString("Input nama buah: ");
            int inputPrice = (int) Console.readInputNumber("Input harga buah: ");
            int inputStock = (int) Console.readInputNumber("Input stock buah: ");

            Buah buah = new Buah(inputName, inputPrice, inputStock);

            App.listBuah.add(buah);
            // listBuah.add(buah);

            System.out.println("Repeat? (y/n)");
            String option = App.scanner.next();
            if (option.equalsIgnoreCase("N")) {
                System.out.println("you're already exit");
                break;
            }
        }
    }

    public static void tampilListBuah() {
        for (int i = 0; i < App.listBuah.size(); i++) {
            System.out.println((i + 1) + ". " + App.listBuah.get(i).getName() + " || " + App.listBuah.get(i).getPrice()
                    + " || " + App.listBuah.get(i).getStock());
        }
    }

}