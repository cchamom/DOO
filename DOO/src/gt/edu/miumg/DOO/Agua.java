package gt.edu.miumg.DOO;

public class Agua implements  Ingrediente{
    private double cantidad;

    public  Agua(double Cantidad){
        this.cantidad = Cantidad;
    }

    @Override
    public String Obtener_Nombre(){
        return  "Agua";
    }

    @Override
    public double Obtener_Cantidad(){
        return  cantidad;
    }


}