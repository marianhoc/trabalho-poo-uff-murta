package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author copes
 */
public class Venda {
    private Caixa caixa;
    private Funcionario operario; // é necessario ??   ja existe funcionario dentro de CAIXA 
    private Item [] listoDeItens;    
    private int total;    // 
    private TipoPagamento formaDePagamento; 
    private int valorEntregue;  // trocado?  
      //  ADICIONAR DATA E HORA 

    public Venda(Caixa caixa, Funcionario operario, Item[] listoDeItens, int total, TipoPagamento formaDePagamento, int valorEntregue) {
        this.caixa = caixa;
        this.operario = operario;
        this.listoDeItens = listoDeItens;
        this.total = total;
        this.formaDePagamento = formaDePagamento;
        this.valorEntregue = valorEntregue;
    }
      
    
    
    //====================================================
    //========= setters and getters ======================
    //====================================================

    public Caixa getCaixa() {
        return caixa;
    }
    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    public Funcionario getOperario() {
        return operario;
    }
    public void setOperario(Funcionario operario) {
        this.operario = operario;
    }
    public Item[] getListoDeItens() {
        return listoDeItens;
    }
    public void setListoDeItens(Item[] listoDeItens) {
        this.listoDeItens = listoDeItens;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public TipoPagamento getFormaDePagamento() {
        return formaDePagamento;
    }
    public void setFormaDePagamento(TipoPagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    public int getValorEntregue() {
        return valorEntregue;
    }
    public void setValorEntregue(int valorEntregue) {
        this.valorEntregue = valorEntregue;
    }
    
    // ================ END OF====================
    //============setters and getters=============
    //============================================ 

}
