import java.util.Scanner;
public class TareaLibreria {
    public static void main (String args []){
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        Scanner sc = new Scanner (System.in);

        System.out.println("¿Cual es el nombre del libro?");
        nombre = sc.nextLine();
        System.out.println("Cual es el id del libro?");
        id = sc.nextInt();
        System.out.println("¿Cual es el precio del libro");
        precio = sc.nextDouble();
        System.out.println("¿El envío es gratuito? (contesta true o false)");
        envioGratuito = sc.nextBoolean();

        System.out.println("El nombre del libro es: \n" + nombre + "\nEl id " +
                "del libro es: \n" + id + "\nEl precio del libro es: \n" +
                precio + "€ \n¿El envío es gratuito? \n" + envioGratuito
                );
    }
}
