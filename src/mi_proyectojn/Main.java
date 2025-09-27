/*
  Chimaltenango 26/09/2025
Programador: Jordy Najarro
PROYECTO PARCIAL 2
 */
package mi_proyectojn;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author JordyN
 */
public class Main {
    public static void main(String[] args) {
        CRUDProducto crud = new CRUDProducto();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do{
            //menu de opciones
            System.out.println("\n");
            System.out.println("-----CRUD TIENDA DE ROPA-----");
            System.out.println("1. Ingresar Producto");
            System.out.println("2. Leer Producto");
            System.out.println("3. Actualizar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Salir");
            System.out.print("Ingresa una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("\n");
                    System.out.println("Tipo de Producto: ");
                    System.out.println("1.Camisa");
                    System.out.println("2.Pantalon");
                    System.out.println("3.Otro");
                    System.out.print("Ingresa una opción: ");
                    int opcion2 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("\n");
                    
                    System.out.print("Codigo  : ");
                    String Codigo = teclado.nextLine();
                    System.out.print("Nombre  : ");
                    String Nombre = teclado.nextLine();
                    //validacion del precio que no sea negativo o caracter.
                    double Precio = 0;
                    boolean val = false;
                    while(!val){
                        System.out.print("Precio  : ");
                        String entrada = teclado.nextLine();
                        try {                
                            Precio = Double.parseDouble(entrada);
                            if(Precio < 0){
                                System.out.println("El precio no puede ser negativo");
                            } else {
                                val = true;
                            }
                            } catch(NumberFormatException e){
                                System.out.println("Error!! entrada inválida, ingresa un número válido.");
                            }
                    }
                    System.out.print("Talla   : ");
                    String Talla = teclado.nextLine();
                    System.out.print("Color   : ");
                    String Color = teclado.nextLine();
                    System.out.print("Stock   : ");
                    String Stock = teclado.nextLine();
      
                    Producto producto;
                    if(opcion2 == 1){
                        System.out.print("Marca   : ");
                        String Marca = teclado.nextLine();
                        System.out.print("Material: ");
                        String Material = teclado.nextLine();
                        System.out.print("Diseño  : ");
                        String Diseno = teclado.nextLine();
                        producto = new Camisa(Codigo, Nombre, Precio, Talla, Color, Stock, Marca, Material, Diseno);
                    }else if(opcion2 == 2){
                        System.out.print("Marca   : ");
                        String Marca = teclado.nextLine();
                        System.out.print("Material: ");
                        String Material = teclado.nextLine();
                        System.out.print("Corte   : ");
                        String Corte = teclado.nextLine();
                        producto = new Pantalon(Codigo, Nombre, Precio, Talla, Color, Stock, Marca, Material, Corte);
                    }else{
                         producto = new Producto(Codigo, Nombre, Precio, Talla, Color, Stock);
                    }
                    crud.agregarProducto(producto);
                    //crud.agregarProducto(new Producto(Codigo, Nombre, Precio, Talla, Color, Stock));
                    break;
                case 2:
                    System.out.println("\n");
                    List<Producto> lista = crud.leer();
                    System.out.println("----Listado de Productos----");
                    //System.out.println("Codigo " + "     Nombre   " + "      Precio  " + " Talla  " + " Color  " + " Stock  ");
                    for(Producto p : lista) {
                        System.out.println(p.mostrarDT());
                        //System.out.println(p.getCodigo() +"  -  " + p.getNombre() + "  -  " + p.getPrecio() + "  -  " + p.getTalla() + "  -  " + p.getColor() + "  -  " + p.getStock());
                    }
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("Tipo de Producto a Actulizar");
                    System.out.println("1.Camisa");
                    System.out.println("2.Pantalon");
                    System.out.println("3.Otro");
                    System.out.print("Ingresa una opción: ");
                    int opcion3 = teclado.nextInt();
                    teclado.nextLine();
                   
                    System.out.println("\n");
                    System.out.print("Codigo a actualizar: ");
                    String CodigoAc = teclado.nextLine();
                    System.out.print("Nuevo Nombre  : ");
                    String nuevoNombre = teclado.nextLine();
                    //validacion del precio que no sea negativo o caracter.
                    double nuevoPrecio = 0;
                    boolean val2 = false;
                    while(!val2){
                        System.out.print("Nuevo Precio  : ");
                        String entrada = teclado.nextLine();
                        try {                
                            Precio = Double.parseDouble(entrada);
                            if(Precio < 0){
                                System.out.println("El precio no puede ser negativo");
                            } else {
                                val = true;
                            }
                            } catch(NumberFormatException e){
                                System.out.println("Error!! entrada inválida, ingresa un número válido.");
                            }
                    }
                    System.out.print("Nueva Talla   : ");
                    String nuevaTalla = teclado.nextLine();
                    System.out.print("Nuevo Color   : ");
                    String nuevoColor = teclado.nextLine();
                    System.out.print("Nuevo Stock   : ");
                    String nuevoStock = teclado.nextLine();
                    
                    Producto producto1;
                    if(opcion3 == 1){
                        System.out.print("Nueva Marca    : ");
                        String nuevaMarca = teclado.nextLine();
                        System.out.print("Nuevo Material : ");
                        String nuevoMaterial = teclado.nextLine();
                        System.out.print("Nuevo Diseño   : ");
                        String nuevoDiseno = teclado.nextLine();
                        producto1 = new Camisa(CodigoAc, nuevoNombre, nuevoPrecio, nuevaTalla, nuevoColor, nuevoStock, nuevaMarca, nuevoMaterial, nuevoDiseno);
                    }else if(opcion3 == 2){
                        System.out.print("Nueva Marca    : ");
                        String nuevaMarca = teclado.nextLine();
                        System.out.print("Nuevo Material : ");
                        String nuevoMaterial = teclado.nextLine();
                        System.out.print("Nuevo Corte    : ");
                        String nuevoCorte = teclado.nextLine();
                        producto1 = new Pantalon(CodigoAc, nuevoNombre, nuevoPrecio, nuevaTalla, nuevoColor, nuevoStock, nuevaMarca, nuevoMaterial, nuevoCorte);
                    }else{
                         producto1 = new Producto(CodigoAc, nuevoNombre, nuevoPrecio, nuevaTalla, nuevoColor, nuevoStock);
                    }
                    crud.actualizarDatos(CodigoAc, producto1);
                    //crud.actulizarDatos(CodigoAc, new Producto (CodigoAc, nuevoNombre, nuevoPrecio, nuevaTalla, nuevoColor, nuevoStock));
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.print("Codigo a eliminar : ");
                    String CodigoDel = teclado.nextLine();
                    crud.elimindarProducto(CodigoDel);
                    break;
            }
        }while(opcion!=5);//Fin do-while
        
        teclado.close();
    }
}






