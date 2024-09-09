public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private String setor;
    private String endereco;
    private String fone;

    public Empresa(String razaoSocial, String cnpj, String setor, String endereco, String fone){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.setor = setor;
        this.endereco = endereco;
        this.fone = fone;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }


}

