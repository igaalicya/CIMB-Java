package OOP.src;

public class Console {

    public static double readInputNumber(String message) {
        System.out.print(message);
        return App.scanner.nextDouble();
    }

    public static String readInputString(String message) {
        System.out.print(message);
        return App.scanner.next();
    }

}