package Lab6;
import java.io.*;

public class FileCopyAppend {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample.txt");
            FileWriter fw = new FileWriter("sample2.txt", true);

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("Data appended successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
