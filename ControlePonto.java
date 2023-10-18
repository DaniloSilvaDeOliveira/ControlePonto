import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {

    public String registraEntrada(Funcionario funcionario){
        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");

        String date = dateFormat.format(new Date());

        return funcionario.getNome() + " Entrou: " + date;
    }

    public String registrarSaida(Funcionario funcionario){
        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");

        String date = dateFormat.format(new Date());

        return funcionario.getNome() + " Saiu: " + date;
    }


}
