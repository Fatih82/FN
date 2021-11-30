public class mathematik {
    public static void main(String[] args) {
        int radius=10;
        double flaeche= Math.pow(radius,2)*Math.PI;
        // Math.pow wird meistens verwendet um die Potzen von Zahlen zu berechenen also berechnet x hoch y
        // Math.PI Ermittlung der Kreiszahl PI gleich 3,14
        double umsaztSteuer= 34506.74;
        System.out.println(flaeche);
        System.out.println(Math.floor(umsaztSteuer));
        //
        System.out.println(Math.floor(umsaztSteuer*10)/10);
        System.out.println(Math.min(300,flaeche));
        System.out.println(Math.max(300,flaeche));
        System.out.println(umsaztSteuer*-1);
        System.out.println(Math.abs(umsaztSteuer*-1));
        System.out.println(Math.sqrt(2));
    }
}
