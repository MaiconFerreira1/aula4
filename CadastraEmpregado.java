import java.util.Scanner;

public class CadastraEmpregado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do empregado
        System.out.println("Informe o nome do empregado: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o salário do empregado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        // Solicitando os dados da empresa
        System.out.println("Informe a razão social da empresa: ");
        String razaoSocial = scanner.nextLine();

        System.out.println("Informe o CNPJ da empresa: ");
        String cnpj = scanner.nextLine();

        System.out.println("Informe o setor da empresa: ");
        String setor = scanner.nextLine();

        System.out.println("Informe o endereço da empresa: ");
        String endereco = scanner.nextLine();

        System.out.println("Informe o telefone da empresa: ");
        String fone = scanner.nextLine();

        // Criando o objeto Empresa
        Empresa empresa = new Empresa(razaoSocial, cnpj, setor, endereco, fone);

        // Criando o objeto Empregado
        Empregado empregado = new Empregado(nome, salario, empresa);

        // Exibindo os dados do empregado e da empresa
        empregado.exibirDados();

        scanner.close();
    }
}
