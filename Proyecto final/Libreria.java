import java.util.Scanner;

public class Libreria {

    int i,j;
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

   public void BusquedaLibrosAutor(){
        System.out.println("El Nombre del autor");
           Busqueda=sc2.next();

            for(i=0;i<libreria.length;i++){
                if(Busqueda==libreria[i]){
                System.out.println(libreria[i]);
        }
      }    
}

    public void BusquedaLibrosLetra(){
        System.out.println("Ingrese Nombre del libro");
            letra=sc2.next().charAt(0);
            for(i=0;i<libreria.length;i++){
                if(Busqueda.charAt(0)==libreria[i].charAt(0)){
                System.out.println(libreria[i]);
            }
     }
}
    
    public void VentaLibros(){}
    public void BibliografiaLibro(){}

        }
