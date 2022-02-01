public class namingJava2 {
    public static void main(String[] args) {
        int cellphone = 333377777;
        System.out.println(cellphone);

        String $countryName = "colombia";
        String _backgrounColor = "green";
        System.out.println($countryName);
        System.out.println(_backgrounColor);

        // ! String _backgroun-Color = "blue"; // Error

        String currency$ = "Q";
        String background_Color = "blue";
        System.out.println(currency$);
        System.out.println(background_Color);

        // * Asi se definen las Constantes en Java

        final int POSITION = -5;
        System.out.println(POSITION);
    }
}
