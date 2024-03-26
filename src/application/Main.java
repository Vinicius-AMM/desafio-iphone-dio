package application;

import device.Iphone;
import device.Ipod;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Iphone:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        Ipod ipod = new Ipod();
        System.out.println("\nIpod: ");
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

    }
}