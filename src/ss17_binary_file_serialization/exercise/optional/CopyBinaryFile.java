package ss17_binary_file_serialization.exercise.optional;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter destination file: ");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingStream(sourceFile, destFile);
//            copyFileUsingJava8Files(sourceFile, destFile);
            System.out.printf("Completed.");
        } catch (IOException e) {
            System.out.println("Cannot copy that file.");
            System.out.println(e.getMessage());
        }
    }
}
