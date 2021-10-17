package testemv;
import java.util.List;
import java.util.ArrayList;
public class CafeDaManha {
    
    
    private Funcionario funcionario;
    private List<Produtos> opcao;
    
    

    public CafeDaManha(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.opcao = new ArrayList<Produtos>();
    }

    @Override
    public String toString() {
        return "CafeDaManha{" + "funcionario=" + funcionario + ", opcao=" + opcao + '}';
    }
    
    
    

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Produtos> getOpcao() {
        return opcao;
    }

    public void setOpcao(List<Produtos> opcao) {
        this.opcao = opcao;
    }
    
    
    
     public void registrarOpcao(Produtos encontrarProdutos){
       
       this.opcao.add(encontrarProdutos);
       
   }
    
}
