package mvc.utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UtilsFile {
    public static List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))){
            String line = "";
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
            return strings;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static void writeFile(String filePath, List<String> strings) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))){
            for (String data : strings) {
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
