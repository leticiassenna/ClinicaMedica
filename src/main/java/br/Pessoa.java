package br;

import br.ifes.IPessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Leticia
 */
public abstract class Pessoa implements IPessoa{
    private String nome;
    private String endereco;
    private String telefone;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }
    

   
}
