package questao10;

abstract class Shape {
 
    public abstract double area();

    public abstract double perimetro();
}


class Circulo extends Shape {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends Shape {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return comprimento * largura;
    }

    @Override
    public double perimetro() {
        return 2 * (comprimento + largura);
    }
}
    //classe Principal
public class TesteShape {

    

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);

        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Perímetro do círculo: " + circulo.perimetro());
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());
    }
}
