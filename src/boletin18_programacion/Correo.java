/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_programacion;

import java.util.ArrayList;

/**
 *
 * @author Brais Núñez
 */
public class Correo extends Buzon {
    
    private String correo;
    private boolean lido; 

    public Correo() {
    }

    public Correo(String correo, boolean lido) {
        this.correo = correo;
        this.lido = lido;
    }
    
    public int numeroDeCorreos(){
        
        return listacorreo.size();
    }
    
    public void engade(Correo c){
        
        listacorreo.add(c);
    }
    
    /* public void porLer(){ 
        
        if (lido == false){
            
        System.out.println("Ten " + lido + " correos pendentes de ser lidos");
        }
        else
            lido = true;
    }*/
    
}
