public class Ejercicio_6 {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        estudiante.nota = 4.5;
        estudiante.mostrarBoletin();

        double resultado = Estudiante.compararNotas(4.5, 3.8);
        System.out.println("La nota mayor es: " + resultado);
    }

}

class Estudiante {

    double nota;

    public void mostrarBoletin() {
        System.out.println("La nota del estudiante es: " + this.nota);
    }

    public static double compararNotas(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}
