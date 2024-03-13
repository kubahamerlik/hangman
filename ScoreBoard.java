public class ScoreBoard {
    int liczbagraczy;
    int max_punktow;
    int currentplayer;

    boolean win;

    static int[][] tablica;

    public ScoreBoard(int l, int m) {
        liczbagraczy = l;
        max_punktow = m;
        stworz_tablice();
    }

    public void stworz_tablice() {
        tablica = new int[liczbagraczy][1];
    }

    public void dodaj_punkty(int g, int p){
        tablica[g][1]++;
    }

    public boolean czyKtosWygral(){
        for(int i = 0; i < liczbagraczy; i++)
            if (tablica[i][1] >= max_punktow) {
                return true;
            }
        return false;
    }

//    public void wyswietlpunkty(){
//        for(int i = 0; i < liczbagraczy; i++){
//            System.out.println("Player" + i + " score: " + tablica[i][1]);
//        }
//    }


    }
