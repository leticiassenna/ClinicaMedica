
import br.Pessoa;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticia
 */
public class Paciente  extends Pessoa{
    private Date datanascimento;
    private String profissao;
    private String cpf;
    
    
    
    
    @Override
    public final void cadastrarPessoa(String nome, String endereco, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        
    }

    public Paciente(Date datanascimento, String profissao, String cpf, String nome, String endereco, String telefone){
        this.datanascimento = datanascimento;
        this.profissao = profissao;
        this.cpf = cpf;
        
        cadastrarPessoa(nome, endereco, telefone);
                
    }
    
    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
