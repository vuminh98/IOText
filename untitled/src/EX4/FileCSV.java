package EX4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileCSV {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("CSV1.txt"));
            String s = "1 AU Australia";
            String[] values = s.split("\\s");
            System.out.println(values[0]);
            bw.write(s);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
