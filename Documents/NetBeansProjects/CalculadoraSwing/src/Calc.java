/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gelso
 */
public class Calc {
    String visor;
    double resultado;
    
    //Metodos
    public Calc(){
        this.visor = "";
    }
    
    public void setVisor(String n){
        this.visor = getVisor()+ n; 
    }
    public String getVisor(){
        return this.visor;
    }
}
