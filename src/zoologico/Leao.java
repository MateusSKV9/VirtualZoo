package zoologico;

import javax.swing.JOptionPane;

public class Leao extends VirtualPet {

    private String juba;

    public Leao() {
        this.setJuba(JOptionPane.showInputDialog(null, "Digite o tipo de juba do leão | Pequena | Média | Grande: "));
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Roar, grrr!");
    }

    public String getJuba() {
        return juba;
    }

    public void setJuba(String juba) {
        this.juba = juba;
    }

}
