package zoologico;

import javax.swing.JOptionPane;

public class Sorvete extends Comida {

    private String sabor;

    public Sorvete() {
        this.setSabor(JOptionPane.showInputDialog(null, "Digite o sabor do sorvete: "));
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
