/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mariano
 */
public class TipoPagamento {
    private boolean cartao;
    private boolean cash;

    public TipoPagamento() {
        this.cartao = false;
        this.cash = false;
    }

    
    
    public boolean isCartao() {
        return cartao;
    }

    public void setCartao(boolean cartao) {
        this.cartao = cartao;
    }

    public boolean isCash() {
        return cash;
    }

    public void setCash(boolean cash) {
        this.cash = cash;
    }

    
    
    

    
    
}
