public class Cosmetico extends Loja{
    
    private double taxaComercializacao;
    
    public Cosmetico(String Nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao, int estoqueMax, double taxaComercializacao){
       super(Nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, estoqueMax);
       this.taxaComercializacao = taxaComercializacao;
    }
    
    //////GET******
    
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    
    ///SET*******
    
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    
    }
    
    @Override
    public String toString(){
        return super.toString() + 
        "Taxa de comercialização: " + taxaComercializacao;
    }
}