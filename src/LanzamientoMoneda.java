public class LanzamientoMoneda extends Lanzamiento {
    public LanzamientoMoneda() {
        max = 2;
        min = 0;
    }

    public void lanzar() {
        //Mostrar animacion.
        this.numero = get_numero_random(this.min, this.max);
        this.mostrar_resultado(this.numero);
    }

    private static void mostrar_resultado(int resultado) {
        switch (resultado) {
            case 0:
                System.out.println("cara");
                break;
            case 1:
                System.out.println("cruz");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
}
