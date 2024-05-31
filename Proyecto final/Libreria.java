import java.util.Scanner;

public class Libreria {
    static String[]libreria=new String[10];

  //String Titulo, Autor, Apellido, Precio, Editorial, ISBN, CopyRight, Disponibles, Estado;
  int vector,c=0,i,j,libros=0;
  int cantidad=0,Id,servicio,password;
  String imp,sis="no",hay="si";

    public void AbastecimientoLibros(){
        

        Scanner sc= new Scanner(System.in);

        System.out.println("Bienvenido a Librerias libros y revistas");

        for(int p=0; p<1;){
        System.out.println("Seleccione: 1)Propietario  2)Usuario   3)Editorial");
        Id=sc.nextInt();

        if(Id==1){
            
            do {
                System.out.println("Ingrese contraseña");
            password=sc.nextInt();
            c++;

            if(password==1234){
                System.out.println("Bienvendio al sistema?");
                System.out.println("¿Desea la impresion del inventario?");
                imp=sc.next();
                System.out.println("");
                if(imp.equals("si")){
                    
                for(i=0; i<9; i++){
                    
                System.out.print(libreria[i]+"\t");
                System.out.println("");
            }
        }
            }else{
                System.out.println("Contraseña incorrecta");
        }
                
            } while (password!=1234 && c<=12);
           
            

     } else if(Id==2){
            System.out.println("Bienvenido, ingrese el tipo de servicio:");
            System.out.println("1)Busqueda de libro");
            servicio=sc.nextInt();

        }else if(Id==3){
            System.out.println("Bienvenido, ingrese el tipo de servicio:");
            System.out.println("1)Abastecimiento");
            servicio=sc.nextInt();
            
            while (hay.equals("si")) {
                System.out.println("Cuantos libros desea ingersar");
                cantidad=sc.nextInt();

                
                    for(j=0;j<cantidad;j++){
                    System.out.print("Ingrese titular del libro");
                    libreria[i]=sc.next();
                    /*System.out.print("\n Ingrese Autor del libro");
                    lib.libreria[1][j]=sc.next();
                    System.out.print("\nIngrese Apellido del libro");
                    lib.libreria[2][j]=sc.next();
                    System.out.print("\nIngrese Precio del libro");
                    lib.libreria[3][j]=sc.next();
                    System.out.print("\nIngrese Editorial del libro");
                    lib.libreria[4][j]=sc.next();
                    System.out.println("\nIngrese ISBN del libro");
                    lib.libreria[5][j]=sc.next();
                    System.out.print("\nIngrese CopyRight del libro");
                    lib.libreria[6][j]=sc.next();
                    System.out.print("\nIngrese Disponibles del libro");
                    lib.libreria[7][j]=sc.next();
                    System.out.print("\nIngrese Estado del libro");
                    lib.libreria[8][j]=sc.next();*/
                
                }

                System.out.println("¿Desea ingresar mas libros?");
                hay = sc.next();

                libros+=cantidad;
                System.out.println("La cantidad delibros es de:"+libros);
        }
             //hay="si"; El valor final debe ser positivo, porque si es negativo no entra al ciclo
           

        }else{
            System.out.println("Opcion no valida");

        }

        
    }









    
    }
    public void LibrosAgotados(){}
    public void VentaLibros(){}
    public void BibliografiaLibro(){}

        }
        

    
    

    

