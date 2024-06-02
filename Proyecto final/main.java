import static java.lang.System.exit;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        int Contraseña,op;
        
        Libreria lib= new Libreria();
        Scanner sc1 = new Scanner(System.in);
        String x="SI";

        lib.llenarEspacios();

        do {
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
                    lib.ordenAlfabeticamente();
                }else{
                    if (op==2) {
                        lib.validacionVectorLLeno();
                    }else{
                        if (op==3) {
                            lib.ventaLibros();
                        }
                    }
                }
                 } else {
                   System.out.println("El numero de intentos fue excedido");
                   System.exit(0);
            }
             System.out.println("Desea continuar?");
            x=sc1.next().toUpperCase();
        }while (x.equals("SI"));
        }
    }
