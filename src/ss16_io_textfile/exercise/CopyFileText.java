package ss16_io_textfile.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {

    public static final String SOURCE_FILE_PATH = "D:\\C0623G1_LoanTTV_Module2\\untitled\\src\\ss16_io_textfile\\exercise\\source.txt";
    public static final String TARGET_FILE_PATH = "D:\\C0623G1_LoanTTV_Module2\\untitled\\src\\ss16_io_textfile\\exercise\\target.txt";

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

    public static void writeFile(String filePath, List<String> strings) {
        File file = null;
        BufferedWriter bw = null;
        FileWriter fileWriter = null;
        try {
            file = new File(filePath);
            bw = new BufferedWriter(new FileWriter(file));
            for (String data : strings) {
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if ( fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        writeFile(TARGET_FILE_PATH, readFile(SOURCE_FILE_PATH));
    }
}
