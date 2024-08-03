package gt.edu.miumg.DOO;

public class SucursalBogota extends Sucursal  {

    public SucursalBogota(String direccion, String nombre) {
        super(direccion, nombre);
    }

    @Override
    public void Agregar_Empleado(Empleado empleado) {
        System.out.println("Se agrego el empleado a Bogota");

    }

    @Override
    public void Agregar_Equipo(Equipo equipo) {
        System.out.println("Equipo agregado");
    }

    @Override
    public void Agregar_Especialidad(Cafe cafe) {
        System.out.println("Seagrega especialidad");



    }
    @Override
    public void Agregar_Ingrediente() {
        System.out.println("Agregando ingredentes");
    }

}

