package view;

import presenter.Presenter;
public class MenuImplement {
    private Presenter presenter = new Presenter();

    public void doSomething(String userSelect){

        Console input = new Console();

        if (userSelect.equals("1")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            String name = input.inputKey(MenuText.Name);
            int quantity = Integer.parseInt(input.inputKey(MenuText.Quantity));
            presenter.addToy(id, name, quantity);
        }

        else if (userSelect.equals("2")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            presenter.removeToy(id);
        }

        else if (userSelect.equals("3")) {
            presenter.consolePrintAllToys();
        }

        else if (userSelect.equals("4")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            presenter.addCsv(id);
        }
        else if (userSelect.equals("5")) {
            presenter.generatorToys();
        }
    }
}