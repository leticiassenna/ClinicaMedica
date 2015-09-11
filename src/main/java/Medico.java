
import br.Pessoa;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticia
 */
public class Medico extends Pessoa {
   
    private String crm;
    
    private ArrayList<HorarioAtendimento> horarioAtendimentos = new ArrayList<>();
	
    private ArrayList<PlanoSaude> planoSaudes = new ArrayList<>();
	
    private ArrayList<Consulta> consultas = new ArrayList<>();
    
    private ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    @Override
    public final void cadastrarPessoa(String nome, String endereco, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    public Medico(String crm, String nome, String endereco, String telefone){
        this.crm = crm;
        cadastrarPessoa(nome, endereco, telefone);
    }

 
    public ArrayList<HorarioAtendimento> getHorarioAtendimentos() {
        return horarioAtendimentos;
    }

    public void setHorarioAtendimentos(ArrayList<HorarioAtendimento> horarioAtendimentos) {
        this.horarioAtendimentos = horarioAtendimentos;
    }

    public ArrayList<PlanoSaude> getPlanoSaudes() {
        return planoSaudes;
    }

    public void setPlanoSaudes(ArrayList<PlanoSaude> planoSaudes) {
        this.planoSaudes = planoSaudes;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
}
