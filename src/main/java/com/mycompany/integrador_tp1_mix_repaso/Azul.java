/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.integrador_tp1_mix_repaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Azul extends Castor{
    
    private double propulsion;
    private String nombre;
    
    public Azul(String nombre, double cola, double velocidad){
        super(cola, velocidad);
        this.nombre = nombre;
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void nadar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola Neri como estas?");
        try{
            double prop = sc.nextDouble();
            setPropulsion(prop);
        }catch(InputMismatchException e){
            System.out.println("Error de tipo de dato: " + e.getMessage());
        }
        System.out.println("La Neri nada con una propulsion de: " + this.propulsion);
        System.out.println("La velocidad de nado de Neri es: " + this.velocidad);
    }
    
}
