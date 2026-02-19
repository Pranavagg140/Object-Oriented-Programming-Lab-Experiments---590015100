package Lab6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class readandchange {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("sample.txt");

        int ch;
        System.out.println("Old File Content:\n");

        while((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();


        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter new data:");
        String newdata = sc.nextLine();


        FileWriter fw = new FileWriter("sample.txt",true);
        fw.write("\n" + newdata);
        fw.close();


        FileReader fr2 = new FileReader("sample.txt");

        System.out.println("\nUpdated File Content:\n");

        while((ch = fr2.read()) != -1) {
            System.out.print((char) ch);
        }

        fr2.close();

        System.out.println("\n\nNew data added successfully!");
    }
}
