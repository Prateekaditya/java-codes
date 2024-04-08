import java.io.*;

public class KiitFileHandler {

    public static void main(String[] args) throws IOException {
        String sentence = "Kiit is the best university in the world I love Kiit";

        // Write to Kiit.txt using PrintWriter
        writeUsingPrintWriter(sentence, "Kiit-1.txt");

        // Read from Kiit.txt using FileReader and BufferedReader
        String reversedSentence = readAndReverse(new File("Kiit-1.txt"));

        // Write uppercase to kiit-2.txt using FileWriter
        writeUpperCaseToFile(reversedSentence.toUpperCase(), "kiit-2.txt");

        System.out.println("Operations completed successfully!");
    }

    public static void writeUsingPrintWriter(String data, String filename) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(filename);
        writer.println(data);
        writer.close();
    }

    public static String readAndReverse(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        return reverseString(sb.toString());
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void writeUpperCaseToFile(String data, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(data);
        writer.close();
    }
}
