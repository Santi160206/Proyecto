import java.util.Scanner;
  import static java.lang.System.exit;
public class main{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int Contraseña, Id, op;
        System.out.println(" Bienvenido a la libreria libros y revistas ");
        System.out.println("seleccione: 1)Propietario  2)Usuario   3)Editorial");
        Id = sc1.nextInt();
        int intentos = 0;
        if (Id == 1) {
            do {
                System.out.println("Ingrese contraseña");
                Contraseña = sc1.nextInt();
                intentos++;
            } while (Contraseña != 1234 && intentos <= 3);
            if (intentos <= 3) {
                System.out.println("Bienvenido jefe");
                System.out.println("Que desea observar \n1)Inventario ordenado alfabeticamente \n2)Depocitar más libros al Inventario   \n3)Listado de ventas");
                op = sc1.nextInt();
                if (op == 1) {

                } else {
                    if (op == 2) {

                    } else {
                        if (op == 3) {

                        }
                    }
                }
            } else {
                System.out.println("El numero de intentos fue excedido");
                System.exit(0);
            }
        } else {
            if (Id == 2) {
                System.out.println("Bienvenido usuario");
                System.out.println("como desea realizar su busqueda?");
                System.out.println("1)Informacion Bibliografica respecto a un libro  2)Busqueda por autor   3)Busqueda por letra");
                op = sc1.nextInt();
                if (op == 1) {

                } else {
                    if (op == 2) {

                    } else {
                        if (op == 3) {

                        }
                    }
                }
            }
        }
    }

}

    






    


