package zoologico;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;
public class Bode extends VirtualPet {

    private int chifres;

    public Bode() {
        this.setChifres(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de chifres do bode: ")));
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Béééé!");
    }

    public int getChifres() {
        return chifres;
    }

    public void setChifres(int chifres) {
        this.chifres = chifres;
    }

}
