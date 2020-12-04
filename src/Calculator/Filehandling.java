package Calculator;

import java.io.*;
import java.util.Scanner;

public class Filehandling {

    public void save(CalData data) throws IOException {
        File file = new File("src/logCalculator.txt");
        //PrintWriter output = new PrintWriter(file);
        FileWriter output = new FileWriter(file, true);
        // Nu skal vi bare skrive data
        output.append(data.date + " " + data.dataScreen + "\n");
        System.out.println(data.date + " " + data.dataScreen + "\n");

        output.close();
    }

    public CalData load() throws FileNotFoundException {
        File file = new File("src/logCalculator.txt");
        Scanner input = new Scanner(file);
        CalData data = new CalData();
        data.dataScreen = input.next();

        return data;
    }
}
