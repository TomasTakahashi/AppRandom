import javax.swing.*;

public class Lanzamiento extends JFrame
{
    int min;
    int max;
    int numero;

    public static int get_numero_random(int min, int max)
    {
        return (int)(Math.random()*max + min);
    }

    public void mostrar_lanzamiento() throws InterruptedException {
        System.out.println("Lanzando");
        sleep(1000);
    }

    public static void sleep(int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
