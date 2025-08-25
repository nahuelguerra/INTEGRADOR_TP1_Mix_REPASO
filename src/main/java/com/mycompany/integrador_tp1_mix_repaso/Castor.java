package com.mycompany.integrador_tp1_mix_repaso;

public class Castor {
    
    protected double cola;
    protected double velocidad;
    
    public Castor (double cola, double velocidad){
        this.cola = cola;
        this.velocidad = velocidad;
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public void nadar(){
        System.out.println("Nadando a una velocidad de " + velocidad);
    }
    
    public void tocarGuitarra(){
        System.out.println("Tocando 3 cuerdas");
        for(int i = 0; i < 3; i++){
            System.out.println("Toca cuerda " + ((Math.random() * 6) + 1 ));
        }
    }
}
