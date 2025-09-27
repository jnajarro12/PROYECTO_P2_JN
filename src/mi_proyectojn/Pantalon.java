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
public class Pantalon extends Producto{
    //Atributos
    private String Marca;
    private String Material;
    private String Corte;
    
    //Constructor
    public Pantalon(String Codigo, String Nombre, double Precio, String Talla, String Color, String Stock, String Marca, String Material, String Corte) {
        super(Codigo, Nombre, Precio, Talla, Color, Stock);
        this.Marca = Marca;
        this.Material = Material;
        this.Corte = Corte;
    }
    
    //creacion de metodos getters y setters
    public String getMarca() {return Marca;}
    public void setMarca(String Marca) {this.Marca = Marca;}
   
    public String getMaterial() {return Material;}
    public void setMaterial(String Material) {this.Material = Material;}

    public String getCorte() {return Corte;}
    public void setCorte(String Corte) {this.Corte = Corte;}

    @Override
    public String toString() {
        return "Pantalon," + getCodigo() + "," + getNombre() + "," + getPrecio() + "," + 
                getTalla() + "," + getColor() + "," + getStock() + "," + Marca + "," + Material + "," + Corte;
    }
    
    public String mostrarDT() {
    return "Pantalón - " + super.mostrarDT() +
           "  Marca : " + Marca + "  Material : " + Material + "  Corte : " + Corte;
    }
    
}
