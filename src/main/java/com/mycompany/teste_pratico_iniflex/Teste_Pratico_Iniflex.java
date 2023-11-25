package com.mycompany.teste_pratico_iniflex;

import Class.Funcionario;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author guilh
 */
public class Teste_Pratico_Iniflex {
    
    public static final int SIZEARRAY = 9;
    // 3 – Deve conter uma classe Principal para executar as seguintes ações.
    public static void main(String[] args) {
    // 3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario());
        
        
        for(int i = 0; i<SIZEARRAY; i++){
            //funcionarios[i] = new Funcionario();
            funcionarios.add(new Funcionario());
        }
        
        funcionarios.get(0).setNome("Maria");
        funcionarios.get(0).setData_nascimento(LocalDate.of(2000,Month.OCTOBER, 18));
        funcionarios.get(0).setFuncao("Operador");
        funcionarios.get(0).setSalario(BigDecimal.valueOf(2009.44));
        
        funcionarios.get(1).setNome("João");
        funcionarios.get(1).setData_nascimento(LocalDate.of(1990,Month.MAY, 12));
        funcionarios.get(1).setFuncao("Operador");
        funcionarios.get(1).setSalario(BigDecimal.valueOf(2284.38));
        
        funcionarios.get(2).setNome("Caio");
        funcionarios.get(2).setData_nascimento(LocalDate.of(1961,Month.MAY, 02));
        funcionarios.get(2).setFuncao("Coordenador");
        funcionarios.get(2).setSalario(BigDecimal.valueOf(9836.14));
        
        funcionarios.get(3).setNome("Miguel");
        funcionarios.get(3).setData_nascimento(LocalDate.of(1988,Month.OCTOBER, 14));
        funcionarios.get(3).setFuncao("Diretor");
        funcionarios.get(3).setSalario(BigDecimal.valueOf(19119.88));

        funcionarios.get(4).setNome("Alice");
        funcionarios.get(4).setData_nascimento(LocalDate.of(1995,Month.JANUARY, 05));
        funcionarios.get(4).setFuncao("Recepcionista");
        funcionarios.get(4).setSalario(BigDecimal.valueOf(2234.68));
        
        funcionarios.get(5).setNome("Heitor");
        funcionarios.get(5).setData_nascimento(LocalDate.of(1999,Month.NOVEMBER, 19));
        funcionarios.get(5).setFuncao("Operador");
        funcionarios.get(5).setSalario(BigDecimal.valueOf(1582.72));
        

        funcionarios.get(6).setNome("Arthur");
        funcionarios.get(6).setData_nascimento(LocalDate.of(1993,Month.MARCH, 31));
        funcionarios.get(6).setFuncao("Contador");
        funcionarios.get(6).setSalario(BigDecimal.valueOf(4071.84));
        
        funcionarios.get(7).setNome("Laura");
        funcionarios.get(7).setData_nascimento(LocalDate.of(1994,Month.JULY, 8));
        funcionarios.get(7).setFuncao("Gerente");
        funcionarios.get(7).setSalario(BigDecimal.valueOf(3017.45));        
        
        funcionarios.get(8).setNome("Heloísa");
        funcionarios.get(8).setData_nascimento(LocalDate.of(2003,Month.MAY, 24));
        funcionarios.get(8).setFuncao("Eletricista");
        funcionarios.get(8).setSalario(BigDecimal.valueOf(1606.85));        
        
        funcionarios.get(9).setNome("Helena");
        funcionarios.get(9).setData_nascimento(LocalDate.of(1996,Month.SEPTEMBER, 02));
        funcionarios.get(9).setFuncao("Gerente");
        funcionarios.get(9).setSalario(BigDecimal.valueOf(2799.93));       
        
        
        
        //3.2 – Remover o funcionário “João” da lista.
        for (Funcionario funcionario : funcionarios) {
            if ("João".equals(funcionario.getNome())) {
                funcionarios.remove(funcionario);
                break;
            }
        }
        
        
        // 3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
        //• informação de data deve ser exibido no formato dd/mm/aaaa;
        //• informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.(NAO SOUBE RESOLVER).
        System.out.println("Item 3.3:");
        for(Funcionario funcionario: funcionarios){
            funcionario.imprimeFuncionario();
        }
        
        //3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.4:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentaSalario();
            funcionario.imprimeFuncionario();
        }
        
        //3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.5:");
        
        ArrayList<String> listaFuncoes = new ArrayList<>();
        int contagemRepete = 0; 
        for(Funcionario funcionario : funcionarios){
            for(String funcoes : listaFuncoes){
                if(funcionario.getFuncao().equals(funcoes)){
                    contagemRepete++;
                } 
            }
            if(contagemRepete == 0){
                listaFuncoes.add(funcionario.getFuncao());
            }    
            contagemRepete = 0;
        }
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String funcoes : listaFuncoes){
            ArrayList<String> listaFuncionariosMap = new ArrayList<>();
            for(Funcionario funcionario : funcionarios){
               if(funcionario.getFuncao().equals(funcoes)){
                    listaFuncionariosMap.add(funcionario.getNome());
               }    
            }  
            map.put(funcoes, listaFuncionariosMap);  
        }
            
        System.out.println(map);
        
        
        
        //3.6 – Imprimir os funcionários, agrupados por função.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.6:");
        System.out.println(map);
        
        
        
        
        //3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.8:");
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getData_nascimento().getMonth().equals(Month.DECEMBER) || funcionario.getData_nascimento().getMonth().equals(Month.OCTOBER)){
                funcionario.imprimeFuncionario();
            }
        }
        
        
        //3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.9:");
        Funcionario funcionarioAuxiliar = new Funcionario();
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getData_nascimento().getYear() < funcionarioAuxiliar.getData_nascimento().getYear() ){
                funcionarioAuxiliar = funcionario; 
            }
        }
        funcionarioAuxiliar.imprimeFuncionario();        
        
        
        //3.10 – Imprimir a lista de funcionários por ordem alfabética.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.10:");
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for(char alf : alfabeto){
            for(Funcionario funcionario : funcionarios){
                if(funcionario.getNome().charAt(0) == alf){
                    funcionario.imprimeFuncionario();
                } 
            }
        }
        
        
        //3.11 – Imprimir o total dos salários dos funcionários.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.11:");
        BigDecimal folhaPagamento = new BigDecimal(0);
        for(Funcionario funcionario : funcionarios){
            folhaPagamento = funcionario.getSalario().add(folhaPagamento);
        }
        System.out.println("\nO valor total da Folha de Pagamento da empresa é: " + folhaPagamento + "R$.");
        
        
        //3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
        System.out.println("\n------------------------------------------------------------------------------\nItem 3.12:");
        for(Funcionario funcionario : funcionarios){
            funcionario.contarSalarios();
        }
        
        
        
        
        
        
        
        
         
    }
}