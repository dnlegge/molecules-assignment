package uk.co.dnlegge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculate {
    BufferedReader bufferedReader;
    int lineCount = 0;
    Result output;


    public Calculate() throws IOException {
        final String pathToDir = "./src/main/resources/";
        bufferedReader = new BufferedReader(new FileReader(pathToDir + "sampleInput.txt"));
        output = new Result(pathToDir);
    }

    public static Calculation get_Prop(int ch) {
        if (ch == 1) {
            return new HeavyAtomsCalculation();
        } else if (ch == 2) {
            return new BondsCalculation();
        } else if (ch == 3) {
            return new RingsCalculation();
        } else if (ch == 4) {
            return new MolecularWeightCalculation();
        }
        return null;
    }

    public int getINTVal() {
        lineCount++;
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Error parsing an expected integer at line " + lineCount);
            throw new RuntimeException(e);
        }
    }

    public String getStringVal() {
        lineCount++;
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading line " + lineCount);
            throw new RuntimeException(e);
        }
    }


}
