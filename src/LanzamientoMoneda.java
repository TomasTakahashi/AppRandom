import java.awt.event.MouseAdapter;

public class LanzamientoMoneda extends Lanzamiento {
    String moneda;
    LanzamientoMonedaForm GUI;

    public LanzamientoMoneda() {
        max = 2;
        min = 0;
        moneda = "";
    }

    public LanzamientoMoneda(LanzamientoMonedaForm GUILanzamientoMoneda) {
        max = 2;
        min = 0;
        moneda = "";
        this.GUI = GUILanzamientoMoneda;
    }

    public void lanzar() throws InterruptedException {
        mostrar_lanzamiento();
        this.numero = get_numero_random(this.min, this.max);
        mostrar_resultado(this.numero);
    }

    @Override
    public void mostrar_lanzamiento() throws InterruptedException {
        GUI.labelmoneda.setText("Lanzando");
        super.mostrar_lanzamiento();
    }

    private void mostrar_resultado(int resultado) {
        switch (resultado) {
            case 0:
                moneda = "Cara";
                System.out.println(moneda);
                break;
            case 1:
                moneda = "Cruz";
                System.out.println(moneda);
                break;
            default:
                System.out.println("Error");
                moneda = "Error";
                break;
        }
        GUI.labelmoneda.setText(moneda);
    }
}
