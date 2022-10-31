package EX2;

import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Module2\\JAVA IO\\untitled\\src\\EX2\\number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Module2\\JAVA IO\\untitled\\src\\EX2\\result.txt", maxValue);
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
