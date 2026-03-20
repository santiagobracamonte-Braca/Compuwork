public class Empleado {

    private String nombre;
    private int codigoEmpleado;
    private double salario;

    public Empleado(String nombre, int codigoEmpleado, double salario) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void actualizarSalario(double nuevoSalario) {
        salario = nuevoSalario;
    }

    public String trabajar() {
        return "El empleado está realizando sus actividades.";
    }

}
