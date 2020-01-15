public class LanzamientoDado extends Lanzamiento
{
    public LanzamientoDado() {
        max = 6;
        min = 1;
    }
    public void lanzar() {
        //Mostrar animacion.
        this.numero = get_numero_random(this.min, this.max);
        this.mostrar_resultado(this.numero);
    }

    private static void mostrar_resultado(int resultado) {
        switch (resultado) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
}
