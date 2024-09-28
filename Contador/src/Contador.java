import java.util.Scanner;

public class Contador{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Diginte o primeiro numero: ");
        int primeiroNumero = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNumero = entrada.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }catch(ParametrosInvalidosException e){
            System.out.println(e.toString());
            
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if(parametroUm > parametroDois){
            
            throw new ParametrosInvalidosException(parametroUm, parametroDois);
        }   

        int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++){
             System.out.println("imprimindo o numero " + i);
        }
    }
}

