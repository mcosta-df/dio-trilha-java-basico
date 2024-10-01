public class Browser implements NavegadorInternet {

    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina especificada");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina");
    }
    
}
