
public class Departamento {

    private String nombre;
    private Empleado empleadoAsignado;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void asignarEmpleado(Empleado emp) throws Exception {

        if (emp == null) {
            throw new Exception("Error: no se puede asignar un empleado vacío.");
        }

        empleadoAsignado = emp;
    }

    public void mostrarInformacion() {

        System.out.println("Departamento: " + nombre);

        if (empleadoAsignado != null) {
            System.out.println("Empleado asignado: " + empleadoAsignado.getNombre());
        } else {
            System.out.println("Actualmente no hay empleados asignados.");
        }

    }

}
