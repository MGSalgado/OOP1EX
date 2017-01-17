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
public class BankAccount {
    private String tipoDeCuenta;
    private boolean comision;
    private boolean cheques;
    private int saldoMinimo;
    private String promocion;
 
    public BankAccount(){
        tipoDeCuenta = "Debit";
        comision= false;
        cheques= false;
        saldoMinimo= 3000;
        promocion = "Gana con Banamex";

    }
    
    public BankAccount(String tipoDeCuenta, boolean comision, boolean cheques, int saldoMinimo, String promocion){
        this.tipoDeCuenta=tipoDeCuenta;
        this.comision=comision;
        this.cheques=cheques;
        this.saldoMinimo=saldoMinimo;
        this.promocion=promocion;
    }
    
    //tipoDeCuenta Getter and Setter
    
    public String obtenTipoDeCuenta(){
        return tipoDeCuenta;
    }
    public void ponTipoDeCuenta(String tipoDeCuenta){
        if("null".equals(tipoDeCuenta)||"".equals(tipoDeCuenta)){
            this.tipoDeCuenta="Cuenta Generica";
        }else{
            this.tipoDeCuenta=tipoDeCuenta;
        }
    }
    
    //comision Getter and Setter
    
    public boolean obtenComision(){
        return comision;
    }
    public void ponComision(boolean comision){
        this.comision=comision;
    }
    
    //cheques Getter and Setter
    
    public boolean obtenCheques(){
        return cheques;
    }
    
    public void ponCheques(boolean cheques){
        this.cheques=cheques;
    }
    
    //saldo minimo Setter and Getter
    
    public int obtensSaldoMinimo(){
        return saldoMinimo;
    }
    
    public void ponSaldoMinimo(int saldoMinimo){
        this.saldoMinimo=saldoMinimo;
    }
    
    //promocion Getter and Setter
    
    public String obtenPromocion(){
        return promocion;
    }
    
    public void ponPromocion(String promocion){
        this.promocion=promocion;
    }
}
