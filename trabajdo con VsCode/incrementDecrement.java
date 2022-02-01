public class incrementDecrement { 
  public static void main(String[] args) {
    int lives = 5; 
    lives--;  //Decremento
    System.out.println(lives); // 4

    lives++; //Incremento
    System.out.println(lives); // 5 

    // * Operador en Prefijo.
        // Gana un regalo por ganar una vida 

    // int gift = 100 + lives++; // 104
    int gift = 100 + ++lives; // 106

    System.out.println(gift);
  }
}
