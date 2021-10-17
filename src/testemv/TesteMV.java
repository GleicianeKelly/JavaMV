package testemv;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TesteMV {    
    
    
    static List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    static List<Produtos> listaProdutos = new ArrayList<Produtos>();
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
       
        
        
        int opcao = 0;
        while(true){
        

            System.out.println("**Cadastro de funcionários para café da manhã**");
            System.out.println("Digite 1 para cadastrar funcionário");
            System.out.println("Cadastrar produtos");
            System.out.println("Digite 2 para consultar funcionário");
            System.out.println("Digite 3 para excluir funcionário");
            opcao = ler.nextInt();
            
            if(opcao == 0){
                System.out.println("Programa encerrado! ");
                break;
            }
            
            switch(opcao){
                
                case 1: 
                    cadastroFuncionario();
                    break;
                    
                case 2: 
                    cadastraProduto();
                    break;
                    
                case 3: 
                    consultaFuncionario();
                    break;
                    
                case 4:
                    excluirFuncionario();
                    break;
                    
                default: 
                    System.out.println("Opção incorreta!");
                    break;
                
            }
        
            
            
        }
        
        
        
    }
    
    
    public static Funcionario funcionarioEncontrado(long CPF){
        for(Funcionario funcionario : listaFuncionario){
            if(funcionario.getCPF() == CPF){
                return funcionario;
            }
        }
        return null;
    }
    
     public static Produtos produtoEncontrado(String opcao){
        for(Produtos produto : listaProdutos){
            if(produto.getNomeProduto() == opcao){
                return produto;
            }
        }
        return null;
    }
    
    
    public static void cadastroFuncionario(){
       
        System.out.println("Cadastro de funcionário");
        
        while(true){
            
            String nome;
            long CPF;
           
            
            
            System.out.println("Digite o nome: ");
            nome = ler.next();
            
            System.out.println("Digite o CPF: ");
            CPF = ler.nextLong();
            
            Funcionario encontrarFuncionario = funcionarioEncontrado(CPF);
            
            
            if(encontrarFuncionario != null){
                System.out.println("Funcionário já cadastrado! ");
                continue;
            }
            
            
            Funcionario f = new Funcionario(nome, CPF);
            listaFuncionario.add(f);
            
            
            
            //f.registrarOpcao(encontrarProduto);
            
            //System.out.println(listaFuncionario.toString());
            
            
            //listaProdutos.add(encontrarProduto);
            
            
            //funcionario.registrarOpcao(opcao);
            
        }
        
        
        
        
        
    }
    
    public static void cadastraProduto(){
        System.out.println("**Cadastrar comida**");
        
        
        
        while(true){
            String item = "";
            int quantidade;
            
            System.out.println("Quantas comidas você deseja cadastrar? ");
            System.out.println("Para sair digite 0");
            quantidade = ler.nextInt();
            
            if(quantidade == 0){
                System.out.println("Programa encerrado! ");
                break;
            }
            
            
            for(int c=0; c < quantidade; c++){
                System.out.println("Digite a opção de comida: ");
                item = ler.next();

                Produtos encontrarProduto = produtoEncontrado(item);

                if(encontrarProduto != null){
                    System.out.println("Produto já cadastrado! ");
                    continue;
                }
                listaProdutos.add(encontrarProduto);
            }
            
            
        }
        
    }
    
    
    public static void consultaFuncionario(){
        
    }
    
    
    public static void excluirFuncionario(){
        
        
    }
    
    
}
