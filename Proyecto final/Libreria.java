import java.util.Scanner;

public class Libreria {
    int Contraseña, Id, op;
    static String[]libreria=new String[10];
    Scanner sc2=new Scanner(System.in);

    public void AbastecimientoLibros(){
        int libros, cantidad=0,i;

        System.out.println("Ingrese la cantidad de libros");
        libros=sc2.nextInt();

    for(i=0; i<libros;i++){
       System.out.println("Ingrese el titulo del libro");
        libreria[i]=sc2.next();
        cantidad+=libros;
       }
    }
    
    public void LibrosAgotados(){}
    public void VentaLibros(){}
    public void BibliografiaLibro(){}

        }
