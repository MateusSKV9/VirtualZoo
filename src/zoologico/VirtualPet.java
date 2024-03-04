package zoologico;

import javax.swing.JOptionPane;

public class VirtualPet {

    //ATRIBUTOS
    private String nome;
    private double totalCaloria = 100;
    private boolean VermeNaMaca;

    //MÉTODOS PRINCIPAIS
    public VirtualPet() {
        this.criarPet();
    }

    public void criarPet() {
        this.setNome(JOptionPane.showInputDialog(null, "Digite o nome do seu pet "));
    }

    public void emitirSom() {

    }

    public void alimentar() {
        if (this.getTotalCaloria() == 100) {
            JOptionPane.showMessageDialog(null, "O seu pet não pode ser alimantado pois suas calorias são iguais a 100. Prossiga para exercitá-lo.");
            this.praticar();
        } else {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção de comida\n" + "1▶ Maçã\n" + "2▶ Sorvete\n"
                    + "3▶ Sushi\n" + "4▶ Cancelar\n"));
            switch (op) {
                //MAÇÃ
                case 1:
                    double n = 1 + Math.random() * (10 - 1);
                    int valor = (int) n;
                    if (valor % 3 == 0) {
                        this.setTotalCaloria(this.getTotalCaloria() - 0.5 * this.getTotalCaloria());
                        JOptionPane.showMessageDialog(null, "Que pena! Seu animal foi alimentado com uma maçã podre e perdeu calorias!");
                        if (this.getTotalCaloria() <= 0) {
                            JOptionPane.showMessageDialog(null, "Meus pêsames... Seu pet morreu! Clique em 'OK' para criar um novo pet.");
                            this.criarPet();
                        }
                    } else {
                        this.setTotalCaloria(this.getTotalCaloria() + 0.5 * this.getTotalCaloria());
                        JOptionPane.showMessageDialog(null, "Uhul! Seu animal foi alimentado com sucesso e ganhou calorias.");
                        if ((this.getTotalCaloria() + 0.5 * this.getTotalCaloria()) > 100) {
                            this.totalCaloria = 100;
                        }
                    }
                    break;
                //SORVETE
                case 2:
                    Sorvete s = new Sorvete ();                    
                    this.setTotalCaloria(this.getTotalCaloria() + 15);
                    JOptionPane.showMessageDialog(null, "Seu animal foi alimentado com sucesso e ganhou 15 calorias.");
                    if (this.getTotalCaloria() > 100) {
                        this.totalCaloria = 100;
                    }
                    break;
                //SUSHI
                case 3:
                    Sushi h = new Sushi();
                    this.setTotalCaloria(this.getTotalCaloria() + 12);
                    JOptionPane.showMessageDialog(null, "Seu animal foi alimentado com sucesso e ganhou 12 calorias!");
                    if (this.getTotalCaloria() > 100) {
                        this.totalCaloria = 100;
                    }
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ops! A opção inserida é inválida. Tente novamente.");
            }
        }
    }

    public void praticar() {
        if (this.totalCaloria <= 20) {
            JOptionPane.showMessageDialog(null, "O pet está com fome, alimente-o antes de prosseguir com as atividades.");
            this.alimentar();
        } else {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número referente à prática\n" + "(1) Caminhar\n" + "(2) Saltar\n"
                    + "(3) Cancelar\n"));

            switch (acao) {
                case 1:
                    caminhar();
                    break;
                case 2:
                    saltar();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ops! A opção inserida é inválida. Tente novamente.");
            }
        }
    }

    public void caminhar() {
        if (this.totalCaloria > 10) {
            this.setTotalCaloria(this.getTotalCaloria() - 10);
            JOptionPane.showMessageDialog(null, "Pronto! Seu pet praticou e perdeu 10 calorias. ");
        } else if (this.getTotalCaloria() <= 15) {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ei, cuidado! Se seu pet fizer essa prática ele morrerá.\n" + "Digite: \n"
                    + "(1) Para prosseguir com a prática\n" + "(2) Para alimentá-lo.\n" + "(3) Para cancelar.\n"));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Meus pêsames... Seu pet morreu! Clique em 'OK' para criar um novo pet.");
                    break;
                case 2:
                    alimentar();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ops! Opção inválida. Tente novamente.");
            }
        }
    }

    public void saltar() {
        if (this.totalCaloria > 20) {
            this.setTotalCaloria(this.getTotalCaloria() - 20);
            JOptionPane.showMessageDialog(null, "Pronto! Seu pet praticou e perdeu 20 calorias. ");
        } else if (this.getTotalCaloria() <= 25) {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ei, cuidado! Se seu pet fizer essa prática ele morrerá.\n"
                    + "-----------------------------------------------------------------------\n" + "DIGITE: \n"
                    + "(1) Para prosseguir com a prática\n" + "(2) Para alimentá-lo.\n" + "(3) Para cancelar.\n"));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Meus pêsames... Seu pet morreu. Clique em 'OK' para escolher outro pet.");
                    this.criarPet();
                    break;
                case 2:
                    alimentar();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ops! Opção inválida. Tente novamente.");
            }
        }
    }

    //MÉTODOS ESPECIAIS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotalCaloria() {
        return totalCaloria;
    }

    public void setTotalCaloria(double totalCaloria) {
        this.totalCaloria = totalCaloria;
    }
}
