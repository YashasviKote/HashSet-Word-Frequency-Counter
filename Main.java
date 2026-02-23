import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            WordAnalyzer analyzer = new WordAnalyzer();
            analyzer.analyze(sentence);
        }
    }
}
