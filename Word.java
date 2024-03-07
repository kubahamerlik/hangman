public class Word {
    private char[] slowo;
    private char[] wybrane;
    private int dlugosc;
    private boolean isthere = false;

    public Word(String s, int d){
        slowo = new char[d];
        wybrane = new char[d];
        dlugosc = d;
        for(int i = 0; i < d; i++){
            slowo[i] = s.charAt(i);
            wybrane[i] = '_';
        }
    }
    public boolean sprawdzam(char c){

        isthere = false;

        for(int i = 0; i < this.dlugosc; i++){

            if(slowo[i] == c){
                wybrane[i] = c;
                isthere = true;
            } else if (Character.toUpperCase(c) == slowo[i]){
                wybrane[i] = Character.toUpperCase(c);
                isthere = true;
            } else if (Character.toLowerCase(c) == slowo[i]){
                wybrane[i] = Character.toLowerCase(c);
                isthere = true;
            }
        }

        return isthere;
    }
    public boolean solved(){
        for(int i = 0; i < this.dlugosc; i++){
            if(slowo[i] != wybrane[i]){
                return false;
            }
        }
        return true;
    }

    public void wyswietl(){
        for(int i = 0; i < this.dlugosc; i++){
            System.out.print(wybrane[i]);
        }
    }

}
