public class ParametrosInvalidosException extends Exception {

    private String num1;
    private String num2;

    public ParametrosInvalidosException(int num1, int num2){
        super();
        this.num1 = Integer.toString(num1);
        this.num2 = Integer.toString(num2);
    }

    @Override
    public String toString(){
        return "O segundo parâmetro(" + this.num2 + ") deve ser maior que o primeiro(" + this.num1 + ")."; 
    }
}
