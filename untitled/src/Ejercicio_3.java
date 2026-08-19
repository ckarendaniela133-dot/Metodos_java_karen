public class Ejercicio_3 {

    public static void main(String[] args) {
        double area = calcularAreaRectangulo(5, 3);
        System.out.println("El area del rectangulo es: " + area);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

}