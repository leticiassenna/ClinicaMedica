
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
public class Consulta {
    
    private Date data;
    private String hora;
    private int duracao;
    private String crmmedico;
    private String cpfpaciente;
    private String cnpjplanos;
    private String obsqueixaqaciente;
    private String obsprescricao;
    private String obsresultados;
    
    
    
    
    public void criarConsulta(Date data, String hora, int duracao, String crmmedico, String cpfpaciente, String cnpjplanos){
        this.data = data;
        this.hora = hora;
        this.duracao = duracao;
        this.crmmedico = crmmedico;
        this.cpfpaciente = cpfpaciente;
        this.cnpjplanos = cnpjplanos;
        
    }
    
    public void inserirObservacoes(String obsqueixaqaciente, String obsprescricao, String obsresultados){
        this.obsqueixaqaciente = obsqueixaqaciente;
        this.obsprescricao = obsprescricao;
        this.obsresultados = obsresultados;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCrmmedico() {
        return crmmedico;
    }

    public void setCrmmedico(String crmmedico) {
        this.crmmedico = crmmedico;
    }

    public String getCpfpaciente() {
        return cpfpaciente;
    }

    public void setCpfpaciente(String cpfpaciente) {
        this.cpfpaciente = cpfpaciente;
    }

    public String getCnpjplanos() {
        return cnpjplanos;
    }

    public void setCnpjplanos(String cnpjplanos) {
        this.cnpjplanos = cnpjplanos;
    }

    public String getObsqueixaqaciente() {
        return obsqueixaqaciente;
    }

    public void setObsqueixaqaciente(String obsqueixaqaciente) {
        this.obsqueixaqaciente = obsqueixaqaciente;
    }

    public String getObsprescricao() {
        return obsprescricao;
    }

    public void setObsprescricao(String obsprescricao) {
        this.obsprescricao = obsprescricao;
    }

    public String getObsresultados() {
        return obsresultados;
    }

    public void setObsresultados(String obsresultados) {
        this.obsresultados = obsresultados;
    }

    
    
}
