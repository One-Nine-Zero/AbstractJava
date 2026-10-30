public class Circulo extends Figura {
    private double radio;
    private double pi;

    public Circulo (String tipo, double radio, double pi) {
        super (tipo);
        this.setRadio(radio);
        this.pi = 3.14;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override 
    public double area() {
        return (double) (this.radio * this.radio) * this.pi;
    }
    
}
