package com.gandalf.models;

import java.util.HashSet;
import java.util.Set;

public class Endereco implements java.io.Serializable {

    private int idEndereco;
    private Cliente cliente;
    private String nomeEndereco;
    private String logradouroEndereco;
    private String numeroEndereco;
    private String cependereco;
    private String complementoEndereco;
    private String cidadeEndereco;
    private String paisEndereco;
    private String ufendereco;
    private Set pedidos = new HashSet(0);

    public Endereco() {
    }

    public Endereco(int idEndereco, Cliente cliente, String nomeEndereco, String logradouroEndereco, String numeroEndereco, String cependereco, String cidadeEndereco) {
        this.idEndereco = idEndereco;
        this.cliente = cliente;
        this.nomeEndereco = nomeEndereco;
        this.logradouroEndereco = logradouroEndereco;
        this.numeroEndereco = numeroEndereco;
        this.cependereco = cependereco;
        this.cidadeEndereco = cidadeEndereco;
    }

    public Endereco(int idEndereco, Cliente cliente, String nomeEndereco, String logradouroEndereco, String numeroEndereco, String cependereco, String complementoEndereco, String cidadeEndereco, String paisEndereco, String ufendereco, Set pedidos) {
        this.idEndereco = idEndereco;
        this.cliente = cliente;
        this.nomeEndereco = nomeEndereco;
        this.logradouroEndereco = logradouroEndereco;
        this.numeroEndereco = numeroEndereco;
        this.cependereco = cependereco;
        this.complementoEndereco = complementoEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.paisEndereco = paisEndereco;
        this.ufendereco = ufendereco;
        this.pedidos = pedidos;
    }

    public int getIdEndereco() {
        return this.idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNomeEndereco() {
        return this.nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

    public String getLogradouroEndereco() {
        return this.logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getNumeroEndereco() {
        return this.numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getCependereco() {
        return this.cependereco;
    }

    public void setCependereco(String cependereco) {
        this.cependereco = cependereco;
    }

    public String getComplementoEndereco() {
        return this.complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getCidadeEndereco() {
        return this.cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getPaisEndereco() {
        return this.paisEndereco;
    }

    public void setPaisEndereco(String paisEndereco) {
        this.paisEndereco = paisEndereco;
    }

    public String getUfendereco() {
        return this.ufendereco;
    }

    public void setUfendereco(String ufendereco) {
        this.ufendereco = ufendereco;
    }

    public Set getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }

}
