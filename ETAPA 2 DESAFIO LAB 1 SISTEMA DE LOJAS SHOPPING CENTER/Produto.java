public class Produto{
    private String Nome;
    private double Preco;
    private Data validade;
    
    //CONSTRUTOR*******
    
    public Produto(String Nome, double Preco, Data validade){
        this.Nome = Nome;
        this.Preco = Preco;
        this.validade = validade;
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
    
    public  Data getDataValidade(){
        return validade;
    }
    
    public void setDataValidade(Data validade){
        this.validade = validade;
    }
    
    //VERIFICAR PRODUTO VENCIDO
    
    public boolean estaVencido(Data dataAtual){
        if (this.validade.getAno() > dataAtual.getAno()){
            return false;
        }
            if (this.validade.getAno() == dataAtual.getAno()&&
                this.validade.getMes() > dataAtual.getMes()){
            return false;
        }
        else if  (this.validade.getMes() <= dataAtual.getMes()&&
            this.validade.getDia() > dataAtual.getDia()){
            return false;
        }
        
            else{
            return true;
            }
    }
    
    ///TO STRING ATUALIZADO ETAPA 3******
    
    @Override
    public String toString(){
        return "Nome do produto: " + Nome +
        "Preço: " + Preco +
        "Data de validade: " + validade;
    }
}