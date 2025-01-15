import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario implements Serializable {


    @Serial
    private static final long serialVersionUID = 7071115182679160551L;

    private String nome;
    private LocalDate date;
    private transient BigDecimal salario;

    public Funcionario(String nome, LocalDate date, BigDecimal salario) {
        this.nome = nome;
        this.date = date;
        this.salario = salario;
    }

    public void testar(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

}