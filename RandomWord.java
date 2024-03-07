import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.IOException;

public class RandomWord {

    private String diff;
    public RandomWord(String difficulty) {
        diff = difficulty;
    }

    public String randomword() throws IOException {
        String word = null;

        switch(diff){

            case "E":
                word = randomLineFromFile("easy");
                break;

            case "M":
                word = randomLineFromFile("medium");
                break;

            case "H":
                word = randomLineFromFile("hard");
                break;

        }

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
