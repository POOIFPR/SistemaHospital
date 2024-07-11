import java.time.LocalDateTime;

public class Paciente extends Usuario{
    String identificacoPaciente;
    String[][] informacoesMedicas;

    public Paciente(String nome, String cpf, String telefone, String email, String senha, String identificacaoPaciente, String[][] informacoesMedicas) {
        super(nome, cpf, telefone, email, senha);
        this.identificacoPaciente = identificacaoPaciente;
        this.informacoesMedicas = informacoesMedicas;
    }

    public Consulta marcarConsulta(Medico medico, Paciente paciente, LocalDateTime horarioConsulta, String localConsulta) {
        return new Consulta(medico, paciente, horarioConsulta, localConsulta);
    }
}
