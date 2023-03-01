package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveCsv implements ISave {

    public File file = new File("Toys.csv");

    @Override
    public void saveAs(String toy){
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(toy);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File getFile() {return file;
    }

    public void setFile(File file) {this.file = file;
    }
}