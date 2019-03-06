
    package numeros_aleatorios_enteros;

    import java.util.Random;


    public class Numeros_aleatorios_enteros {

        public static void main(String[] args) {

            System.out.println(generarAleatorio(1, 25));       

        }
        public static int generarAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }

    }
