import java.util.Scanner;

public class Libreria {

    Inventario inv= new Inventario();

    int i,j,PPrecio, cont,PUnidInv;
    int Contraseña, Id, op, cantidad=0;
    String Busqueda;
    char letra;

    //Variables sebas
    String PNombre,PApellido,PTitulo,PISBN,PEditorial,PFechaCo;
 
    
    static String[]libreria=new String[100];
    Scanner sc2=new Scanner(System.in);

  public void ventaLibros(){
    
}

    public void ordenAlfabeticamente(){
}



    public void validacionVectorLLeno(){
        int pos=0;
       for (int i = 0; i < 100; i++) {
           if ("".equals(inv.Autor[i])) {
               pos=i;
               break;
           } else {
           }
         }
           cont=pos;
           String Respu="s";
        while("s".equals(Respu)){
             System.out.println("Digite el Titulo del libro");
             PTitulo= sc2.nextLine();
             System.out.println("Digite el Nombre del autor");
             PNombre= sc2.next();
             System.out.println("Digite el Apellido del autor");
             PApellido= sc2.next();
             System.out.println("Digite el ISBN");
             PISBN= sc2.next();
             System.out.println("Digite la Editorial");
             PEditorial= sc2.next();
             System.out.println("Digite la Cantidad de Copias");
             PUnidInv= sc2.nextInt();
             System.out.println("Digite la Fecha de Copiright");
             System.out.println("Ingrese el dia");
             int dia= sc2.nextInt();
             System.out.println("Ingrese el mes");
             int mes= sc2.nextInt();
             System.out.println("Ingrese el año");
             int año=sc2.nextInt();
             if(año>=1800 && año<=2024){
                 if (mes>=1 && mes<=12) {
                        if (mes==2) {
                         if (dia>0 && dia>=1 && dia<=28) {
                             System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+año);
                             String Dia = Integer.toString(dia);
                             String Mes = Integer.toString(mes);
                             String Año= Integer.toString(año);
                             PFechaCo= Dia+Mes+Año;
                             }
                         }   
                     }else{
                         System.out.println("Mes invalido");
                         }
                    if (dia>0 && dia>=1 && dia<=31) {
                         System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+año);
                           String Dia = Integer.toString(dia);
                           String Mes = Integer.toString(mes);
                           String Año= Integer.toString(año);
                           PFechaCo= Dia+Mes+Año;
                          }else{
                           System.out.println("Dia invalido");
                          }
                    
                      
                 } else{
                   System.out.println("Año invalido");
                     }
         
               System.out.println("Digite el Precio del libro");
               PPrecio= sc2.nextInt();
                int lugar = 0;
                int sw=0;
                 for (int j = 0; j < cont; j++) {
                 if (libreria[j].equals(PTitulo)) {
                     lugar=j;
                     sw=1;
                     break;
                 }
             }
             if (sw==1) {
                 inv.Ejemplares[lugar]=inv.Ejemplares[lugar]+PUnidInv;
                 inv.Estado[lugar]= 1;
             }else{
             libreria[lugar]= PTitulo;
             inv.Autor[lugar]=PNombre;
             inv.Apellido[lugar]=PApellido;
             inv.ISBN[lugar]= PISBN;
             inv.Ejemplares[lugar]= PUnidInv;
             inv.FechaCopyright[lugar]=PFechaCo;
             inv.Precio[lugar]=PPrecio;
             inv.Estado[lugar]=1;
             cont+=1;
             }
             System.out.println("Desea ingresar otro libro?(S/N)");
             Respu = sc2.next();
         }
     
    
}
        }
