package model;

public interface Item {

    public int getId();
    public void setId(int id);

    public int getQuantity();
    public void setQuantity(int quantity);

    public String getName();
    public void setName(String name);
 
    public String itemToGenString();
    public String itemToString();

}