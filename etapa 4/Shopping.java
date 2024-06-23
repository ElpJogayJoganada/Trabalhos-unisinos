public class Shopping{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int lojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[lojas];
    }
    
    //GETTERS E SETTERS
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return endereco; 
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Loja[] getLojas(){
        return lojas;
    }
    
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    
    public boolean insereLoja(Loja nLoja){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = nLoja;
                return true;
            }
        }
        
        return false;
    }
    
    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }    
        return false;
    }
    
    public int quantidadeLojasPorTipo(String tipoLoja){
        int c = 0;
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                continue;
            }
            
            switch(tipoLoja.toLowerCase()){
                case "cosmético":
            if (lojas[i] instanceof Cosmetico) {
                c++;
            }
            break;
        case "vestuário":
            if (lojas[i] instanceof Vestuario) {
                c++;
            }
            break;
        case "bijuteria":
            if (lojas[i] instanceof Bijuteria) {
                c++;
            }
            break;
        case "alimentação":
            if (lojas[i] instanceof Alimentacao) {
                c++;
            }
            break;
        case "informática":
            if (lojas[i] instanceof Informatica) {
                c++;
            }
            break;
        default:
            return -1;
            }
        }
      return c;
    }
    
     public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        double seguroMaisCaro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                double seguroAtual = lojaInformatica.getSeguroEletronicos();
                if (seguroAtual > seguroMaisCaro) {
                    lojaSeguroMaisCaro = lojaInformatica;
                    seguroMaisCaro = seguroAtual;
                }
            }
        }
        return lojaSeguroMaisCaro;
    }
    
    @Override
    public String toString(){
        return "Nome do shopping: " + nome + "\n" +
               "Endereço: " + endereco + "\n" +
               "Quandidade de lojas: " + lojas;
    }
} 
