/*
 Chimaltenango 26/09/2025
Programador: Jordy Najarro
PROYECTO PARCIAL 2
 */
package mi_proyectojn;

/**
 *
 * @author JordyN
 */
public class Producto {//Super clase
    //Atributos
    private String Codigo;
    private String Nombre;
    private double Precio;
    private String Talla;
    private String Color;
    private String Stock;

    //constructor

    public Producto(String Codigo, String Nombre, double Precio, String Talla, String Color, String Stock) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Talla = Talla;
        this.Color = Color;
        this.Stock = Stock;
    }
    //Metodo Getter y Setters

    public String getCodigo() {return Codigo;}
    public void setCodigo(String Codigo) {this.Codigo = Codigo;}
    
    public String getNombre() {return Nombre;}
    public void setNombre(String Nombre) {this.Nombre = Nombre;}
    
    public double getPrecio() {return Precio;}
    public void setPrecio(double Precio) {this.Precio = Precio;}
    
    public String getTalla() {return Talla;}
    public void setTalla(String Talla) {this.Talla = Talla;}
    
    public String getColor() {return Color;}
    public void setColor(String Color) {this.Color = Color;}
    
    public String getStock() {return Stock;}
    public void setStock(String Stock) {this.Stock = Stock;}
    //fin metodos getters y setters
    
    //sobreescribe el metodo toString

    @Override
    public String toString() {
         return "Producto,"+ Codigo + "," + Nombre + "," + Precio + "," + Talla + "," + Color + "," + Stock;
    }
    
    public String mostrarDT() {
    return "Producto - " +"Código : " + Codigo + "  " + "Nombre : " + Nombre + "  " +
           "Precio : Q." + Precio + "  " + "Talla  : " + Talla + "  " + "Color  : " + Color + "  " +
           "Stock  : " + Stock;
    }
    
}//fin super clase





