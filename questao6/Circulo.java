package questao6;

public class Circulo {
    private double raio;
    /// deucerto aqui %10
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    //// ok
    public double getRaio() {
        return raio;
    }

    //00
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public static void main(String[] args) {
         Circulo circulo = new Circulo(5.0); ///passou9
           double area = circulo.calcularArea(); 

        System.out.println("Raio do círculo: " + circulo.getRaio());
        System.out.println("A área do círculo é: " + area); 
    }
}
