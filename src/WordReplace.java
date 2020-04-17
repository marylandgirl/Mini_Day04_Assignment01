import java.util.Scanner;
import java.util.Arrays;

public class WordReplace {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String[] words;
        String str;
        boolean quit = false;
        do {
            System.out.println("Enter your text or 'q' to quit:");
            str = keybd.nextLine();

            if (str.equals("q"))
                quit = true;
            else {
                words = str.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals("the"))
                        words[i] = "BE";
                }
                System.out.println(Arrays.toString(words).replaceAll(",", "")
                        .replaceAll("\\[","").replaceAll("\\]",""));
            }
        } while (!quit);
    }
}

