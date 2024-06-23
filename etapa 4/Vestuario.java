public class Vestuario extends Loja{
    private boolean produtosImportados;
    
    public Vestuario(String Nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao, boolean produtosImportados, int estoqueMax){
         super(Nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, estoqueMax);
         this.produtosImportados = produtosImportados;
         
    }
        
    ///GETER*********
    
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    
    ///SETER**********
    
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
     @Override
    public String toString(){
        return super.toString() + 
        "Produto é importado?: " + produtosImportados;
    }
}