package gt.edu.miumg.DOO;

import java.util.ArrayList;
import java.util.List;

public abstract class Sucursal {
    private static String Nombre;
    private String Especialidad;
    private static String Direccion;

    protected Sucursal(String direccion,String nombre) {
        Sucursal.Nombre = nombre;
        Sucursal.Direccion = direccion;
    }

    public abstract void Agregar_Empleado(Empleado empleado);
    public abstract void Agregar_Equipo(Equipo equipo);

    public abstract void Agregar_Especialidad(Cafe cafe);

    public abstract void Agregar_Ingrediente();


}
