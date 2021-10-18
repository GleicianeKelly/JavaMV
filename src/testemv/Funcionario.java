package testemv;
import java.util.List;
import java.util.ArrayList;
public class Funcionario {
    
    
    private String nome;
    private long CPF;
    private List<Produtos> produtos;


    public Funcionario(String nome, long CPF) {
        this.nome = nome;
        this.CPF = CPF;
        this.produtos = new ArrayList<Produtos>();
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

   
    @Override
       public String toString() {
           String resposta = "Nome:" + this.nome +
                      "cpf: "  + this.CPF +
                       "Produtos: " ;
            for(Produtos produto : this.produtos) {

            resposta += "Nome do produto: " + produto.getNomeProduto();
        }
            return resposta;
           
           
       }
   
    
       
       
    public void registrarOpcao(Produtos encontrarProdutos){
       
       this.produtos.add(encontrarProdutos);
       
    }
    
}
