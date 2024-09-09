public class Empregado {
    // Atributos do empregado
    private String nome;
    private double salario;
    private Empresa empresa;

    // Construtor para inicializar os atributos do empregado
    public Empregado(String nome, double salario, Empresa empresa) {
        this.nome = nome;
        this.salario = salario;
        this.empresa = empresa;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    // Método para exibir os dados do empregado e da empresa
    public void exibirDados() {
        System.out.println("Nome do Empregado: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Empresa: " + empresa.getRazaoSocial());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Setor: " + empresa.getSetor());
        System.out.println("Endereço: " + empresa.getEndereco());
        System.out.println("Fone: " + empresa.getFone());
    }
}

