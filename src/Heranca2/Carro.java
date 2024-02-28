package Heranca2;

public class Carro extends Veiculo{

    private int porta;

    public Carro(int rodas, String farol, String buzina, int porta) {
        super(rodas, farol, buzina);
        this.porta = porta;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public Carro(int rodas, String farol, String buzina) {
        super(rodas, farol, buzina);
    }
}
