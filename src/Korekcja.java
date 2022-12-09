import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Korekcja {
    public void sumyKolekcji()
    {
        ArrayList<Integer>lista= new ArrayList<>();
        int suma=0;
        int zakoncz=0;
        int liczbaC;
        do{
            System.out.println("Wprowadz liczbe calkowita: ");
            Scanner liczba = new Scanner(System.in);
            liczbaC=liczba.nextInt();
            lista.add(liczbaC);
            lista.sort(Collections.reverseOrder());
            System.out.println(lista);
            suma+=liczbaC;
            System.out.println("Suma: "+suma);
            if(suma==64)
            {
                lista.remove(0);
                System.out.println("Lista po usunieciu najwiekszej z liczb: ");
                System.out.println(lista);
            }
            /*System.out.println("Jesli chcesz zakonczyc, wprowadz 1: ");
            Scanner koniec = new Scanner(System.in);
            zakoncz=koniec.nextInt();*/

        }while(zakoncz!=1);

    }
}
