package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyList {
    private List<Item> list;

    public ToyList() {
        this.list = new ArrayList<Item>();
        Toy toy = new Toy();
        toy.setId(1);
        toy.setName("cat");
        toy.setQuantity(10);
        list.add(toy);
    }

    public Item get(int index) {
        return this.list.get(index);
    }

    public int size() {
        return this.list.size();
    }

    public String removeItem(int idForMenu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idForMenu) {
                Item removedToy = list.get(i);
                list.remove(i);
                return "Удален: " + removedToy.itemToString() + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String addToy(int id, String name, int quantity) {
        Item itemToAdd = new Toy(list, id, name, quantity);
        this.list.add(itemToAdd);
        return "Добавлен: " + itemToAdd.itemToString() + "\n";
    }

    public String itemListToString(){
        String result = "";
        for (int i = 0; i < this.list.size(); i++){
            result = result + list.get(i).itemToString() + "\n";
        }
        return result;
    }

    public String itemListGenToString() {
        String result = "";
        Random random = new Random();
        int num = random.nextInt(50);
        String str = "" + num;
        result = itemToGenString() + str + "\n";
        return result;
        
    }

    private String itemToGenString() {
        String res = "";
        res = "id Вашего приза:";
        return res;
    }

}