import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    Medico medico = new Medico("Dr. Amado Batista",
     "11111111111",
      "44 9 95487412",
       "amadobatista@gmail.com",
        "secretaria345",
         "AMB654D");
    Paciente paciente = new Paciente("Alessandra Negrini",
     "02356484571",
      "44 9 84753216",
       "alessandra@email.com",
        "alezinha548",
         "ALN342B",
          new String[11][4]);
    Consulta consulta = new Consulta(medico,
     paciente,
      LocalDateTime.of(2024, 07, 14, 14, 30),
       "Av. Guimarãe, 1450, São Bentinho dos Juazeiros - SP");
    Medicamento medicamento = new Medicamento("Iboprufeno",
     "Esse medicamento é indicado para o alívio de dores e febre decorrentes de gripes e resfriados",
      "Analgésico/Anti-inflamatório");
    Leito leito = new Leito("Sala 14-F",
     "Comum",
      "1756BAB");
    ArrayList<Medico> medicosExame = new ArrayList<>();
    Exame exame = new Exame(medicosExame,
     paciente,
      "Raio-X",
       LocalDateTime.of(2024, 7, 25, 15, 40),
       "Rua Navegantes, 567");
}
