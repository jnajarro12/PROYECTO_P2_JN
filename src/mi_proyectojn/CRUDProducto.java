/*
 Chimaltenango 26/09/2025
Programador: Jordy Najarro
PROYECTO PARCIAL 2
 */
package mi_proyectojn;
import java.io.*;
import java.util.*;
/**
 *
 * @author JordyN
 */
public class CRUDProducto {
    private static final String FILE_NAME ="producto.txt";
    
    //Crear metodo para agregar datos
    public void agregarProducto(Producto producto){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))){
            bw.write(producto.toString());
            bw.newLine();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    //Crear metodo para leer datos
    public List<Producto> leer() {
        List<Producto> lista = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            String linea;
            while((linea = br.readLine())!= null){
                String[] datos = linea.split(",");
                if(datos.length < 6){
                    continue;
                }
                String tipo = datos[0];    
                if(tipo.equals("Producto")){
                    lista.add(new Producto(datos[1], datos[2], Double.parseDouble(datos[3]),
                    datos[4], datos[5], datos[6]));
                }else if(tipo.equals("Camisa")){
                    lista.add(new Camisa(datos[1], datos[2], Double.parseDouble(datos[3]),
                    datos[4], datos[5], datos[6],
                    datos[7], datos[8], datos[9]));
                }else if(tipo.equals("Pantalon")){
                    lista.add(new Pantalon(datos[1], datos[2], Double.parseDouble(datos[3]),
                    datos[4], datos[5], datos[6],
                    datos[7], datos[8], datos[9]));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    //Crear metodo para actualizar datos por codigo
    public void actualizarDatos(String Codigo, Producto nuevoProducto) {
        List<Producto> lista = leer();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Producto p : lista) {
                if(p.getCodigo().equals(Codigo)) {
                    bw.write(nuevoProducto.toString());
                }else{
                    bw.write(p.toString());
                }
                bw.newLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    //crear metodo para eliminar por codigo
    public void elimindarProducto(String Codigo){
        List<Producto> lista = leer();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Producto p : lista) {
                if (!p.getCodigo().equals(Codigo)) {
                    bw.write(p.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }    
}

