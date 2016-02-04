package uk.co.dnlegge;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Result {
    private BufferedWriter bufferedWriter;

    public Result(String pathToDir) throws IOException {
        bufferedWriter = new BufferedWriter(new FileWriter(pathToDir + "/sampleOutput.txt"));
    }

    public String display(double value) throws IOException {

        String output = formatValue(value);

        System.out.println(output);

        bufferedWriter.write(output);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        return output;
    }

    private String formatValue(double value) {
        final DecimalFormat decimalFormat = new DecimalFormat("#.###");
        decimalFormat.setMinimumFractionDigits(3);

        return decimalFormat.format(value);
    }

}
