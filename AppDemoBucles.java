import java.util.Scanner;
/**
 *  @author - 
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{
    private static Scanner teclado = new Scanner(System.in);
    private static Utilidades utilidades;
    private static DemoBucles demoBucles;     
    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
        demoBucles = new DemoBucles();
        System.out.println("Teclee tope de aleatorios a generar [10, 15]: ");           
        int i = teclado.nextInt();
        while(i > 15 || i < 10){
            System.out.println("Error, teclee tope de aleatorios a generar [10, 15]: ");
            i = teclado.nextInt();                        
        }                    
        demoBucles.generarAleatorios(i);
        utilidades.hacerPausa();
        demoBucles.mostrarEscalera(6, 4, 12);
    }
}



