public class Endereco{
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;
    
    //COSTRUTOR******
    
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    // Getters e Setters para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getters e Setters para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Getters e Setters para pais
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Getters e Setters para cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Getters e Setters para numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getters e Setters para complemento
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    //TOSTRING******
    
    @Override
    public String toString() {
        return "Endereco: " + "\n" +
                "Nome da rua: " + nomeDaRua + "\n" +
                "Cidade" + cidade + "\n"  +
                "Estado: " + estado + "\n" +
                "Pais: " + pais + "\n" +
                "Cep: " + cep + "\n" +
                "Numero: " + numero + "\n" +
                "Complemento: " + complemento + "\n";
            }
}