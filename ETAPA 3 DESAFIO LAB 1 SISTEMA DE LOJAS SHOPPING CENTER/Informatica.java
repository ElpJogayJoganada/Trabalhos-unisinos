public class Informatica extends Loja{
    private double seguroEletronicos;
    
    public Informatica(String Nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao, double seguroEletronicos){
          super(Nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao);
          this.seguroEletronicos = seguroEletronicos;
        }
        
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
      @Override
    public String toString(){
        return super.toString() + 
        "Valor do seguro: " + seguroEletronicos;
    }
}