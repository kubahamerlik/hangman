import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Wyswietl wyswietl = new Wyswietl();
        String slowo;
        int dlugosc;

        if(args.length < 1){
            System.out.println("Proszę wprowadzić słowo do gry w wisielca:) Jeśli chcesz wpisać zdanie - oddziel słowa znakiem \"_\":)");
            slowo = scanner.next();
            dlugosc = slowo.length();
            System.out.println("Zaczynamy grę: Słowo ma " + dlugosc + " znaków" );
        } else {
            slowo = args[1];
            dlugosc = slowo.length();
            System.out.println("Zaczynamy grę: Słowo ma " + dlugosc + " znaków" );
        }

        int solved = 0;
        int step = 0;
        Word s1 = new Word(slowo, dlugosc);
        Archive tab = new Archive(1);
        char znak;

        while(step < 10){
            System.out.println("\r");
            //pobieranie litery z wejścia
            System.out.println("Wprowadź literę:)");
            s1.wyswietl();
            System.out.println();
            znak = scanner.next().charAt(0);
            tab.zapisz(znak);

            if(s1.sprawdzam(znak)){
                System.out.println("Brawo! udało ci się zgadnąć literę!");
                tab.wyswietl();
                System.out.println();
            } else {
                System.out.println("Niestety, podanej przez ciebie litery nie ma w słowie:)");
                wyswietl.wyswietl(step);
                tab.wyswietl();
                step++;
            }

            if(s1.solved()){
                step = 999;
            }

        }

        if(step == 10){
            System.out.println("!!!!GAME OVER!!!!");
            System.out.print("SŁOWO TO: " + slowo + "!!!!!");
        } else if (step == 999){
            System.out.println("BRAWO!!!!WYGRAŁEŚ/AŚ!!!!!!");
        }

    }
}