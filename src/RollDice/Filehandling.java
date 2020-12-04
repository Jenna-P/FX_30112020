package RollDice;

import java.io.*;
import java.util.Scanner;

public class Filehandling {

    public void save(Data data) throws IOException {
        File file = new File("src/logDice.txt");
        //PrintWriter output = new PrintWriter(file);
        FileWriter output = new FileWriter(file, true);

        output.append(data.date + " " + data.diceRoll + "\n");
        System.out.println(data.date + " " + data.diceRoll);

        output.close();
    }

    public Data load() throws FileNotFoundException {
        File file = new File("src/logDice.txt");
        Scanner input = new Scanner(file);
        Data data = new Data();
        data.diceRoll = input.next();

        return data;
    }
}
