package Class;

import java.math.BigDecimal;
import java.math.MathContext;
import static java.math.RoundingMode.HALF_UP;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author guilh
 */
//2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).
public class Funcionario extends Pessoa{
    private String funcao;
    private BigDecimal salario;

    public Funcionario() {
        funcao = "";
        salario = new BigDecimal(0);
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao(){
        return funcao;
    }
    
    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }
    public BigDecimal getSalario(){
        return salario;
    }

    public void imprimeFuncionario() {
        System.out.println("\n");
        System.out.println("Funcionario: " + getNome() + "\nData de Nascimento:" + getData_nascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nSalario:" + salario + " R$" + "\nFunção:" + funcao);
    }

    public void aumentaSalario() {
        BigDecimal dezporcento = new BigDecimal("1.1");
        salario = salario.multiply(dezporcento);
    }

    public void contarSalarios() {
        BigDecimal quantSalariosMinimos = new BigDecimal("0", MathContext.DECIMAL32);        
        BigDecimal salarioMinimo = new BigDecimal("1212.00", MathContext.DECIMAL32);
        quantSalariosMinimos = salario.divide(salarioMinimo, 2, HALF_UP);
  
        System.out.println("\nNome: "+ getNome() + "    Quantidade de Salários Minimos: "+ quantSalariosMinimos);
        
    }

    
   
}
