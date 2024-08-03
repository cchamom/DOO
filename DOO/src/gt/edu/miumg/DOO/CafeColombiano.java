package gt.edu.miumg.DOO;

public class CafeColombiano extends  Cafe {

    public CafeColombiano(String nombre, String tamano, double precio, String tipoGrano) {
        super(nombre, tamano, precio);
        System.out.println("Nombre, Tamanio, Precio");
    }

    @Override
    public void Preparar() {
        System.out.println("Preparando." +nombre);
    }

    @Override
    public void Servir() {
        System.out.println("Sirviendo."+nombre);
    }

}
