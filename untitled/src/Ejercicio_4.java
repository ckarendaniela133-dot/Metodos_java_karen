public class Ejercicio_4 {

    public static void main(String[] args) {
        boolean resultado = esPar(8);
        System.out.println("El numero es par: " + resultado);
    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
