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
    String Respuc= "s";
    int PCantic;
    while("s".equals(Respuc)){
        System.out.println("Ingrese el titulo del libro");
        PTitulo= sc2.nextLine();
        System.out.println("Ingrese el nombre del autor");
        PNombre=sc2.next();
        System.out.println("Ingrese el apellido del autor");
        PApellido=sc2.next();
        System.out.println("Ingrese la cantidad de libros que desea comprar");
        PCantic=sc2.nextInt();
        int SWT=0, SWN=0, SWA=0;
        for (int i = 0; i < 100; i++) {
            if (inv.Autor[i].equals(PNombre)) {
                SWN=0;
                if (inv.Apellido[i].equals(PApellido)) {
                    SWA=0;
                    if (libreria[i].equals(PTitulo)) {
                        SWT=0;
                        if (inv.Ejemplares[i]>=PCantic) {
                            inv.Ejemplares[i]-=PCantic;
                            if (inv.Ejemplares[i]==0) {
                                inv.Estado[i]=0;
                                System.out.println("Compra exitosa");
                                break;
                                }
                           }else{
                                System.out.println("Solo contamos con "+ inv.Ejemplares[i]+"Uniadades para la venta");
                                System.out.println("Desea comprarlas?(S/N)");
                                String Resp= sc2.next();
                                if ("S".equals(Resp)) {
                                    inv.Ejemplares[i]=0;
                                    inv.Estado[i]=0;
                                    }
                                }
                        }else{
                            SWT=1;
                            }
                    }else{
                        SWA=1;
                        }
               }else{ 
                    SWN=1;
                    }
           }  
        if (SWT==1||SWA==1||SWN==1){
            System.out.println("No se encuentra el libro deseado");
            }
        System.out.println("Desea comprar otro libro?(S/N)");
        Respuc=sc2.next();
       }
}

    public void ordenAlfabeticamente(){
        String aux;
        
                  for(i=0;i<libreria.length;i++){
                    for(j=i+1;j<libreria.length;j++){
                        if(libreria[i].compareTo(libreria[j])>0){
                            aux=libreria[i];
                            libreria[i]=libreria[j];
                            libreria[j]=aux;
      
                        }
                    }
                }
                for(i=0;i<libreria.length;i++){
                System.out.println(libreria[i]);
    }
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
