import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers as string format with whitespace between between them: ");
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        int length = strings.length;
        if (length <= 100 && strings[length - 1].equals("0")) {
            System.out.println("Output is: " + Arrays.stream(strings)
                    .mapToInt(Integer::parseInt)
                    .average().getAsDouble());
        }else{
            System.out.println("Unknown format");
        }
    }
}
