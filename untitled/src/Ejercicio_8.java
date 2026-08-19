public class Ejercicio_8 {
    public static void main(String[] args){
        int [] tabla = generarTablaMultiplicar(5);
        for (int i = 0; i < tabla.length; i++){
            System.out.println(tabla[i]);
        }
    }
    public static int[]
    generarTablaMultiplicar(int numero){
        int[] tabla = new int[10];

        for (int i = 0; i < tabla.length; i++){
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }
}