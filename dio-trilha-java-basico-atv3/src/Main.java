public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.pausar();

        iphone.ligar("11987653422");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
