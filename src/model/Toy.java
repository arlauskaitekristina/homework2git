package model;

import java.util.List;

public class Toy implements Item {

    private int id;
    private String name;
    private int quantity;

    public Toy(List<Item> list, int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Toy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String itemToString(){
        String res = "";
        res = "id: " + this.id + "\n" + "Название игрушки: " + this.name + "\n" +
        "Количество: " + this.quantity +"\n";
        return res;
    }

    @Override
    public String itemToGenString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemToGenString'");
    }
}