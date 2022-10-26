import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;

public class GerenciarPontoControle {
    public static void main(String[] args) throws InterruptedException {
        // Ex 8
        Gerente gerente = new Gerente();
        gerente.setNome("Jobson");
        gerente.setEmail("Jobson@gmail.com");
        gerente.setLogin("JobsonGerente");
        gerente.setSenha("123456789");
        gerente.setDocumento("84284123122");
        gerente.setIdFunc(2);

        // Ex 9
        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Joaquina");
        secretaria.setEmail("Joaquina@gmail.com");
        secretaria.setDocumento("95321395233");
        secretaria.setIdFunc(9);
        secretaria.setRamal("9867831112#412");
        secretaria.setTelefone("14992314521");

        // Ex 10
        Operador operador = new Operador();
        operador.setNome("Jacó");
        operador.setEmail("jaco@gmail.com");
        operador.setDocumento("43195294522");
        operador.setIdFunc(6);
        operador.setValorHora(50);

        // Ex 11
        RegistroPonto registroPontoGerente = new RegistroPonto();
        registroPontoGerente.setIdRegPonto(1);
        registroPontoGerente.setFunc(gerente);
        registroPontoGerente.setDataRegistro(LocalDate.now());
        registroPontoGerente.setHoraEntrada(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        // Ex 12
        RegistroPonto registroPontoOperador = new RegistroPonto();
        registroPontoOperador.setIdRegPonto(2);
        registroPontoOperador.setFunc(operador);
        registroPontoOperador.setDataRegistro(LocalDate.now());
        registroPontoOperador.setHoraEntrada(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        // Ex 13
        RegistroPonto registroPontoSecretaria = new RegistroPonto();
        registroPontoSecretaria.setIdRegPonto(3);
        registroPontoSecretaria.setFunc(secretaria);
        registroPontoSecretaria.setDataRegistro(LocalDate.now());
        registroPontoSecretaria.setHoraEntrada(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();

        Thread.sleep(1000);

        // Ex 14
        registroPontoGerente.setHoraSaida(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        // Ex 15
        registroPontoOperador.setHoraSaida(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        // Ex 16
        registroPontoSecretaria.setHoraSaida(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();

        Thread.sleep(1000);

    }
}