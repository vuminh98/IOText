package EX3;


import EX2.ReadAndWriteFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class CopyFile {

    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("String-copy1.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("String.txt"));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
