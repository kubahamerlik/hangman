public class Archive {

    private char[] tablica;
    private int n;



    public Archive(int size){
        tablica = new char[size];
        n = 0;
    }
    public void zapisz(char x){
        if( n == tablica.length - 1)
            doubleSize();
        tablica[n++] = x;
    }

    private void doubleSize(){
        //System.err.println("Powiększam 2x");
        char [] nt = new char[2*tablica.length];

        for(int i = 0; i < n; i++){
            nt[i] = tablica[i];
        }
        tablica = nt;
    }

    public void wyswietl(){
        int i = 0;
        System.out.print("Wykorzystane litery: ");

        while(tablica[i] != '\u0000' && i < n){
            System.out.print(tablica[i] + ", ");
            i++;
        }
    }
}