package questao4;

public class Triangulo {
    private double base;
    private double altura;
    /*tudo ok */
        public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double calcularArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 4.0); 
        double area = triangulo.calcularArea(); 

        System.out.println("A área do triângulo é: " + area); 
    }
}
