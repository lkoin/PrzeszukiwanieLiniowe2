import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Przeszukiwanie zbioru liczbowego");
        System.out.println("Podaj wielkosc tablicy");
        int sizeTab = scanner.nextInt();
        int[] numberTab = new int[sizeTab];


        for (int i = 0; i < sizeTab; i++) {
            if (i % 10 == 0) System.out.println();
            numberTab[i] = (int) (Math.random() * 100);
            System.out.print(numberTab[i]+ ", ");
        }
//
//        if (findNumeber(numberTab)) {
//            System.out.println("Szukana liczba jest podzielna przez 5");
//        }
//        else {
//            System.out.println("Szukana liczba nie jest podzielna przez 5 ");
//        }

        System.out.println("Podane liczby sa podzielne przez 5 \n "+findNumeber(numberTab));
    }

    public static String findNumeber(int[] numberTab) {

        int n= numberTab.length;
        String liczby = "";
        for (int i=0;i<n;i++) {
            if (numberTab[i] % 5 == 0) {
                int liczba2 = numberTab[i];
               liczby =toString(liczba2);
               return liczby;

            }
            else
            {
                return 0;
            }

        }
        return 0;
    }

}
//        while (i<n && numberTab[i]!= lookedForNumber) i++;
//        if (i==n) {
//            return false;
//        }
//        else {
//            return true;