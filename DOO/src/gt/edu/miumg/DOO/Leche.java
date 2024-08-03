package gt.edu.miumg.DOO;

public class Leche implements  Ingrediente{
    private String Tipo;
    private double Cantidad;

    public  Leche(String Tipo, double Cantidad){
        this.Tipo =Tipo;
        this.Cantidad = Cantidad;
    }

    @Override
    public  String Obtener_Nombre(){
        return Tipo;
    }

    @Override
    public  double Obtener_Cantidad(){
        return Cantidad;
    }

}