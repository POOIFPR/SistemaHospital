import java.time.LocalDateTime;
import java.util.ArrayList;

public class Medico extends Usuario {
    String identificacao;
    public Medico(String nome, String cpf, String telefone, String email, String senha, String identificacao) {
        super(nome, cpf, telefone, email, senha);
        this.identificacao = identificacao;
    }
    public Paciente registrarPaciente(String nome, String cpf, String telefone, String email, String senha, String identificacao, String[][] informacoesMedicas) {
        return new Paciente(nome, cpf, telefone, email, senha, identificacao, informacoesMedicas);
    }
    public Consulta marcarConsulta(Medico medico, Paciente paciente, LocalDateTime horarioConsulta, String localConsulta) {
        return new Consulta(this, paciente, horarioConsulta, localConsulta);
    }
    public ArrayList<Paciente> visualizarPacientes() {
        return new ArrayList<Paciente>();
    }
    public Exame marcarExame(ArrayList<Medico> medico,
    Paciente paciente,
     String tipoExame,
      LocalDateTime horarioConsulta,
           String localConsulta){
        return new Exame(medico, paciente, tipoExame, horarioConsulta, localConsulta);
    }
    public Medicamento preescreverMedicamento(String nome, String bula, String tipoMedicamento) {
        return new Medicamento(nome, bula, tipoMedicamento);
    }
    public Leito adicionarLeito(String salaLeito, String tipoLeito, String etiqueta) {
        return new Leito(salaLeito, tipoLeito, etiqueta);
    }
    public ArrayList<Leito> visualizarLeitos() {
        return new ArrayList<Leito>();
    }
    public String[][] gerarRelatorio() {
        return new String[0][0];
    }
}
