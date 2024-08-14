public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    //CONSTRUTOR*******
    
    public Data(int dia, int mes, int ano){
         // Verificando se o ano é bissexto
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        // Validando a data
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 ||
            (mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30 ||
            mes == 2 && ((dia > 29 && bissexto) || (dia > 28 && !bissexto))) {
            // Data inválida, imprimir mensagem de erro e definir a data padrão
            System.out.println("Data inválida. Alterando para a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    //GETTERS E SETTERS******
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    @Override
    public String toString(){
        return "Dia: " + dia + "Mês: " + mes + "Ano: " + ano;
    }
    
    //VERIFICA ANO BISSEXTO****
    
     public boolean verificaAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    
      public boolean verificaAnoBissexto() {
            return verificaAnoBissexto(this.ano);
    }
}