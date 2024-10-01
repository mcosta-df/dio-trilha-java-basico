public class IPod implements ReprodutorMusical {

    @Override
    public void tocar(){
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar(){
        System.out.println("Musica pausada");
    } 

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecioando musica");
    }
    
}
