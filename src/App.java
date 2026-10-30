public class App {
    public static void main(String[] args) {
        polimorfismo(new Triangulo("Triangulo",4,2));
        polimorfismo(new Cuadrado("Cuadrado",3));
        polimorfismo(new Circulo("Circulo",4,2));
        polimorfismo(new Trapecio("Trapecio",4,2));
        polimorfismo(new Rectangulo("Rectangulo",4,2));
    }

    public static void polimorfismo (Figura mFigura) {
        System.out.println("Tipo: " + mFigura.getTipo());
        System.out.println("Area: " + mFigura.area() + "\n");
    }

}
