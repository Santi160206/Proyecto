import java.util.Scanner;

public class Libreria {

    static String[]libreria=new String[10];
    Scanner sc2=new Scanner(System.in);

    public void AbastecimientoLibros(String[]v){
        int libros, cantidad=0,i;

        System.out.println("Ingrese la cantidad de libros");
        libros=sc2.nextInt();

    for(i=0; i<v.length;i++){
       System.out.println("Ingrese el titulo del libro");
        v[i]=sc2.next();
        cantidad+=libros;
       }
    }
    
    public void LibrosAgotados(){}
    public void VentaLibros(){}
    public void BibliografiaLibro(){}

        }
