import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class RandomWord {
    private static boolean correct;
    private char diff;

    Scanner skaner = new Scanner(System.in);
    public RandomWord(char difficulty) {

        while((difficulty != 'E') && (difficulty != 'M') && (difficulty != 'H')){
            System.out.println("WPROWADŹ POZIOM TRUDNOŚCI JESZCZE RAZ!");
            difficulty = skaner.next().charAt(0);
        }

        diff = difficulty;
    }

    public String randomword() throws IOException {

        String word = switch (diff) {
            case 'E' -> randomLineFromFile("easy");
            case 'M' -> randomLineFromFile("medium");
            case 'H' -> randomLineFromFile("hard");
            default -> null;
        };
        return word;
    }

    public String randomLineFromFile(String filename) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        int lineCount = 0;
        Random random = new Random();

        // Zliczanie liczby linii w pliku
        while (reader.readLine() != null) {
            lineCount++;
        }

        // Losowanie liczby od 1 do liczby linii w pliku
        int randomLineNumber = random.nextInt(lineCount) + 1;

        // Ponowne otwarcie pliku do odczytu
        reader.close();
        reader = new BufferedReader(new FileReader(filename));

        // Przejście przez plik i zatrzymanie się na losowej linii
        String line;
        int currentLine = 0;
        while ((line = reader.readLine()) != null) {
            currentLine++;
            if (currentLine == randomLineNumber) {
                reader.close();
                return line;
            }
        }

        // Jeśli np. plik był pusty
        reader.close();
        return null;

    }
}
