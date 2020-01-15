import sun.nio.cs.ext.MacThai;

public class Lanzamiento
{

    int min;
    int max;
    int numero;
    public static int get_numero_random(int min, int max)
    {
        return (int)(Math.random()*max + min);
    }
}
