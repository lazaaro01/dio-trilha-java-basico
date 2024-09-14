package UML;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMsucia() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Musica parada");
    }

    @Override
    public void ajustarVolume(int volume) {
        System.out.println("Volume ajustado para " + volume);
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    @Override
    public void navegarSite(String url) {
        System.out.println("Navegando para " + url);
    }

    @Override
    public void fazerBuscar(String termo) {
        System.out.println("Buscando por " + termo);
    }

    @Override
    public void armazenarFavorito(String url) {
        System.out.println("Armazenando favorito: " + url);
    }
}
