/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1ex;

/**
 *
 * @author Miguel
 */
public class Automovil {
    private String color;
    private int numeroDePuertas;
    private int cilindraje;
   private float motor;
    private String modelo;
    
    public Automovil (){
        color = "Rojo";
        numeroDePuertas= 4;
        cilindraje=6;
        motor=2.4f;
        modelo="Spark";
    
    }
    public Automovil(String color, int numeroDePuertas, int cilindraje, float motor, String modelo){
        this.color = color;
        this.numeroDePuertas=numeroDePuertas;
        this.cilindraje= cilindraje;
        this.motor=motor;
        this.modelo=modelo;
    }
    
    //Color Getter and Setter
    
    public String obtenColor() {
        return color;
    }
    
    public void ponColor(String color) {
        if(color==null||"".equals(color)){
            this.color="Sin color definido";
        }else{
        this.color=color;
        }
    }
    
    //CilindrajeGetter and Setter
    
    public int obtenCilindraje(){
        return this.cilindraje;
    }
    
    public boolean ponCilindraje(int cilindraje){
        switch (cilindraje){
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
                    this.cilindraje=cilindraje;
                    return true;
            default:
                return false;
        }
        
    }
    
    //motor Getter and Setter
    public float obtenMotor(){
        return this.motor;
    }
    
    public void ponMotor(float motor){
        if(motor>0f&&motor<=3.5f){
            this.motor=motor;}
else{
            this.motor=0f;
    }
}

    //numeroDePuertas Getter and Setter
    public float obtenNumeroDePuertas(){
        return this.numeroDePuertas;
    }
    
    public boolean ponNumeroDePuertas(int numeroDePuertas){
        if(numeroDePuertas>0f&&numeroDePuertas<=5){
            this.numeroDePuertas=numeroDePuertas;
        return true;}
else{
            return false;
    }
}
    //modelo Getter and Setter
    public String obtenModelo(){
        return this.modelo;
    }
    
    public void ponModelo(String modelo){
        if(modelo==null||modelo==""){
            this.modelo="Sin modelo definido";
        }else{
        this.modelo=modelo;
        }
}

    public void frenar (){
    
    
    }
    public void acelerar(){
    
    
    }

}

