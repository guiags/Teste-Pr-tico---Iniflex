package Class;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author guilh
 */
//1– Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).
public class Pessoa {
    private String nome;
    private LocalDate data_nascimento;
 
    
    public Pessoa() {
        nome = "";
        data_nascimento = LocalDate.of(3000,Month.JANUARY, 1);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    
    
    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public LocalDate getData_nascimento() {
        return data_nascimento;
    }
    
}
