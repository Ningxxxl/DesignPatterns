package Adapter.a2;

import java.io.IOException;

/**
 * @author ningxy
 * @date 2019/10/20
 */
public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("src/main/java/adapter/a2/file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "12");
            fileIO.writeToFile("src/main/java/adapter/a2/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
