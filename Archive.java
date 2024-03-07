public class Archive {

    private char[] tablica;
    private int n = 0;



    public Archive(int size){
        tablica = new char[size];
    }
    public void zapisz(char x){
        if( n == tablica.length - 1)
            expand();
        tablica[n++] = x;
    }

    private void expand(){
        //System.err.println("Powiększam 2x");
        char [] nt = new char[tablica.length + 5];

        if (n >= 0) System.arraycopy(tablica, 0, nt, 0, n);

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