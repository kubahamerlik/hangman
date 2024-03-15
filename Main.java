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

///////////////////////////////////////////////// W GAMETYPE MUSIMY PRZEJŚĆ DO SINGLEPLAYER/MULTIPLAYER - NIE TUTAJ
        //// TUTAJ ZOSTAWIŁBYM JEDYNIE KOŃCOWE NAPISY TYPU GAME OVER CZY COŚ W WERSJI SINGLEPLAYER, A W WERSJI MULTIPLAYER WYŚWIETLIŁBYM KTO WYGRAŁ.

        //assert game != null;



        if (GameType.singleplayer && (Singleplayer.step == 10)) {
            System.out.println("!!!!GAME OVER!!!!");
            System.out.print("HASŁO TO: " + GameType.solution + "!!!!!");
        } else if (GameType.singleplayer && Singleplayer.win) {
            System.out.println("BRAWO!!!!WYGRAŁEŚ/AŚ!!!!!!");
        }


    }
}