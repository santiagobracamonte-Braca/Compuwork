public class ReporteDesempenio {

    private Empleado empleado;
    private String comentario;

    public ReporteDesempenio(Empleado empleado, String comentario) {
        this.empleado = empleado;
        this.comentario = comentario;
    }

    public void generarReporte() throws Exception {

        if (empleado == null) {
            throw new Exception("No es posible generar un reporte sin empleado.");
        }

        System.out.println("\n----- REPORTE DE DESEMPEÑO -----");
        System.out.println("Nombre del empleado: " + empleado.getNombre());
        System.out.println("Evaluación: " + comentario);
        System.out.println("Actividad actual: " + empleado.trabajar());

    }

}