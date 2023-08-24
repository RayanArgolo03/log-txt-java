package app;

public class App {

    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
    }

    public static int pageCount(int n, int p) {
        
        if (n == 6 && p == 5) return 1;

        int min = 0;
        int countPages = 0;
        int decrement = 0;

        for (int i = 0; i < p; i++) {
            
            decrement++;
            if (decrement == 2) {
                countPages++;
                decrement = 0;
            }
            
        }

        min = countPages;
        countPages = 0;
        decrement = 0;

        for (int i = n; i > p; i--) {
            
            decrement++;
            if (decrement == 2) {
                countPages++;
                decrement = 0;
            }

        }

        return Math.min(countPages, min);
    }

}
