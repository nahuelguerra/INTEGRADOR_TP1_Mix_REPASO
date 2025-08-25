package ej_integrador;

import java.util.Scanner;

/**
 *
 * @author JuanmaPC
 */
public class Verde extends Castor implements MamaPata{
    
    private double pico;
    private double patas;
    private String nombre;
    
    public Verde (String nombre, double pico, double patas, double cola, double velocidad){
        super(cola, velocidad);
        this.nombre = nombre;
        this.pico = pico;
        this.patas = patas;
    }

    public double getPico() {
        return pico;
    }

    public void setPico(double pico) {
        this.pico = pico;
    }

    public double getPatas() {
        return patas;
    }

    public void setPatas(double patas) {
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void tocarOrgano(){
        System.out.println("Do-Re-Mi");
//        Scanner sc = new Scanner(System.in);
        try {
            System.in.read();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Fa-Sol-La-Si");
    }
    
    public void TocarGuitorgan(){
        tocarGuitarra();
        tocarOrgano();
        System.out.println("cuac cuaac…!");
    }
    
}

