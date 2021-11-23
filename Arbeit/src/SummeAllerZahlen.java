import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeAllerZahlen<summe> {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bis zu welcher Zahl soll die Summe berechnet werden: ");
        int bis = Integer.parseInt(bufferedReader.readLine());
        int summe = 0;
        for (int i =1; i <= bis; i++) {
            summe = summe + i;
        }
        System.out.println("summe for-Schleife: "+ summe);

        summe = 0;
        int i = 0;
        while (i<=bis) {
            summe = summe + i;
            i++;
        }
        System.out.println("summe while-Schleife: "+summe);

        summe= 0;
        i= 0;
        do {
            summe = summe +i;
            i++;
        }while (i <=bis);
        System.out.println("summe do-Schleife:"+summe);
    }

}
