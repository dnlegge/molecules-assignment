package uk.co.dnlegge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculate {
    private BufferedReader bufferedReader;
    private int lineCount = 0;
    private CalculatedOutput output;


    public Calculate() throws IOException {
        final String pathToDir = "./src/main/resources/";
        bufferedReader = new BufferedReader(new FileReader(pathToDir + "sampleInput.txt"));
        output = new CalculatedOutput(pathToDir);
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

    public int getINTVal() throws IOException {
        lineCount++;
        String line = null;
        try {
            line = bufferedReader.readLine();
            return Integer.parseInt(line);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error parsing an expected integer at line " + lineCount);
            if (line != null) {
                System.out.println("Expecting integer found " + line);
            }
            throw e;
        }
    }

    public String getStringVal() throws IOException {
        lineCount++;
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading line " + lineCount);
            throw e;
        }
    }

    public CalculatedOutput getOutput() {
        return output;
    }
}
