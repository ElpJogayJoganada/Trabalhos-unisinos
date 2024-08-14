public class Loja{
    private String Nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    //CONSTRUTORES******
    
    public Loja(String Nome, int quantidadeFuncionarios,double salarioBaseFuncionario){
        this.Nome = Nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Loja(String Nome, int quantidadeFuncionarios){
        this.Nome = Nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
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
    
    //TO STRING*********
    
    @Override
    public String toString(){
        return "Nome da loja : " + Nome + "N° de funcionarios: " + quantidadeFuncionarios + "Salário base: " + salarioBaseFuncionario;
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