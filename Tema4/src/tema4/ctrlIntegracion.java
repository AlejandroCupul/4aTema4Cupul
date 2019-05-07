/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Arturo
 */
public class ctrlIntegracion {
    
    private csEntrada entrada;

    public ctrlIntegracion(csEntrada entrada) {
        this.entrada = entrada;
    }
    
    private double fx(double x) {
        //return Math.sqrt(1 + Math.pow(x, 2));
        //return Math.pow(Math.E, -1*Math.pow(x, 2));
        return Math.pow(x, 3) - 2*Math.pow(x,2) + x + 2;
       
    }
    
    public double Simpson() {
        double integral;
        double suma1 = 0, suma2 = 0;

        double fa = this.fx(this.entrada.getA());
        double fb = this.fx(this.entrada.getB());

        for (int i = 1; i < this.entrada.getN(); i++) {
            if(i % 2 == 0){
                suma2 += this.fx(this.entrada.getH() * i + this.entrada.getA());
            }else{
                suma1 += this.fx(this.entrada.getH() * i + this.entrada.getA());
            }
        }
        
        integral = (fa + (4*suma1) + (2*suma2) + fb) * (this.entrada.getH() / 3);
        return integral ;
    }
}

    
