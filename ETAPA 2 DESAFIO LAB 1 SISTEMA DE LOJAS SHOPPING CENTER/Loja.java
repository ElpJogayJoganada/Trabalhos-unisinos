public class Loja{
    private String Nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data fundacao;
    
    //CONSTRUTORES******
    
    public Loja(String Nome, int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data fundacao){
        this.Nome = Nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.fundacao = fundacao;
    }
    
    public Loja(String Nome, int quantidadeFuncionarios, Endereco endereco, Data data){
        this.Nome = Nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.fundacao = data;
        salarioBaseFuncionario = -1.0;
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
    
    //TO STRING ATUALIZADO ETAPA 3*********
    
    @Override
    public String toString(){
        return "Nome da loja : " + Nome + 
        "N° de funcionarios: " + quantidadeFuncionarios + 
        "Salário base: " + salarioBaseFuncionario+
        "Endereço: " + endereco +
        "Data de fundação" + fundacao;
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