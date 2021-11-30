import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in)) ;
        double x;
        System.out.println("zahl1 eingeben");
        x= Double.parseDouble(bufferedReader.readLine());
        BufferedReader bufferedReader2= new BufferedReader(new InputStreamReader(System.in)) ;
        double y;
        System.out.println("zahl2 eingeben");
        y= Double.parseDouble(bufferedReader2.readLine());

                double summe = (x+y);
                double differenz = (x-y);
                double produkt = (x*y);
                double Quotient = (x/y);
                System.out.println("x= "+x);
                System.out.println("y= "+y);
                System.out.println("summe = "+summe);
                System.out.println("differenz = "+differenz);
                System.out.println("produkt = "+produkt);
                System.out.println("Quotient= "+Quotient);

            }


    }
