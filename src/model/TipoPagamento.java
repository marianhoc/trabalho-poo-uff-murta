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
public abstract class TipoPagamento {
    private boolean cartao;
    private boolean cash;


public abstract void paga();

}
