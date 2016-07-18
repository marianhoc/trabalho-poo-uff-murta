/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mariano
 */
@Entity
@Table(name = "vendas_fechadas", catalog = "supermercado", schema = "")
@NamedQueries({
    @NamedQuery(name = "VendasFechadas.findAll", query = "SELECT v FROM VendasFechadas v"),
    @NamedQuery(name = "VendasFechadas.findByIdVenda", query = "SELECT v FROM VendasFechadas v WHERE v.idVenda = :idVenda"),
    @NamedQuery(name = "VendasFechadas.findByCpfFunc", query = "SELECT v FROM VendasFechadas v WHERE v.cpfFunc = :cpfFunc"),
    @NamedQuery(name = "VendasFechadas.findByCaixa", query = "SELECT v FROM VendasFechadas v WHERE v.caixa = :caixa"),
    @NamedQuery(name = "VendasFechadas.findByData", query = "SELECT v FROM VendasFechadas v WHERE v.data = :data"),
    @NamedQuery(name = "VendasFechadas.findByTotal", query = "SELECT v FROM VendasFechadas v WHERE v.total = :total"),
    @NamedQuery(name = "VendasFechadas.findByIdProdVendidos", query = "SELECT v FROM VendasFechadas v WHERE v.idProdVendidos = :idProdVendidos"),
    @NamedQuery(name = "VendasFechadas.findByIdTipoDePagamento", query = "SELECT v FROM VendasFechadas v WHERE v.idTipoDePagamento = :idTipoDePagamento")})
public class VendasFechadas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_venda")
    private Integer idVenda;
    @Basic(optional = false)
    @Column(name = "cpf_func")
    private String cpfFunc;
    @Basic(optional = false)
    @Column(name = "caixa")
    private short caixa;
    @Basic(optional = false)
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Basic(optional = false)
    @Column(name = "id_prod_vendidos")
    private int idProdVendidos;
    @Basic(optional = false)
    @Column(name = "id_tipo_de_pagamento")
    private int idTipoDePagamento;

    public VendasFechadas() {
    }

    public VendasFechadas(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public VendasFechadas(Integer idVenda, String cpfFunc, short caixa, String data, long total, int idProdVendidos, int idTipoDePagamento) {
        this.idVenda = idVenda;
        this.cpfFunc = cpfFunc;
        this.caixa = caixa;
        this.data = data;
        this.total = total;
        this.idProdVendidos = idProdVendidos;
        this.idTipoDePagamento = idTipoDePagamento;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        Integer oldIdVenda = this.idVenda;
        this.idVenda = idVenda;
        changeSupport.firePropertyChange("idVenda", oldIdVenda, idVenda);
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(String cpfFunc) {
        String oldCpfFunc = this.cpfFunc;
        this.cpfFunc = cpfFunc;
        changeSupport.firePropertyChange("cpfFunc", oldCpfFunc, cpfFunc);
    }

    public short getCaixa() {
        return caixa;
    }

    public void setCaixa(short caixa) {
        short oldCaixa = this.caixa;
        this.caixa = caixa;
        changeSupport.firePropertyChange("caixa", oldCaixa, caixa);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        long oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public int getIdProdVendidos() {
        return idProdVendidos;
    }

    public void setIdProdVendidos(int idProdVendidos) {
        int oldIdProdVendidos = this.idProdVendidos;
        this.idProdVendidos = idProdVendidos;
        changeSupport.firePropertyChange("idProdVendidos", oldIdProdVendidos, idProdVendidos);
    }

    public int getIdTipoDePagamento() {
        return idTipoDePagamento;
    }

    public void setIdTipoDePagamento(int idTipoDePagamento) {
        int oldIdTipoDePagamento = this.idTipoDePagamento;
        this.idTipoDePagamento = idTipoDePagamento;
        changeSupport.firePropertyChange("idTipoDePagamento", oldIdTipoDePagamento, idTipoDePagamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenda != null ? idVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendasFechadas)) {
            return false;
        }
        VendasFechadas other = (VendasFechadas) object;
        if ((this.idVenda == null && other.idVenda != null) || (this.idVenda != null && !this.idVenda.equals(other.idVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.VendasFechadas[ idVenda=" + idVenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
