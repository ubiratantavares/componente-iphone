public interface AparelhoTelefonico {

    public void ligar(String numero);
    public void rediscarUltimoNumero();
    public void atenderChamada();
    public void encerrarChamada();
    public void iniciarCorreioVoz();
    public void enviarMensagemTexto(String numero, String mensagem);
    public void receberMensagemTexto();
    public void abrirContatos();
    public void ativarModoSilencioso();
    public void desativarModoSilencioso();
    public void ativarChamadaEspera();
    public void desativarChamadaEspera();
    public void transferirChamada(String numero);
    public void gravarChamada();

}
