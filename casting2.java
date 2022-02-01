public class casting2 {
    public static void main(String[] args) {
        // En un año ubique a 30 perritos
        // Cuantos perritros ubique al mes.

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs); // 2.5 perritos? imposible.

        // ESTIMACION
        int estimatedMonthlyDogs = (int) monthlyDogs; // (int) nombreVariable, asi es como se hace el casting. le quita todos los decimales
        System.out.println(estimatedMonthlyDogs);

        // EXACTITUD
        int a = 30;
        int b = 12;
        // System.out.println( a / b ); // 2, porque esta solo manejando enteros, elimina los decimales.
        System.out.println( (double) a / b ); // 2.5

        double c = (double) a / b; // sin el DOUBLE pierde la precision solo muestra 2.0
        System.out.println(c);

        char n = '1';
        int nInt = (int) n;
        System.out.println(nInt); // res 49 porque 1 es 49 en ASCII

        short nS = (short) n;
        System.out.println(nS); // res 49



    }
}
