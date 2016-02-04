package uk.co.dnlegge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() throws Exception {

        String[] args = new String[]{};
        Solution.main(args);

        final String pathToTestDir = "./src/test/resources/";
        final String pathToActualDir = "./src/main/resources/";

        try (BufferedReader expectedOutputReader = new BufferedReader(new FileReader(pathToTestDir + "expectedOutput.txt"))) {
            try (BufferedReader actualOutputReader = new BufferedReader(new FileReader(pathToActualDir + "sampleOutput.txt"))) {

                assertEquals(expectedOutputReader.readLine(), actualOutputReader.readLine());
                assertEquals(expectedOutputReader.readLine(), actualOutputReader.readLine());
                assertNull(expectedOutputReader.readLine());
                assertNull(actualOutputReader.readLine());
            }
        }

    }
}