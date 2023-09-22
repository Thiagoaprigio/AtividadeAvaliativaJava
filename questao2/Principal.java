package questao2;

interface Móvel {
    void mover();
}


class Carro implements Móvel {
    @Override
    public void mover() {
        System.out.println("Carro se movendo");
    }
}

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mover(); 
    }
}

