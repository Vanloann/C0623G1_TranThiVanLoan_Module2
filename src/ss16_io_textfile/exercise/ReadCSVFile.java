package ss16_io_textfile.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {
    public static final String FILE_PATH = "D:\\C0623G1_LoanTTV_Module2\\untitled\\src\\ss16_io_textfile\\exercise\\countries.csv";
    public static List<String> readFile(String filePath) {
        List<String> string = new ArrayList<>();
        File file = null;
        BufferedReader br = null;
        FileReader fileReader = null;
        try {
            file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                string.add(line);
            }
            return string;
        } catch (IOException e) {
            e.printStackTrace();
            return string;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return string;
        }
    }

    public static void printCountry(List<String> countries) {
        for (String data : countries) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        printCountry(readFile(FILE_PATH));
    }
}
