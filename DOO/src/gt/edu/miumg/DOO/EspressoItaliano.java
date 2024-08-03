package gt.edu.miumg.DOO;

public class EspressoItaliano extends  Cafe{

    public  EspressoItaliano(String nombre, String tamano, double precio, int intensidad){
        super(nombre, tamano, precio);
    }
    @Override
    public  void Preparar(){
        System.out.println("Preparando espreso italiano.");

    }

    @Override
    public void  Servir(){
        System.out.println("Sirviendo espreso italiano.");

    }
}