package device;

import interfaces.AparelhoTelefonico;
import interfaces.NavegarNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegarNaInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando musica via device.Iphone!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado musica via device.Iphone!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica via device.Iphone!");
    }
    @Override
    public void ligar() {
        System.out.println("Ligando via device.Iphone!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação via device.Iphone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via device.Iphone!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página via device.Iphone!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via device.Iphone!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página via device.Iphone!");
    }
}
