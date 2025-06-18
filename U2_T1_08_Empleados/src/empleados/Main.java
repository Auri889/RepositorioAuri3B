package empleados;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoTiempoCompleto("E045", "Ana", 7000, "vacaciones");
        Empleado emp2 = new EmpleadoPorHoras("J29H", "Carlos", 100.0, 80);

        System.out.println("Salario de Ana:" + emp1.calcularSalario());
        System.out.println("Salario de Carlos:" + emp2.calcularSalario());
    }
}
