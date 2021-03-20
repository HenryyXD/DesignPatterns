import mensagem.Mensagem;
import mensagem.MensagemFactory;
import mensagem.TipoMensagem;

public class App {
    public static void main(String[] args) throws Exception {
        Mensagem m = MensagemFactory.getMensagem(TipoMensagem.EMAIL);
        m.enviar("Teste");
    }
}

