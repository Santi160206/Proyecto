package proyecto;


import java.util.Scanner;

public class LIbros {
    Scanner sc2= new Scanner(System.in);
   Inventario inv= new Inventario();
   String PNombre;
   String PApellido;
   String PTitulo;
   String PISBN;
   int PPrecio, cont;
   String PEditorial;
   String PFechaCo;
   int PUnidInv;
int pos=0;
   public int validacionVectorLLeno(){
       for (int i = 0; i < 100; i++) {
           if ("".equals(inv.Autor[i])) {
               pos=i;
               break;
           }
         }
        return pos;
    }

    
    public String llenadodeLibros(){
            cont = pos;
    String Respu = "s";
    while ("s".equals(Respu)) {
        if (sc2.hasNextLine()) {
            sc2.nextLine();
        }
        System.out.println("Digite el Titulo del libro");
        PTitulo = sc2.nextLine();
        System.out.println("Digite el Nombre del autor");
        PNombre = sc2.next();
        System.out.println("Digite el Apellido del autor");
        PApellido = sc2.next();
        System.out.println("Digite el ISBN");
        PISBN = sc2.next();
        System.out.println("Digite la Editorial");
        PEditorial = sc2.next();
        System.out.println("Digite la Cantidad de Copias");
        PUnidInv = sc2.nextInt();
        System.out.println("Digite la Fecha de Copiright");
        System.out.println("Ingrese el dia");
        int dia = sc2.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sc2.nextInt();
        System.out.println("Ingrese el año");
        int año = sc2.nextInt();
        if (año >= 1800 && año <= 2024) {
            if (mes >= 1 && mes <= 12) {
                if (mes == 2) {
                    if (dia > 0 && dia >= 1 && dia <= 28) {
                        System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + año);
                        String Dia = Integer.toString(dia);
                        String Mes = Integer.toString(mes);
                        String Año = Integer.toString(año);
                        PFechaCo = Dia + Mes + Año;
                    }
                }
            } else {
                System.out.println("Mes invalido");
            }
            if (dia > 0 && dia >= 1 && dia <= 31) {
                System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + año);
                String Dia = Integer.toString(dia);
                String Mes = Integer.toString(mes);
                String Año = Integer.toString(año);
                PFechaCo = Dia + Mes + Año;
            } else {
                System.out.println("Dia invalido");
            }
        } else {
            System.out.println("Año invalido");
        }

        System.out.println("Digite el Precio del libro");
        PPrecio = sc2.nextInt();

        int lugar = cont; // Asignar lugar después de verificar si el libro ya existe

        int sw = 0;
        for (int i = 0; i < cont; i++) {
            if (inv.Titulo[i].equals(PTitulo)) {
                lugar = i;
                sw = 1;
                break;
            }
        }
        if (sw == 1) {
            inv.Ejemplares[lugar] += PUnidInv;
            inv.Estado[lugar] = 1;
        } else {
            inv.Titulo[lugar] = PTitulo;
            inv.Autor[lugar] = PNombre;
            inv.Apellido[lugar] = PApellido;
            inv.ISBN[lugar] = PISBN;
            inv.Ejemplares[lugar] = PUnidInv;
            inv.FechaCopyright[lugar] = PFechaCo;
            inv.Precio[lugar] = PPrecio;
            inv.Estado[lugar] = 1;
            inv.Editorial[lugar]=PEditorial;
            cont += 1;
        }
        System.out.println("Desea ingresar otro libro?(S/N)");
        Respu = sc2.next();
    }
    return null;
}

    
    public void venderLibros(){
      String Respuc = "s";
    int PCantic;
    while ("s".equals(Respuc)) {
        if (sc2.hasNextLine()) {
            sc2.nextLine();
        }
        System.out.println("Ingrese el titulo del libro");
        PTitulo = sc2.nextLine();
        System.out.println("Ingrese el nombre del autor");
        PNombre = sc2.nextLine();
        System.out.println("Ingrese el apellido del autor");
        PApellido = sc2.nextLine();
        System.out.println("Ingrese la cantidad de libros que desea comprar");
        PCantic = sc2.nextInt();
        
        boolean libroEncontrado = false;
        
        for (int i = 0; i < 100; i++) {
            if (inv.Autor[i] != null && inv.Apellido[i] != null && inv.Titulo[i] != null) {
                if (inv.Autor[i].equals(PNombre) && inv.Apellido[i].equals(PApellido) && inv.Titulo[i].equals(PTitulo)) {
                    libroEncontrado = true;
                    if (inv.Ejemplares[i] >= PCantic) {
                        inv.Ejemplares[i] -= PCantic;
                        inv.Librosvendidos[i]= PCantic;
                        if (inv.Ejemplares[i] == 0) {
                            inv.Estado[i] = 0;
                            System.out.println("Compra exitosa");
                        }
                    } else {
                        System.out.println("Solo contamos con " + inv.Ejemplares[i] + " unidades para la venta");
                        System.out.println("Desea comprarlas? (S/N)");
                        String Resp = sc2.next();
                        if ("S".equalsIgnoreCase(Resp)) {
                            inv.Ejemplares[i] = 0;
                            inv.Estado[i] = 0;
                        }
                    }
                    break;
                }
            }
        }

        if (!libroEncontrado) {
            System.out.println("No se encuentra el libro deseado");
        }

        System.out.println("Desea comprar otro libro? (S/N)");
        Respuc = sc2.next();
    }
}
   
    public String Bibliografia(){
        System.out.println("Hola");
        String Resp="S";
        while("S".equals(Resp)){
            if (sc2.hasNextLine()) {
        sc2.nextLine();
    }
             System.out.println("Ingrese el nombre del titulo ");
              PTitulo=sc2.nextLine();
           for (int i = 0; i < 100; i++) {
            if (!"".equals(inv.Titulo[i])) {
                 if (inv.Titulo[i].equals(PTitulo)) {
                 System.out.println("El titulo es: "+ inv.Titulo[i]);
                 System.out.println("El nombre del autor es: "+ inv.Autor[i]+ inv.Apellido[i]);
                 System.out.println("El ISBN es: "+ inv.ISBN[i]);
                 System.out.println("La fecha de copyright es: "+ inv.FechaCopyright[i]);
                 break;
                 }else{
                     System.out.println("Libro no encontrado");
                 }
            }
           }
           System.out.println("Desea consultar otra bibliografia?(S/N)");
           Resp=sc2.next();
         } 
        return Resp;
    }

    
    public String Listadolibros(){
                System.out.println("Los libros son:");
    for (int i = 0; i < 100; i++) {
        if (inv.Titulo[i] != null && !"".equals(inv.Titulo[i])) {
            System.out.println(inv.Titulo[i]);
        } else {
            break;
        }
    }
    return null;
}

    public String buscarporAutor(){
    System.out.println("Hola");
    String Resp = "S";         
    while ("S".equals(Resp)) {
        sc2.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese el nombre del autor");
        PNombre = sc2.nextLine(); // Leer una línea completa
        System.out.println("Ingrese el apellido del autor");
        PApellido = sc2.nextLine(); // Leer una línea completa
        int SWI = 0;
        for (int i = 0; i < 100; i++) {
            if (!"".equals(inv.Autor[i]) && !"".equals(inv.Apellido[i])) {
                if (inv.Autor[i] != null && inv.Apellido[i] != null) {
    if (inv.Autor[i].trim().equalsIgnoreCase(PNombre.trim()) && 
        inv.Apellido[i].trim().equalsIgnoreCase(PApellido.trim())) {
        System.out.println("Los libros de este autor son: ");
                    System.out.println(inv.Titulo[i]);
                    SWI = 1;
                }
            }
        }
        if (SWI == 0) {
            System.out.println("No contamos con libros de este autor");
        }
    }
        System.out.println("Desea hacer otra búsqueda por autor?(S/N)");
        Resp = sc2.next();
}
        return Resp;
    }
    public String listaDeVentas(){
      System.out.println("Los libros son:");
    for (int i = 0; i < 100; i++) {
        if (inv.Titulo[i] != null && !"".equals(inv.Titulo[i])) {
            System.out.println(inv.Titulo[i]);
            System.out.println("numero de copias vendidas"+ inv.Librosvendidos[i]);
        } else {
            break;
        }
    }
    return null;
    }
    public void ordenarPorTitulo(){
      String auxt,auxna,auxap,auxfc,auxis,auxedi;
      int auxej,auxven,auxest;
      float auxpre;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100 - 1 - i; j++) {
            // Verificar si los elementos no son null antes de comparar
            if (inv.Titulo[j] != null && inv.Titulo[j+1] != null && inv.Titulo[j].compareTo(inv.Titulo[j+1]) > 0) {
                auxt = inv.Titulo[j];
                inv.Titulo[j] = inv.Titulo[j+1];
                inv.Titulo[j+1] = auxt;
                auxna = inv.Autor[j];
                inv.Autor[j] = inv.Autor[j+1];
                inv.Autor[j+1] = auxna;
                auxap = inv.Apellido[j];
                inv.Apellido[j] = inv.Apellido[j+1];
                inv.Apellido[j+1] = auxap;
                auxis = inv.ISBN[j];
                inv.ISBN[j] = inv.ISBN[j+1];
                inv.ISBN[j+1] = auxis;
                auxfc = inv.FechaCopyright[j];
                inv.FechaCopyright[j] = inv.FechaCopyright[j+1];
                inv.FechaCopyright[j+1] = auxfc;
                auxej= inv.Ejemplares[j];
                inv.Ejemplares[j] = inv.Ejemplares[j+1];
                inv.Ejemplares[j+1] = auxej;
                auxedi = inv.Editorial[j];
                inv.Editorial[j] = inv.Editorial[j+1];
                inv.Editorial[j+1] = auxedi;
                auxpre =inv.Precio[j];
                inv.Precio[j] = inv.Precio[j+1];
                inv.Precio[j+1] = auxpre;
                auxest = inv.Estado[j];
                inv.Estado[j] = inv.Estado[j+1];
                inv.Estado[j+1] = auxest;
                auxven = inv.Librosvendidos[j];
                inv.Librosvendidos[j] = inv.Librosvendidos[j+1];
                inv.Librosvendidos[j+1] = auxest;
            }
        }  
    }
    System.out.println("Estos son los libros en su orden alfabético:");
    for (int i = 0; i < 100; i++) {
        if (inv.Titulo[i] != null && !"".equals(inv.Titulo[i])) {
            System.out.println(inv.Titulo[i]);
            System.out.println(inv.Autor[i]);
            System.out.println(inv.Apellido[i]);
            System.out.println(inv.ISBN[i]);
            System.out.println(inv.Editorial[i]);
            System.out.println(inv.FechaCopyright[i]);
            System.out.println(inv.Precio[i]);
            System.out.println(inv.Ejemplares[i]);
            System.out.println(inv.Estado[i]);
            System.out.println(inv.Librosvendidos[i]);
        } else {
            break;
        }
    }
}
}
