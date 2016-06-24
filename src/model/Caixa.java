/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author copes
 */
public class Caixa {                    // TODO
    private int numeroDoCaixa;          //  DUVIDAS
    private boolean isFree;             //eeses doism atributos estao seno redundantes????
    private Funcionario operario;       //

    public Caixa(int numeroDoCaixa) {
        this.numeroDoCaixa = numeroDoCaixa;
    }

    
    
    public int getNumeroDoCaixa() {
        return numeroDoCaixa;
    }

    public void setNumeroDoCaixa(int numeroDoCaixa) {
        this.numeroDoCaixa = numeroDoCaixa;
    }

    public boolean isIsFree() {
        return isFree;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }
    
    
    


    
    
    
}
