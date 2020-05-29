package OOP.src;

import java.util.ArrayList;

public class Buah {
    private String name;
    private int price;
    private int stock;

    public static int buahCount;
    // public static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public Buah(String name, int price, int stock) {
        setName(name);
        setPrice(price);
        setStock(stock);

        buahCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;

    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't below 0");
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock can't below 0");
        }
        this.stock = stock;
    }

}