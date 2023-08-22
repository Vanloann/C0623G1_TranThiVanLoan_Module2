package ss16_io_textfile.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UtilsFile {
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
//                string.add(line);
//                ReadCSVFile.printCountry(ReadCSVFile.parseCsvLine(line));
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


//    public static List<String> parseCsvLine(String countriesString) {
//        List<String> countries = new ArrayList<>();
//        if (countriesString != null) {
//            String[] country = countriesString.split(COMMA);
//            for (int i = 0; i < country.length; i++) {
//                countries.add(country[i]);
//            }
//        }
//        return countries;
//    }
//
//    public static List<String> convertToString(List<Countries> countries) {
//        List<String> countriesString = new ArrayList<>();
//        for (Countries country : countries) {
//            countriesString.add(country.getId() + COMMA + country.getCode() + COMMA + country.getName());
//        }
//        return countriesString;
//    }
//
//    public static void printCountry(List<String> countries) {
//        Countries country = new Countries();
//        System.out.println(country.getId() + COMMA + country.getCode() + COMMA + country.getName());
//    }

}
