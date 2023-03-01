package model;

public class Save {

    public String addCsv(ToyList list, int idForMenu){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idForMenu){
                SaveCsv csv = new SaveCsv();
                csv.saveAs(list.get(i).itemToString());
                return "Записан в csv файл: " + list.get(i).itemToString() + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }
}