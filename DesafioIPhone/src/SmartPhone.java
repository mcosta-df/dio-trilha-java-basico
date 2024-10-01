public class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    }
    public void pausar(){
        System.out.println("NUSICA PAUSADA");
    } 
    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MUSICA");
    }

    public void ligar(String numero){
        System.out.println("REALIZAND LIGACAO");
    }
    public void atender(){
        System.out.println("ATENDENDO LIGACAO");
    }
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(String url){
        System.out.println("EXIBINDO PAGINA");
    }
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }
}
