package zoologico;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Lobo extends VirtualPet {

    private int presa;

    public Lobo() {
        this.setPresa(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de presas do lobo: ")));
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Aauuuuuuuu!");
    }

    public int getPresa() {
        return presa;
    }

    public void setPresa(int presa) {
        this.presa = presa;
    }

}
