

public class Actividad2Compuwork {

    public static void main(String[] args) {

        try {

            EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Carlos Perez", 101, 2500);

            Departamento dep = new Departamento("Sistemas");

            dep.asignarEmpleado(emp1);

            dep.mostrarInformacion();

            ReporteDesempenio reporte = new ReporteDesempenio(emp1, "Excelente rendimiento");

            reporte.generarReporte();

        } catch (Exception e) {

            System.out.println("Error del sistema: " + e.getMessage());

        }

    }

}
