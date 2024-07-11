import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exame {
    ArrayList<Medico> medico;
    Paciente paciente;
    String tipoExame;
    LocalDateTime horarioConsulta;
    String localConsulta;
    public Exame(ArrayList<Medico> medico,
     Paciente paciente,
      String tipoExame,
       LocalDateTime horarioConsulta,
            String localConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.tipoExame = tipoExame;
        this.horarioConsulta = horarioConsulta;
        this.localConsulta = localConsulta;
    }
}
