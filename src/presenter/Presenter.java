package presenter;

import model.ToyList;
import model.Conclusion;
import model.Save;
import view.PrintView;

public class Presenter {

    private ToyList list= new ToyList();
    private Save s = new Save();
    private Conclusion conclusion = new Conclusion();
    private PrintView print = new PrintView();

    public void consolePrintAllToys(){
        print.print(conclusion.conclusionListToString(list));}

    public void addToy(Integer id, String name, Integer quantity){
        print.print(conclusion.conclusionString(list.addToy(id, name, quantity)));}

    public void removeToy(int id){
        print.print(conclusion.conclusionString(list.removeItem(id)));}

    public void addCsv(int id){
        print.print(conclusion.conclusionString(s.addCsv(list,id)));}

    public void generatorToys(){
        print.print(conclusion.conclusionListGenToString(list));}
    }