package Heranca2;

public class Caminhao extends Veiculo{

    private int porta;

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public Caminhao(int rodas, String farol, String buzina, int porta) {
        super(rodas, farol, buzina);
        this.porta = porta;
    }

    public Caminhao(int rodas, String farol, String buzina) {
        super(rodas, farol, buzina);
    }
}
