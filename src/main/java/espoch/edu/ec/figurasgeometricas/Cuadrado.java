/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.figurasgeometricas;


public class Cuadrado {
    public double lado;
    public Cuadrado(double lado){
        this.lado=lado;
    }
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return 4*lado;
    }
    public double lado(){
        return lado;
    }
}
