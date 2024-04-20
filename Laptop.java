public class Laptop extends Definicion{
    //Atributos
    private String marca;
    private String tipo;


    //Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Consturctor
    public Laptop(){
        super();
        marca = "";
        tipo = "";
    }

    //Sobrecarga del constructor

    public Laptop(int gen, String modelo, double precio, String marca, String tipo) {
        super();
        this.marca = marca;
        this.tipo = tipo;
    }


    //Metodos

    public void encederLaptop(){
        System.out.println("Encendiendo laptop");
    }

    public void encenderDesktop(){
        System.out.println("Encendiendo desktop");
    }
}
