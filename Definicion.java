public class Definicion {
    int gen = 0;
    String modelo = "";
    double precio = 0;



    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Definicion() {
        gen = 0;
        modelo = "";
        precio = 0;
    }

    public Definicion(int gen, String modelo, double precio) {
        this.gen = gen;
        this.modelo = modelo;
        this.precio = precio;
    }
}
