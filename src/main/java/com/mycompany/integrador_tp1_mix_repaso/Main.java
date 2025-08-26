/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.integrador_tp1_mix_repaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Carina D'Agata
 */
public class Main {

    public static void main(String[] args) {
        Verde orniVerde = new Verde("green", 15, 5.5, 6.5, 7.5);
        Azul orniAzul = new Azul("blue", 10.5, 8.5);
        Azul orniAzul2 = new Azul("blui", 11.5, 6.5);
        
        System.out.println("Ornitorrinco verde " + orniVerde.getNombre());
        orniVerde.nadar();
        orniVerde.TocarGuitorgan();
        
        System.out.println("Ornitorrinco azul " + orniAzul.getNombre());
        orniAzul.nadar();
        
        System.out.println("Ornitorrinco azul " + orniAzul2.getNombre());
        orniAzul2.nadar();
        
        Castor[] ornitorrincos = new Castor[3];
        try{
            ornitorrincos[1] = orniVerde;
            ornitorrincos[0] = orniAzul;
            ornitorrincos[2] = orniAzul2;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Los ornitohermanos estan juntos al fin...");
        }
        
        ArrayList<Azul> mejoresNadadores = new ArrayList();
        for (Castor orni : ornitorrincos){
            orni.tocarGuitarra();
            if(orni instanceof Azul){
                mejoresNadadores.add((Azul) orni);
            }
        }
        
        Collections.sort(mejoresNadadores, new OrdenarPropulsion());
        Iterator<Azul> iterator = mejoresNadadores.iterator();
        while(iterator.hasNext()){
            Azul orniAux = iterator.next();
            System.out.println("Propulsion :" + orniAux.getPropulsion());
            System.out.println("Velocidad :" + orniAux.getVelocidad());
            System.out.println("Cola :" + orniAux.getCola());
        }
    }
}

