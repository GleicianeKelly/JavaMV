package testemv;

public class Funcionario {
    
    
    private String nome;
    private long CPF;
   

    @Override
    public String toString() {
        return "\nFuncionario: " + this.getNome() + "\nCPF: " + this.getCPF();
    }

    public Funcionario(String nome, long CPF) {
        this.nome = nome;
        this.CPF = CPF;
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


    
}
