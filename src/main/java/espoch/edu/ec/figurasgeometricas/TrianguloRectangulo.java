/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.figurasgeometricas;


public class TrianguloRectangulo {
    public double base;
    public double altura;

    public TrianguloRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
// Métodos
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return calcularHipotenusa()+ base + altura;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String tipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && altura == hipotenusa) {
            return "Equilátero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa){
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public double base() {
        return base;
    }

    public double altura() {
        return altura;
    }
}

