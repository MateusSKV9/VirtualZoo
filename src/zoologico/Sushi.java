package zoologico;

import javax.swing.JOptionPane;

public class Sushi extends Comida {

    private String tipo;

    public Sushi() {
        this.setTipo(JOptionPane.showInputDialog(null, "Digite o tipo de Sushi - Gunkan | Joe: "));
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
