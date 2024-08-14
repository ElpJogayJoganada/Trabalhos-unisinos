public class Bijuteria extends Loja{
    private double metaVendas;
    
    public Bijuteria(String Nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao, double metaVendas, int estoqueMax){
         super(Nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, estoqueMax);
         this.metaVendas = metaVendas;
    }
    
    ///GETTER*****
    
    public double getMetaVendas(){
        return metaVendas;
    }
    
    ///SETTER****
    
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
     @Override
    public String toString(){
        return super.toString() + 
        "Meta de vendas: " + metaVendas;
    }
}