import java.util.Scanner;

public class Singleplayer {
    static boolean win;
    static int step;
    public void gameplay(String solution){
        Word w = new Word(solution, solution.length());
        Scanner scanner = new Scanner(System.in);
        Wyswietl wyswietl = new Wyswietl();
        Archive tab = new Archive(1);
        char znak;
        step = 0;
        win = false;

        while(step < 10 && !win){
            System.out.println("Wprowadź literę:)");
            w.wyswietl();
            System.out.println("LICZBA BŁĘDÓW:" + step);
            System.out.println();
            znak = scanner.next().charAt(0);

            if (tab.sprawdzCzyByla(znak)) {
                System.out.println("JUŻ PODAŁEŚ TĄ LITERĘ, SPRÓBUJ JESZCZE RAZ");
                znak = scanner.next().charAt(0);
            }

            tab.zapisz(znak);

            if (w.sprawdzam(znak)) {
                System.out.println("Brawo! udało ci się zgadnąć literę!");
                tab.wyswietl();
                System.out.println();
            } else {
                System.out.println("Niestety, podanej przez ciebie litery nie ma w haśle:)");
                wyswietl.wyswietl(step);
                tab.wyswietl();
                step++;
            }

            if (w.solved()) {
                win = true;
            }

        }
    }
}
