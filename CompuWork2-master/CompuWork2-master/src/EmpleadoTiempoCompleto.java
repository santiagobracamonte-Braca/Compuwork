public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, int codigoEmpleado, double salario) {
        super(nombre, codigoEmpleado, salario);
    }

    @Override
    public String trabajar() {
        return "Empleado de tiempo completo trabajando jornada completa.";
    }

}
