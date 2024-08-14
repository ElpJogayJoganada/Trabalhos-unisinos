public class Produto{
    private String Nome;
    private double Preco;
    
    //CONSTRUTOR*******
    
    public Produto(String Nome, double Preco){
        this.Nome = Nome;
        this.Preco = Preco;
    }
    
    //GETTERS E SETTERS*********
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public double getPreco(){
        return Preco;
    }
    
    public void setPreco(double Preco){
        this.Preco = Preco;
    }
    
    @Override
    public String toString(){
        return "Produto: " + Nome + "Preço: " + Preco;
    }
}