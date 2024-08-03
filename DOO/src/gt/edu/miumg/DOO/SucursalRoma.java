package gt.edu.miumg.DOO;

public class SucursalRoma extends Sucursal  {
    public SucursalRoma(String direccion, String nombre) {
        super(direccion, nombre);
    }

    @Override
    public void Agregar_Empleado(Empleado empleado) {
        System.out.println("EMPLEADO: " + empleado);

    }

    @Override
    public void Agregar_Especialidad(Cafe cafe) {
        System.out.println("ESPECIALIDAD: " + cafe);

    }

    @Override
    public void Agregar_Ingrediente() {
        System.out.println("INGREDIENTE: ");

    }


    @Override
    public void Agregar_Equipo(Equipo equipo) {
        System.out.println("EQUIPO: " + equipo);

    }
}