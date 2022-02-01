public class ifStatement {
  public static void main(String[] args) {
      boolean isBluethoothEnabled = false;
      int fileSended = 3;
      if (isBluethoothEnabled) {
          // Send file
          fileSended++;
          System.out.println("archivo enviado");
          System.out.println(fileSended);
      } else {
        System.out.println("fallo la connection bluethoot");
      }
  }
}
