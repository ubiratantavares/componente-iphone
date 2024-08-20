public interface ReprodutorMusical {

    public void tocar();
    public void pausar();
    public void parar();
    public void retroceder();
    public void adiantar();
    public void selecionar(String musica);
    public void pularParaProxima();
    public void voltarParaAnterior();
    public void ajustarVolume(int nivel);
    public void ativarRepeticao();
    public void ativarModoAleatorio();
    public void criarPlaylist(String nome);
    public void adicionarMusicaAPlaylist(String nomePlaylist, String musica);
    public void removerMusicaDePlaylist(String nomePlaylist, String musica);
    public void procurar(String termo);
}
