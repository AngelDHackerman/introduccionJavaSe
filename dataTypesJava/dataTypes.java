public class dataTypes { 
  public static void main(String[] args) {
    // int n = 1234345645678678;   // Error el numero es demasiado grande!. 

    int n = 1234567890; // * int puede cubrir hasta 10 digitos NO mas.
    long nLong = 123456789012345678L; // * long es para numeros mas grandes pero se necesita una L al final para que se tome como un tipo de dato long.

    double nDouble = 123.123434564567; // ? declarar decimales este es usado para mucha PRECISION en el calculo.
    float nFloate = 123.12343456F; // ? tambien declara decimales pero se necesita de la F al final para que lo reconozca como double.

    System.out.println(n);
    System.out.println(nLong);
    System.out.println(nDouble);
    System.out.println(nFloate);

  }
}