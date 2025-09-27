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
public class Camisa extends Producto{
    //Atributos
    private String Marca;
    private String Material;
    private String Diseno;
    
    //Constructor

    public Camisa(String Codigo, String Nombre, double Precio, String Talla, String Color, String Stock,String Marca, String Material, String Diseno) {
        super(Codigo, Nombre, Precio, Talla, Color, Stock);
        this.Marca = Marca;
        this.Material = Material;
        this.Diseno = Diseno;
    }
    //creacion de metodos getters y setters
    public String getMarca() {return Marca;}
    public void setMarca(String Marca) { this.Marca = Marca;}

    public String getMaterial() {return Material;}
    public void setMaterial(String Material) {this.Material = Material;}

    public String getDiseno() {return Diseno;}
    public void setDiseno(String Diseno) {this.Diseno = Diseno;}
    

    @Override
    public String toString() {
        return "Camisa," + getCodigo() + "," + getNombre() + "," + getPrecio() + "," + getTalla() + "," +
                getColor() + "," + getStock() + "," + Marca + "," + Material + "," + Diseno;
    }
    
    public String mostrarDT() {
    return "Camisa - " + super.mostrarDT() +
           "  Marca : " + Marca + "  Material : " + Material + "  Diseño : " + Diseno;
    }
    
    
    
}//fin subclase camisa
