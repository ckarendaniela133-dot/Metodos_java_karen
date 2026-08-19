public class Ejercicio_9 {
    public static void main(String[] args){
        String resultado = clasificarNota(4.7);
        System.out.println("resultado: " + resultado);
    }
    public static String clasificarNota(double nota){
        if (nota < 3.0) {
            return "reprobado";
        }else if(nota < 4.5){
            return "aprobado";
        }else{
            return "excelente";
        }
    }
}
