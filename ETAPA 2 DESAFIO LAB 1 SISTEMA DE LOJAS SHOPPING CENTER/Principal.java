public class Principal{
    
    public static void main(String [] args){
        
        int opcao;
        while(true){
            System.out.println("Menu: ");
            System.out.println("(1) Criar uma loja: ");
            System.out.println("(2) Criar um produto: ");
            System.out.println("(3) Sair: ");
            opcao = Teclado.leInt("Digite a opção que deseja: ");
            
        if (opcao == 1){
        
            String nomeloja1 = Teclado.leString("Digite o nome da loja: ");
            int qtdfuncionarios = Teclado.leInt("Digite o numero de funcionarios: ");
            double salariobase = Teclado.leDouble("Digite o salario base: ");
            
            System.out.println("Informe o endereço da loja: ");
            
            String rua = Teclado.leString("Informe a rua da loja: ");
            String cidade = Teclado.leString("Informe a cidade: ");
            String estado = Teclado.leString("Informe o estado: ");
            String pais = Teclado.leString("Informe o pais: ");
            String cep = Teclado.leString("Informe o cep: ");
            String numero = Teclado.leString("Informe o numero: ");
            String complemento = Teclado.leString("Informe o complemento: ");
            
            Endereco enderecoloja = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
            
            System.out.println("Digite a data de fundação da loja: ");
            
            int dia = Teclado.leInt("Digite o dia: ");
            int mes = Teclado.leInt("Digite o mes: ");
            int ano = Teclado.leInt("Digite o ano: ");
            
            Data dataFundacao = new Data(dia, mes, ano);
            
            Loja Loja1 = new Loja(nomeloja1, qtdfuncionarios, salariobase, enderecoloja, dataFundacao);
            
            Loja1.toString();
        }
         
        else if(opcao == 2){
          
            String nomeProduto = Teclado.leString("Informe o nome do produto: ");
            double precoProduto = Teclado.leDouble("Informe o preço do produto: ");
            
            System.out.print("Digite a data: ");
            
            int diavalidade = Teclado.leInt("Digite o dia: ");
            int mesvalidade = Teclado.leInt("Digite o mes: ");
            int anovalidade = Teclado.leInt("Digite o ano: ");
            
            Data datavalidade = new Data(diavalidade, mesvalidade, anovalidade);
            
            Produto produto1 = new Produto(nomeProduto, precoProduto, datavalidade);
            
            Data dataAtualVencimento = new Data(20, 10, 2023);
            
             if (produto1.estaVencido(dataAtualVencimento)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
        }
        
        else if(opcao == 3){
            System.out.println("Saindo... ");
            break;
        }
        
        else{
            System.out.println("Opção invalida ");
        }
    }
    
   

    }
}