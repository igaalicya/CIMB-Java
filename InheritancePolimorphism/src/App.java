package InheritancePolimorphism.src;

public class App {
    public static void main(String[] args) throws Exception {
        // ini yang dipanggil methodnya bukan field
        // new Input().isEnabled();

        // TextBox textBox = new TextBox();
        // textBox.setText("Halo");

        // Input input = new Input();
        // input.disable();

        // System.out.println(textBox.getText());
        // System.out.println(input.isEnabled());

        // inheritance (textbox punya method isEnabled seperti Input)
        // System.out.println(textBox.isEnabled());

        // System.out.println(textBox.toString());

        // Input input = new Input();
        // Input input2 = new Input();

        // System.out.println(input == input2); // false
        // System.out.println(input.equals(input2)); // false
        // System.out.println(input2);

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        // System.out.println(point1.equals(point2));

        // return alamat
        System.out.println(point1.hashCode());
        Input[] inputs = { new TextBox(), new CheckBox() };

        for (int i = 0; i < inputs.length; i++) {
            inputs[i].render();
        }

    }

    public static void show(Input input) {
        if (input instanceof TextBox) {
            TextBox textBox = (TextBox) input;
            textBox.setText("Text sudah diganti");
        }

        System.out.println(input);
    }
}
