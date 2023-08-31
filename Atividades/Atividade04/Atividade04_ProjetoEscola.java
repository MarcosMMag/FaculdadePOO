import java.util.LocalDate;

    public abstract class BaseIdentificador {
        protected int codigo;

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
    }

    public abstract class BaseDadosComuns {
        protected LocalDate dataInsercao;

        public LocalDate getDataInsercao() {
            return dataInsercao;
        }

        public void setDataInsercao(LocalDate dataInsercao) {
            this.dataInsercao = dataInsercao;
        }
    }

    public abstract class BasePessoa {
        protected String endereco;
        protected String telefone;

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    }

    public class BasePessoaFisica extends BasePessoa {
        protected String nome;
        protected String rg;
        protected String cpf;
        protected LocalDate dataNascimento;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
    }

    public class BasePessoaJuridica extends BasePessoa {
        protected String nomeFantasia;
        protected String razaoSocial;
        protected String cnpj;
        protected String ie;
        protected LocalDate dataAbertura;

        public String getNomeFantasia() {
            return nomeFantasia;
        }

        public void setNomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
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

        public String getIe() {
            return ie;
        }

        public void setIe(String ie) {
            this.ie = ie;
        }

        public LocalDate getDataAbertura() {
            return dataAbertura;
        }

        public void setDataAbertura(LocalDate dataAbertura) {
            this.dataAbertura = dataAbertura;
        }
    }

    public abstract class BaseFuncionario {
        protected String cracha;
        protected String registro;
        protected LocalDate dataVinculoInicial;
        protected LocalDate dataVinculoFinal;

        public String getCracha() {
            return cracha;
        }

        public void setCracha(String cracha) {
            this.cracha = cracha;
        }

        public String getRegistro() {
            return registro;
        }

        public void setRegistro(String registro) {
            this.registro = registro;
        }

        public LocalDate getDataVinculoInicial() {
            return dataVinculoInicial;
        }

        public void setDataVinculoInicial(LocalDate dataVinculoInicial) {
            this.dataVinculoInicial = dataVinculoInicial;
        }

        public LocalDate getDataVinculoFinal() {
            return dataVinculoFinal;
        }

        public void setDataVinculoFinal(LocalDate dataVinculoFinal) {
            this.dataVinculoFinal = dataVinculoFinal;
        }
    }

    public class Aluno {
        protected String matricula;
        protected LocalDate dataMatricula;

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public LocalDate getDataMatricula() {
            return dataMatricula;
        }

        public void setDataMatricula(LocalDate dataMatricula) {
            this.dataMatricula = dataMatricula;
        }
    }

    public class Professor {
        protected String registro;
        protected String cadeira;

        public String getRegistro() {
            return registro;
        }

        public void setRegistro(String registro) {
            this.registro = registro;
        }

        public String getCadeira() {
            return cadeira;
        }

        public void setCadeira(String cadeira) {
            this.cadeira = cadeira;
        }
    }

    public class Fornecedor {
        protected String servico;
        protected LocalDate dataContrato;
        protected int periodoEmMeses;

        public String getServico() {
            return servico;
        }

        public void setServico(String servico) {
            this.servico = servico;
        }

        public LocalDate getDataContrato() {
            return dataContrato;
        }

        public void setDataContrato(LocalDate dataContrato) {
            this.dataContrato = dataContrato;
        }

        public int getPeriodoEmMeses() {
            return periodoEmMeses;
        }

        public void setPeriodoEmMeses(int periodoEmMeses) {
            this.periodoEmMeses = periodoEmMeses;
        }
    }

    public class Main {
        public static void main(String[] args) {
        }
    }
