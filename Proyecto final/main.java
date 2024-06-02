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
        if (intentos <= 3) {
                System.out.println("Que desea observar \n1)Inventario ordenado alfabeticamente  \n2)Listado de ventas \n3)vender un libro");
                op = sc1.nextInt();
                if (op==1) {
                    
                    lib.validacionVectorLLeno();
                    
                }else{
                    if (op==2) {
                        
                    }else{
                        if (op==3) {
                            lib.venderLibros();
                        }
                    }
                }
                 } else {
                   System.out.println("El numero de intentos fue excedido");
                   System.exit(0);
            }
        }
    }
