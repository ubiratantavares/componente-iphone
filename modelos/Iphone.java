public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void adiantar() {
        System.out.println("Adiantando a execução da música atual");        
    }

    @Override
    public void adicionarMusicaAPlaylist(String nomePlaylist, String musica) {
        System.out.printf("Adicionando a música %s no playlist %s", musica, nomePlaylist);        
    }

    @Override
    public void ajustarVolume(int nivel) {
        System.out.printf("Ajustando o volume da música para o nível %s", nivel);        
    }

    @Override
    public void ativarModoAleatorio() {
        System.out.println("Ativando o modo aleatório");        
    }

    @Override
    public void ativarRepeticao() {
        System.out.println("Ativando a repetição");       
    }

    @Override
    public void criarPlaylist(String nome) {
        System.out.printf("Criando a playlist %s", nome);       
    }

    @Override
    public void parar() {
        System.out.println("Parando a execução da música atual");        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a execução da música atual");        
    }

    @Override
    public void procurar(String termo) {
        System.out.printf("Procurando pela música com o %s", termo);
    }

    @Override
    public void pularParaProxima() {
        System.out.println("Selecionando a próxima música do playlist");        
    }

    @Override
    public void removerMusicaDePlaylist(String nomePlaylist, String musica) {
        System.out.printf("Removendo a música %s do playlist %s", musica, nomePlaylist);
    }

    @Override
    public void retroceder() {
        System.out.println("retrocendendo a execução da música atual");          
    }

    @Override
    public void selecionar(String musica) {
        System.out.printf("Selecionando a música %s", musica);        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música atual");        
    }

    @Override
    public void voltarParaAnterior() {
        System.out.println("Voltando a música anterior");
    }

    @Override
    public void abrirContatos() {
        System.out.println("Abrindo a lista de contatos");        
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo a chamada telefônica");
    }

    @Override
    public void ativarChamadaEspera() {
        System.out.println("Ativando a chamda em modo espera");        
    }

    @Override
    public void ativarModoSilencioso() {
        System.out.println("Ativando a chamada no modo silencioso");        
    }

    @Override
    public void desativarChamadaEspera() {
        System.out.println("Desativando a chamada no modo espera");        
    }

    @Override
    public void desativarModoSilencioso() {
        System.out.println("Desativando a chamada no modo silencioso");        
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando a chamada telefônica");        
    }

    @Override
    public void enviarMensagemTexto(String numero, String mensagem) {
        System.out.printf("Enviando a mensagem %s para o número %s", mensagem, numero);        
    }

    @Override
    public void gravarChamada() {
        System.out.println("Gravando a chamada telefônica"); 
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");        
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o número %s", numero);        
    }

    @Override
    public void receberMensagemTexto() {
        System.out.println("Recebendo mensagem de texto");        
    }

    @Override
    public void rediscarUltimoNumero() {
        System.out.println("Rediscando o último número chamado");        
    }

    @Override
    public void transferirChamada(String numero) {
        System.out.printf("Tranferindo a chamada para o número %s", numero);        
    }

    @Override
    public void abrirEmNovaAba(String url) {
        System.out.printf("Abrindo a url %s em nova aba", url);        
    }

    @Override
    public void abrirFerramentasDesenvolvedor() {
        System.out.println("Abrindo ferramentas para o desenvolvedor");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.printf("Adicionando a url %s aos favoritos", url);        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador web.");        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual no navegador web");        
    }

    @Override
    public void configurarProxy(String enderecoProxy) {
        System.out.printf("Configurando o proxy %s no navegador web", enderecoProxy);        
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Visualizando histórico no navegador web");        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo a página %s no navegador web", url);        
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando a aba no navegador web.");        
    }

    @Override
    public void gerenciarConfiguracoes() {
        System.out.println("Gerenciando as configurações no navegador web");        
    }

    @Override
    public void gerenciarFavoritos() {
        System.out.println("Gerenciando os favoritos no navegador web");        
    }

    @Override
    public void navegarParaPaginaAnterior() {
        System.out.println("Navegando para a página anterior no navegador web");        
    }

    @Override
    public void navegarParaPaginaSeguinte() {
        System.out.println("Navegando para a página seguinte no navegador web");        
    }

    @Override
    public void pesquisar(String termo) {
        System.out.printf("Pesquisando o termo %s no navegador web", termo);        
    }

    @Override
    public void salvarPagina(String caminho) {
        System.out.printf("Salvando a página atual no caminho %s", caminho);        
    }
}
