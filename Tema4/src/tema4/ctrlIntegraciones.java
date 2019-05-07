
package tema4;

public class ctrlIntegraciones {

    private csEntrada entrada;

    public ctrlIntegraciones(csEntrada entrada) {
        this.entrada = entrada;
    }

    private double fx(double x) {
        //return Math.sqrt(1 + Math.pow(x, 2));
        //return Math.pow(Math.E, -1*Math.pow(x, 2));
        return Math.pow(x, 3) - 2*Math.pow(x,2) + x + 2;
    }

    public double Trapecio() {
        double integral;
        double suma = 0;
        double fa = this.fx(this.entrada.getA());

        double fb = this.fx(this.entrada.getB());

        integral = fa + fb;
        for (int i = 1; i <= this.entrada.getN() - 1; i++) {
            suma += this.fx(this.entrada.getH() * i + this.entrada.getA());
        }
        
        integral = (integral + 2 * suma) * (this.entrada.getH() / 2);

        return integral;
    }
}
