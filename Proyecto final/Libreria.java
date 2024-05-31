import java.util.Scanner;

public class Libreria {

    int i;
    int Contraseña, Id, op;
    String Busqueda;
    
    static String[]libreria=new String[10];
    Scanner sc2=new Scanner(System.in);

    public void AbastecimientoLibros(){
        int libros, cantidad=0;

        System.out.println("Ingrese la cantidad de libros");
        libros=sc2.nextInt();

    for(i=0; i<libros;i++){
       System.out.println("Ingrese el titulo del libro");
        libreria[i]=sc2.next();
        cantidad+=libros;
       }
    }

    public void BusquedaLibrosLetra(){
        do {
            
        } while (op==2);
    }

    public void BusquedaLibrosNombre(){
        do {
            for(i=0;i<libreria.length;i++){
                if(Busqueda==libreria[i]){
                    System.out.println(libreria[i]);
                    
                }

            }
            
        } while (op==3);
    }
    
    public void LibrosAgotados(){}
    public void VentaLibros(){}
    public void BibliografiaLibro(){}

        }
