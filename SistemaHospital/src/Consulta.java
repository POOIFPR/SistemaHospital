import java.time.LocalDateTime;

public class Consulta {
    Medico medico;
    Paciente paciente;
    LocalDateTime horarioConsulta;
    String localConsulta;
    public Consulta(Medico medico, Paciente paciente, LocalDateTime horarioConsulta, String localConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.horarioConsulta = horarioConsulta;
        this.localConsulta = localConsulta;
    }
}
