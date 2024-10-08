public class Alimentacao extends Loja{
    private Data dataAlvara;
    
    public Alimentacao(String Nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao, Data dataAlvara){
        super(Nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao);
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara(){
        return dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
      @Override
    public String toString(){
        return super.toString() + 
        "Data do Alvara: " + dataAlvara;
    }
}