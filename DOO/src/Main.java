
import gt.edu.miumg.DOO.*;
public class Main {
    public static  void main(String[] args){

        Ingrediente granosColombianos = new Granos("Cafe colombiano", 10);
        Ingrediente agua = new Agua(300);
        Ingrediente leche = new Leche("Leche", 234);

        Cafe cafeColombiano = new CafeColombiano("Cafe colombiano", "Medio", 8.00, "Arabica" );
        Cafe espressoItaliano = new EspressoItaliano("Espresso Italiano", "Pequeño", 3.00, 3);

        Equipo maquinaCafe = new Equipo("Maquina de cafe", "Operativo");
        Empleado barista = new Empleado("Cristian", "Barista", 3500);

        Sucursal Bogota= new SucursalBogota("Sucursal de Bogota", "avenida americas");
        Sucursal Roma = new SucursalRoma("Sucursal en Roma", "calle 19");
        Bogota.Agregar_Empleado(barista);
        Bogota.Agregar_Ingrediente();
        Bogota.Agregar_Equipo(maquinaCafe);
        Bogota.Agregar_Especialidad(cafeColombiano);

        Roma.Agregar_Empleado(barista);
        Roma.Agregar_Ingrediente();
        Roma.Agregar_Equipo(maquinaCafe);
        Roma.Agregar_Especialidad(cafeColombiano);
        Equipo.reparar();
        Equipo.apagar();
        Equipo.encender();

        cafeColombiano.Preparar();
        cafeColombiano.Servir();
        espressoItaliano.Preparar();



    }
}