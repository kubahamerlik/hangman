import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Wyswietl wyswietl = new Wyswietl();
        String haslo;
        int dlugosc;

        System.out.println("\n\nJeśli chcesz losowe hasło - jako argument wywołania programu podaj jedną literę - E, M, H ");
        System.out.println("Oznaczają one poziomy trudności: E - EASY, M - MEDIUM, H - HARD!\n");

        if(args.length < 1){
            System.out.println("Proszę wprowadzić słowo do gry w wisielca:) Jeśli chcesz wpisać zdanie - oddziel słowa spacją! :)");
            haslo = scanner.nextLine();
            dlugosc = haslo.length();
            System.out.println("Zaczynamy grę: Słowo ma " + dlugosc + " znaków" );
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < args.length; i++){
                sb.append(args[i]);
                if(i != args.length - 1) {
                    sb.append(" ");
                }
            }
            haslo = sb.toString();
            dlugosc = haslo.length();
            System.out.println("ZACZYNAMY GRĘ W WISIELCA!!!");
        }

        int step = 0;
        Word s1 = new Word(haslo, dlugosc);
        Archive tab = new Archive(1);
        char znak;


        while(step < 10){

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
                System.out.println("Niestety, podanej przez ciebie litery nie ma w haśle:)");
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
            System.out.print("HASŁO TO: " + haslo + "!!!!!");
        } else if (step == 999){
            System.out.println("BRAWO!!!!WYGRAŁEŚ/AŚ!!!!!!");
        }

    }
}