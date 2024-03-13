import java.io.IOException;
import java.util.Scanner;

public class GameType {
    public boolean multiplayer;
    public boolean singleplayer;
    public static String solution;
    public GameType(char x) throws IOException {

        if(x == 'S'){
            singleplayer = true;
            multiplayer = false;
            singleplayer();
        } else if (x == 'M') {
            multiplayer = true;
            singleplayer = false;
            multiplayer();
        }
    }
    Scanner skaner = new Scanner(System.in);
    public void singleplayer() throws IOException {
        System.out.println("WYBRANO TRYB SINGLEPLAYER!");
        System.out.println("WYBIERZ POZIOM TRUDNOŚCI LOSOWYCH SŁÓW!\nE - Łatwy\nM - Średni\n H - Ciężki");
        RandomWord losowe = new RandomWord(skaner.next().charAt(0));
        solution = losowe.randomword();
    }

    public void multiplayer() throws IOException {
        System.out.println("WYBRANO TRYB MULTIPLAYER!");
        System.out.println("WYBIERZ POZIOM TRUDNOŚCI LOSOWYCH SŁÓW!\nE - Łatwy\nM - Średni\n H - Ciężki");
        RandomWord losowe = new RandomWord(skaner.next().charAt(0));
        System.out.println("WPISZ LICZBĘ GRACZY (2 - 4)!");
        int l = skaner.nextInt();
        System.out.println("WPISZ DO ILU MAKSYMALNIE PUNKTÓW TOCZY SIĘ ROZGRYWKA - JEŚLI KTOŚ OSIĄGNIĘ TĘ LICZBĘ TO WYGRYWA");
        int m = skaner.nextInt();
        ScoreBoard tablica = new ScoreBoard(l, m);
        solution = losowe.randomword();
    }


}
