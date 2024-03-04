package zoologico;

import javax.swing.JOptionPane;

public final class Girafa extends VirtualPet {

    private double altura;

    public Girafa() {
        this.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura da girafa: ")));
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "iiirrrí, rilinchin!");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
