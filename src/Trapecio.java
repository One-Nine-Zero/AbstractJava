public class Trapecio extends Figura {
    private double diagonalma, diagonalme;

    public Trapecio (String tipo, double diagonalma, double diagonalme) {
        super(tipo);
        this.setDiagonalma(diagonalma);
        this.setDiagonalme(diagonalme);
    }

    public void setDiagonalma(double diagonalma) {
        this.diagonalma = diagonalma;
    }

    public void setDiagonalme(double diagonalme) {
        this.diagonalme = diagonalme;
    }

    public double getDiagonalma() {
        return diagonalma;
    }

    public double getDiagonalme() {
        return diagonalme;
    }

    public double area() {
        return (double) (this.diagonalma * this.diagonalme) / 2;
    }
    
}
