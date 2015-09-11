


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticia
 */
public class HorarioAtendimento{
    private int horaInicio;
    private int horaFim;
    private String diasemana;
    
    
    
    public void cadastrarHorario(int horaInicio, int horaFim, String diasemana){
	this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.diasemana = diasemana;
    }
    
    
   
    
    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }
    
    public String getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }
    
}
