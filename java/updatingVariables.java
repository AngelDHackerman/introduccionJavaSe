import javax.swing.text.Style;

public class updatingVariables { 
  public static void main(String[] args) {
    int salary = 1000;
      // bono de $200;
    int bonus = 200;
    salary = salary + bonus;

    System.out.println(salary);

      // pension: $50 descuento 
    salary = salary - 50;
    System.out.println(salary);

      // 2 horas extra $30 c/u
      // comida: $45. 
    salary = salary + (2 * 30) - 45;
    System.out.println(salary);

        // Actualizando cadenas de texto: 

    String empleado = "Angel Hernandez";
    empleado = empleado + " Santiago";

    System.out.println(empleado);

    empleado = "Dario " + empleado;
    System.out.println(empleado);
  }
}
