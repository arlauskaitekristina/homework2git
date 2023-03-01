package model;

public class Conclusion implements IConclusion{

    @Override
    public String conclusionString(String str){
        return str + "\n";
    }

    @Override
    public String conclusionListToString(ToyList list) {
        String result = "";
        result = list.itemListToString();
        return result;
    }

    @Override
    public String conclusionListGenToString(ToyList list) {
        String result = "";
        result = list.itemListGenToString();
        return result;
    }
}