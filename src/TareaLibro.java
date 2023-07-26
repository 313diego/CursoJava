import java.util.Scanner;

public class TareaLibro {

    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el título del libro:");
        var Titulo = sc.nextLine();
        System.out.println("Proporciona el nombre del autor:");
        var Autor = sc.nextLine();
        System.out.println("El libro " + Titulo + " pertenece al autor " + Autor);

    }

}
