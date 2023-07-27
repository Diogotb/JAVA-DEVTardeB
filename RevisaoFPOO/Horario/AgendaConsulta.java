package RevisaoFPOO.Horario;

public class AgendaConsulta {
    //atributos
    String agendamento;
    String horario;
    String data;
    String cliente;
    String veterianario;
    //métodos
    
    public String getAgendamento() {
        agendamento = data+horario;
        return agendamento;
    }
    public AgendaConsulta(String horario, String data) {
        this.horario = horario;
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getVeterianario() {
        return veterianario;
    }
    public void setVeterianario(String veterianario) {
        this.veterianario = veterianario;
    }
    
}
