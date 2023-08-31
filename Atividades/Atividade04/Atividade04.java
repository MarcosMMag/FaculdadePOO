import java.util.LocalDate;

public abstract class BasePessoa {
    protected int codigo;
    protected String nome;
    protected String email;
    protected String telefone;
    protected LocalDate dataNascimento;
    protected String usuario;
    protected String senha;

    public BasePessoa(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

public class Funcionario extends BasePessoa {
    protected String contaCorrente;
    protected String registro;
    protected String cracha;

    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario, String senha, String contaCorrente, String registro, String cracha) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
}

public class Passageiro extends BasePessoa {
    protected String numeroCartao;
    protected String documento;

    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario, String senha, String numeroCartao, String documento) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

