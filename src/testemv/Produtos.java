package testemv;
public class Produtos {
    
    
    private String nomeProduto;

    @Override
    public String toString() {
        return "Produtos{" + "nomeProduto=" + nomeProduto + '}';
    }

    
    
    public Produtos(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
   
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    


    
}
