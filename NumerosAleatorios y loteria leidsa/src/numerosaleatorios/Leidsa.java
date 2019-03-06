/*
 * Los sorteos que van desde el 1 al 100 se presentaran asi mismo, siendo el 100 este mismo.
 */
package numerosaleatorios;

import java.util.Random;

/**
 *
 * @Albert Eduardo Hidalgo Taveras
 */
public class Leidsa {  
    /**
     * Todos los metodos se crearan static porque solo se
     * necesita generar los numeros y no se utilizaran mas
     * 
     * 
     * Solo se debe imprimir por pantalla cada juego, seria combeniente colocarle el titulo
     * a cada juego
     */
    public static void quinielaPale(){
        System.out.println("\nQuinielaPale y Tripleta: ");
        for(int i = 0;i<=2; i++){
            System.out.printf("%d\t",generarAleatorio(1,100));
        }
        System.out.println("\n");
    };
    public static void lotoPool(){
        /**
         * consiste en acertar 5 números de los 31 números que componen el sorteo
         */
    System.out.println("\nLotoPool: ");
        for(int i = 0;i<=2; i++){
            System.out.printf("%d\t",generarAleatorio(1,31));
        }
        System.out.println("\n");
    };
    public static void superKinoTV(){
        /**
         * Consiste en 80 bolos girando libremente en una tómbola de los cuales se extraerán 20.
         */
    System.out.println("\nSuperKinoTV: ");
        for(int i = 0;i<=19; i++){
            System.out.printf("%d\t",generarAleatorio(1,80));
            if(i==4 || i == 9 || i==14){
                System.out.println("\n");
            }
            
        }
        System.out.println("\n");
    };
    public static void pega3Mas(){
        /**
         * El juego tiene 32 bolos, del 0 al 31
         */
        System.out.println("\nPega 3 Mas: ");
        for(int i = 0;i<=2; i++){
            System.out.printf("%d\t",generarAleatorio(0,31));
        }
        System.out.println("\n");
    };
    public static void superLoto(){
    /**
     * Es un juego que consiste en acertar los tres números del sorteo de quiniela y pale de leidsa
     */
    System.out.println("\nSuper Lotto: ");
        for(int i = 0;i<=5; i++){
            System.out.printf("%d\t",generarAleatorio(1,53));
        }
        System.out.println("\n");
    };
    public static void superBingoTV(){};
    public static void kinoMAs(){};
    public static void superPale(){
    /**
     * Súper Palé Es un novedoso juego que consiste en acertar el 1er
     * premio del Sorteo de Quiniela y Palé Electrónico y el 1er premio del Sorteo de la Lotería Nacional.
     */
    };
    public static void quinielon(){};
    public static void quinielin(){};
    public static void lotto(boolean incluirMas){
        /**
         * Genera numeros aleatorios del loto
         * Si el objeto Randon a la hora de instanciarlo si no se pasa un
         * numero al constructor esto utilizara la hora del sistema 
         */
        Random random = new Random(); 
        System.out.println("\nLotto: ");
        for(int i = 0;i<=5; i++){
            System.out.printf("%d\t",generarAleatorio(1, 38));
        }
        if(incluirMas){
            System.out.println(" MAS: "+generarAleatorio(1, 10));
        }
        System.out.println("\n");
    }
    
    //Rand() % (N-M+1) + M este esta entre M y N. N superior, M inferior
    //Esta funcion debe ser privada
    //Funcion que se encarga de generar los numeros aleatorios, recibe 2 parametros que detemrinan
    //el numero dependiendo de lo que se le pase segun el sorteo.
    private static int generarAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
    
}
