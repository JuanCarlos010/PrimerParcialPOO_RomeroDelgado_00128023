import org.w3c.dom.ls.LSOutput;

public class TelefonoMovil extends Definicion{
    //Atributos
    private String marca;
    private double tamanio;

    //Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }



    //Consturctor
    public TelefonoMovil(){
        super();
        marca = "";
        tamanio = 0;
    }

    //Sobrecarga del constructor

    public TelefonoMovil(int gen, String modelo, double precio,String marca, double tamanio) {
        super();
        this.marca = marca;
        this.tamanio = tamanio;
    }


    //Metodo
    public void enceder(){
        System.out.println("Encendiendo sistema");
    }

}
