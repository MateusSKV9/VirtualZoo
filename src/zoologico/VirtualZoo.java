package zoologico;

import javax.swing.JOptionPane;

public class VirtualZoo {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "________ SEJA BEM-VINDO(A) AO NOSSO ZOOLÓGICO VIRTUAL ________\n");

        VirtualPet animal[] = new VirtualPet[99];
        //MENU
        for (int i = 0; i <= 99; i++) {
            int pet = Integer.parseInt(JOptionPane.showInputDialog(null, "Para darmos continuidade ao game, escolha o pet de seu interesse: \n"
                    + "1 - Lobo\n"
                    + "2 - Bode\n"
                    + "3 - Girafa\n"
                    + "4 - Leão\n"
                    + "\n"));

            int op = 0;
            switch (pet) {
                case 1:
                    animal[i] = new Lobo();
                    break;
                case 2:
                    animal[i] = new Bode();
                    break;
                case 3:
                    animal[i] = new Girafa();
                    break;
                case 4:
                    animal[i] = new Leao();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro!");
            }

            //COMANDOS
            if (pet == 1 || pet == 2 || pet == 3 || pet == 4) {
                op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número referente ao comando:\n"
                        + "(1) Alimentar\n"
                        + "(2) Exercitar\n"
                        + "(3) Emitir Som\n"
                        + "(4) Escolher outro pet\n"
                        + "(5) Ver calorias\n"
                        + "(6) Sair\n"));

                do {
                    switch (op) {
                        case 1:
                            animal[i].alimentar();
                            break;
                        case 2:
                            animal[i].praticar();
                            break;
                        case 3:
                            animal[i].emitirSom();
                            break;
                        case 4:
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Calorias atuais: " + animal[i].getTotalCaloria());
                            break;
                        case 6:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ops! Não há comandos com esta numeração. Tente novamente.");
                    }
                    op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número referente ao comando:\n"
                            + "(1) Alimentar\n"
                            + "(2) Exercitar\n"
                            + "(3) Emitir Som\n"
                            + "(4) Escolher outro pet\n"
                            + "(5) Ver calorias\n"
                            + "(6) Sair\n"));
                    if (op == 6) {
                        JOptionPane.showMessageDialog(null, "Clique novamente para sair.");
                        break;
                    }
                } while (op != 4);
            }
            if (op == 6) {
                break;
            }
        }
    }
}
