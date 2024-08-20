public interface NavegadorInternet {

    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();
    public void fecharAba();
    public void navegarParaPaginaAnterior();
    public void navegarParaPaginaSeguinte();
    public void salvarPagina(String caminho);
    public void abrirEmNovaAba(String url);
    public void pesquisar(String termo);
    public void adicionarAosFavoritos(String url);
    public void gerenciarFavoritos();
    public void exibirHistorico();
    public void gerenciarConfiguracoes();
    public void abrirFerramentasDesenvolvedor();
    public void configurarProxy(String enderecoProxy);
}
