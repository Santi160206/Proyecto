import java.util.Scanner;
  import static java.lang.System.exit;
public class main{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Libreria lib= new Libreria();
      
      //Variables
      int i,j;
      String S="Si";
      

      do{
        
        System.out.println(" Bienvenido a la libreria libros y revistas ");
        System.out.println("seleccione: 1)Propietario  2)Usuario   3)Editorial");
        lib.Id = sc1.nextInt();
        int intentos = 0;
        if (lib.Id == 1) {
            do {
                System.out.println("Ingrese contraseña");
                lib.Contraseña = sc1.nextInt();
                intentos++;
            } while (lib.Contraseña != 1234 && intentos <= 3);
            if (intentos <= 3) {
                System.out.println("Bienvenido jefe");
                System.out.println("Que desea observar \n1)Inventario ordenado alfabeticamente \n2)Listado de ventas");
                lib.op = sc1.nextInt();
                if (lib.op == 1) {
                   String aux;
        
                  for(i=0;i<lib.libreria.length;i++){
                    for(j=i+1;j<lib.libreria.length;j++){
                        if(lib.libreria[i].compareTo(lib.libreria[j])>0){
                            aux=lib.libreria[i];
                            lib.libreria[i]=lib.libreria[j];
                            lib.libreria[j]=aux;
      
                        }
                    }
                }
                for(i=0;i<lib.libreria.length;i++){
                System.out.println(lib.libreria[i]);
            }
                  }

                } else if (lib.op == 2){
                    
                         //
                        
            } else {
                System.out.println("El numero de intentos fue excedido");
                System.exit(0);
            }
          
        } else if (lib.Id == 2) {
             
                System.out.println("Bienvenido usuario");
                System.out.println("como desea realizar su busqueda?");
                System.out.println("1)Informacion Bibliografica respecto a un libro  2)Busqueda por autor   3)Busqueda por letra");
                lib.op = sc1.nextInt();
                if (lib.op == 1) {

                } else if (lib.op == 2)  {
                  lib.BusquedaLibrosAutor();

                    } else if (lib.op == 3) {
                      lib.BusquedaLibrosLetra();
                         
                          }
            
          
        }else if (lib.Id==3){
          
            System.out.println("Bienvenido");
              System.out.println("Desea ingresar Libros?");
              System.out.println("1) si 2)No");
              lib.op= sc1.nextInt();
            if(lib.op==1){
              lib.AbastecimientoLibros();
          
            }else{
              if(lib.op==2)
                System.out.println("Muchas gracias,Hasta pronto");
                  System.exit(0);
            } 
          }
         System.out.println("Desea continuar?");
          S=sc1.next().toUpperCase();
        
      }while(S.equals("SI"));
        }
    }

    






    


