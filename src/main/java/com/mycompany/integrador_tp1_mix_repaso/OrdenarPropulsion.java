/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.integrador_tp1_mix_repaso;

import java.util.Comparator;

/**
 *
 * @author JuanmaPC
 */
public class OrdenarPropulsion implements Comparator<Azul>{
    
    @Override
    public int compare(Azul orni1, Azul orni2) {
        if(orni1.getPropulsion() > orni2.getPropulsion()) return 1;
        if(orni2.getPropulsion() > orni1.getPropulsion()) return -1;
        return 0;
    }     
    
}
