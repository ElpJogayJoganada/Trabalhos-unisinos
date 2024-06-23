public class Loja{
    private String Nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data fundacao;
    private Produto[] estoqueProdutos;
    
    //CONSTRUTORES******
    
    public Loja(String Nome, int quantidadeFuncionarios,  double salarioBaseFuncionario, Endereco endereco, Data fundacao, int estoqueMax){
        this.Nome = Nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.fundacao = fundacao;
        this.estoqueProdutos = new Produto[estoqueMax];
    }
    
    public Loja(String Nome, int quantidadeFuncionarios, Endereco endereco, Data data, int estoqueMax){
        this.Nome = Nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.fundacao = data;
        salarioBaseFuncionario = -1.0;
        this.estoqueProdutos = new Produto[estoqueMax];
    }
    
    //GETTERS E SETTERS********
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Data getDataFundacao(){
        return fundacao;
    }
    
    public void setDataFundacao(Data fundacao){
        this.fundacao = fundacao;
    }
    
    //GETTERS E SETTERS SEMANA 4
    
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    
    public void setEstoqueProdutos(Produto[] quantMaxProdutos){
        this.estoqueProdutos = quantMaxProdutos;
    }
    //METODOS ADICIONAIS ETAPA 4
    
    public Produto[] imprimeProdutos(){
        return estoqueProdutos;
    }
    
    public boolean insereProduto(Produto produto){
        for(int i = 0; i< estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
                
        }
        
        return false;
    }
    
    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        
        return false;
    }
    
    //TO STRING ATUALIZADO ETAPA 4*********
    
    @Override
    public String toString(){
        return "Nome da loja: " + Nome + "\n" +
        "N° de funcionarios: " + quantidadeFuncionarios + "\n" +
        "Salário base: " + salarioBaseFuncionario+"\n" +
        "Endereço: " + endereco +"\n" +
        "Data de fundação: " + fundacao+"\n" +
        "Quantidade maxima de produtos: "+estoqueProdutos.length;
    }
    
    //GASTOS COM SALARIO********
    
    public double gastosComSalario(){
        
        if (salarioBaseFuncionario == -1)
            return -1;
            
        else
         return quantidadeFuncionarios * salarioBaseFuncionario;
        
    }
    
    public char tamanhoDaLoja(){
        
        if (quantidadeFuncionarios < 10)
            return 'P';
            
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30)
            return 'M';
            
        else 
            return 'G';
    
    }
}