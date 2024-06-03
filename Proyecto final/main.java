import static java.lang.System.exit;
import java.util.Scanner;

public class ProyectoLibreria {
    public static void main(String[] args) {
        Inventario inv= new Inventario();
        int Contraseña,op;
        LIbros lib = new LIbros();
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
                     System.out.println("Que desea observar: \n1)Llenar la libreria \n2)Vender libros \n3)Libros en orden Alfabetico \n4)Bibliografia de un libro \n5)Listado de libros \n6)Listado de ventas \n7)Busqueda por autor \n8)salir");
                     op = sc1.nextInt();
                     while(op!=8){
                         if (op==1) {
                             lib.validacionVectorLLeno();
                             lib.llenadodeLibros();
                             }else{
                                 if (op==2) {
                                     lib.venderLibros();
                                     }else{
                                         if (op==3) {
                                             lib.ordenarPorTitulo();
                                             }else{
                                                 if (op==4) {
                                                     lib.Bibliografia();
                                                     }else{
                                                         if (op==5) {
                                                             lib.Listadolibros();
                                                             }else{
                                                                  if (op==6) {
                                                                     lib.listaDeVentas();
                                                                     }else{
                                                                         if (op==7) {
                                                                             lib.buscarporAutor();
                                                                             }
                                                                         }
                                                                 }
                                                         }
                                                 }
                                         }
                                 }
                         System.out.println("Que desea observar: \n1)Llenar el vector \n2)Vender libros \n3)Libros en orden Alfabetico \n4)Bibliografia de un libro \n5)Listado de libros \n6)Listado de ventas \n7)Busqueda por autor \n8)salir");
                         op = sc1.nextInt();
                         }
                     }else{
                         System.out.println("El numero de intentos fue excedido");
                         System.exit(0);
                         }
    }
 }
