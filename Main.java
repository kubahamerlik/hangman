import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Wyswietl wyswietl = new Wyswietl();

        System.out.println("WITAMY W GRZE HANGMAN!!! ");
        System.out.println("\nWYBIERZ TRYB GRY: \n Singleplayer -> wpisz S   Multiplayer -> wpisz M\n");
        char t = scanner.next().charAt(0);

        GameType game = null;
        if (Objects.equals(t, 'S') || Objects.equals(t, 'M')) {
            GameType gameType = new GameType(t);
            System.out.println("lol");
        } else {
            while (!Objects.equals(t, 'S') && !Objects.equals(t, 'M')) {
                System.out.println("MUSISZ WYBRAĆ TRYB SINGLEPLAYER LUB MULTIPLAYER WCISKAJĄC ODPOWIEDNIO KLAWISZE\n S - SINGLEPLAYER, \n M - MULTIPLAYER");
                t = scanner.next().charAt(0);
                game = new GameType(t);
            }
        }


        int step = 0;

        assert game != null;
        String word = game.solution;
        Word s1 = new Word(word, word.length());
        Archive tab = new Archive(1);
        char znak;

        //while(game.multiplayer )

        while (step < 10) {

            //pobieranie litery z wejścia
            System.out.println("Wprowadź literę:)");
            s1.wyswietl();
            System.out.println("LICZBA BŁĘDÓW:" + step);

            System.out.println();
            znak = scanner.next().charAt(0);

            if (tab.sprawdzCzyByla(znak)) {
                System.out.println("JUŻ PODAŁEŚ TĄ LITERĘ, SPRÓBUJ JESZCZE RAZ");
                znak = scanner.next().charAt(0);
            }

            tab.zapisz(znak);

            if (s1.sprawdzam(znak)) {
                System.out.println("Brawo! udało ci się zgadnąć literę!");
                tab.wyswietl();
                System.out.println();
            } else {
                System.out.println("Niestety, podanej przez ciebie litery nie ma w haśle:)");
                wyswietl.wyswietl(step);
                tab.wyswietl();
                step++;
            }

            if (s1.solved()) {
                step = 999;
            }

        }

        if (step == 10) {
            System.out.println("!!!!GAME OVER!!!!");
            System.out.print("HASŁO TO: " + game.solution + "!!!!!");
        } else if (step == 999) {
            System.out.println("BRAWO!!!!WYGRAŁEŚ/AŚ!!!!!!");
        }

    }
}