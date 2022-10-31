package EX3;

import EX2.ReadAndWriteFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CountCharacter {
    static List<String> character = new ArrayList<>();
    public List<String> readFile;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("String.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Count12.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static int countCharacter (List<Integer> character) {
            int count = 0;
            for (int i = 0; i < CountCharacter.character.size(); i++) {
                count += i;
            }
            return count;
        }
    }

