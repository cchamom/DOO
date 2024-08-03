package gt.edu.miumg.DOO;

public abstract class Cafe {
    protected String nombre;
    protected String tamano;
    protected double precio;

    public Cafe(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }
    public  abstract  void  Preparar();

    public abstract void Servir();

}

