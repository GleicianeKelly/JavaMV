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
            System.out.println("Digite 1 para cadastrar produtos");
            System.out.println("Digite 2 para cadastrar funcionário");
            System.out.println("Digite 3 para consultar funcionário");
            System.out.println("Digite 4 para excluir funcionário");
            opcao = ler.nextInt();
            
            if(opcao == 0){
                System.out.println("Programa encerrado! ");
                break;
            }
            
            switch(opcao){
                
                case 1: 
                    cadastraProduto();
                    break;
                    
                case 2: 
                    cadastroFuncionario();
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
    
     public static Produtos produtoEncontrado(String item){
        for(Produtos produto : listaProdutos){
            if(produto.getNomeProduto().equals(item)){
                return produto;
            }
        }
        return null;
    }
    
     
     public static void cadastraProduto(){
        System.out.println("**Cadastrar comida**");
        
        
        
        while(true){
            
            String item;
            
            System.out.println("Digite a opção de comida: ");
            System.out.println("Digite 0 para encerrar");
            item = ler.next();
                
            if(item.equals("0")){
                System.out.println("Programa encerrado! ");
                break;
            }
            
            Produtos encontrarProduto = produtoEncontrado(item);
           

            if(encontrarProduto != null){
                    System.out.println("Produto já cadastrado! ");
                    continue;
            }    

               
            Produtos produtos = new Produtos(item);    
            
            listaProdutos.add(produtos);
            
            System.out.println(listaProdutos.toString());
                
            }
            
            
        }
        
    
     
     
     
    
    public static void cadastroFuncionario(){
       
        System.out.println("Cadastro de funcionário");
        
        while(true){
            
            String nome;
            long CPF;
            String item;
           
            System.out.println("Digite 0 para sair");
            
            System.out.println("Digite o nome: ");
            nome = ler.next();
            
            if(nome.equals("0")){
                System.out.println("Cadastro encerrado! ");
                return;
            }
            
            System.out.println("Digite o CPF: ");
            CPF = ler.nextLong();
            
            if(CPF == 0){
                System.out.println("Cadastro encerrado! ");
                return;
            }
            
            Funcionario encontrarFuncionario = funcionarioEncontrado(CPF);
            
            
            if(encontrarFuncionario != null){
                System.out.println("Funcionário já cadastrado! ");
                continue;
            }
            
            
            while(true){
                System.out.println("Digite o item que vai levar: ");
                item = ler.next();

                Produtos encontrarProduto = produtoEncontrado(item);

                if(item.equals("0")){
                    break;
                }
                
                if(encontrarProduto == null){
                    System.out.println("Produto não cadastrado! ");
                    continue;
                }    
                
                
                for(Funcionario funcionario : listaFuncionario) {
                    for(Produtos produto : funcionario.getProdutos()) {
                        if(encontrarProduto == produto) {
                            System.out.println("Este produto já está sendo "
                                    + "levado por outro funcionário.");
                            break;
                        }
                    }
                    break;
                }
                
                Funcionario f = new Funcionario(nome, CPF);
                listaFuncionario.add(f);

                f.registrarOpcao(encontrarProduto);

                for(Funcionario funcionario : listaFuncionario){
                    System.out.println(funcionario.toString());
            
                }
                
                
            }   
                
        }        
            
                
        }
                    
    public static void consultaFuncionario(){
        System.out.println("**Consultar funcionário**");
        
        
        while(true){
            
            long CPF;
            
            System.out.println("Digite o CPF do funcionário: ");
            System.out.println("Para sair digite 0");
            CPF = ler.nextInt();
            
            
            
            if(CPF == 0){
                System.out.println("Programa encerrado! ");
                return;
            }
            
            Funcionario encontrarFuncionario = funcionarioEncontrado(CPF);
            
            
            if(encontrarFuncionario == null){
                System.out.println("Funcionário não cadastrado");
                continue;
            }
            
            System.out.println(encontrarFuncionario.toString());
            
                
                
                
            }
            
        }
    
    
    
    public static void excluirFuncionario(){
        System.out.println("**Ecluir funcionário**");
        
        
        while(true){
            
            long CPF;
            
            System.out.println("Digite o CPF do funcionário: ");
            System.out.println("Para sair digite 0");
            CPF = ler.nextInt();
            
            
            
            if(CPF == 0){
                System.out.println("Programa encerrado! ");
                return;
            }
            
            Funcionario encontrarFuncionario = funcionarioEncontrado(CPF);
            
            
            if(encontrarFuncionario == null){
                System.out.println("Funcionário não cadastrado");
                continue;
            }
            
            listaFuncionario.remove(encontrarFuncionario);
            
            System.out.println(listaFuncionario.toString());
            
            
            
        }
        
        
        
    }
    
    
}
