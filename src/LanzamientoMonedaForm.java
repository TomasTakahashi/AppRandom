import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LanzamientoMonedaForm extends LanzamientoMoneda {
    public JPanel panel1;
    public JLabel labelmoneda;

    public LanzamientoMonedaForm() {
        add(panel1);
        setTitle("Lanzamiento Moneda");
        setSize(300,500);

        LanzamientoMoneda lanzamientoMonedaLogica = new LanzamientoMoneda(LanzamientoMonedaForm.this);

        labelmoneda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    lanzamientoMonedaLogica.lanzar();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}