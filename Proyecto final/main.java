mport static java.lang.System.exit;
import java.util.Scanner;

public class ProyectoLibreria {
    public static void main(String[] args) {
        int Contraseña,op;
        Libros lib = new Libros();
        Scanner sc1 = new Scanner(System.in);
        System.out.println(" Bienvenido a la libreria libros y revistas ");
        System.out.println("Bienvenido jefe");
        int intentos = 0;
            do {
                System.out.println("Ingrese contraseña");
                Contraseña = sc1.nextInt();
                intentos++;
            } while (Contraseña != 1234 && intentos <= 3);
