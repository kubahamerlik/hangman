public class Wyswietl{
    private char[][] wisielec[] = {

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '_', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '(', ' ', ')',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '(', ' ', ')',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '(', ' ', ')',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '/', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '(', ' ', ')',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '/', '|', '\\',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '(', ' ', ')',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '/', '|', '\\',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '/', ' ', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},

            },

            {
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '(', ' ', ')',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '/', '|', '\\',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', '/', ' ', '\\',},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ',},
                    {'_', '_', '_', '|', '_', '_', '_', ' ', ' ', ' ',},
            }
    };
    private int rozmiar = 10;
    public void wyswietl(int step){
        for(int i = 0; i < this.rozmiar; i++){
            for(int j = 0; j < this.rozmiar; j++){
                System.out.print(this.wisielec[step][i][j]);
            }
            System.out.print("\n");
        }
    }

}
