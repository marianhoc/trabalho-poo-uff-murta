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
public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    //private boolean isManager;
    private int isManager;

    /**
     * inicializa um novo funcionario com os parametros indicados
     * 
     * @param nome 
     * @param sobrenome
     * @param cpf
     * @param isManager 
     */
    public Funcionario(String nome, String sobrenome, String cpf, int isManager) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.isManager = isManager;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int isIsManager() {
        return isManager;
    }

    public void setIsManager(int isManager) {
        this.isManager = isManager;
    }
    
    
    
}
