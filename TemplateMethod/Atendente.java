
package tamplate;

public class Atendente extends Funcionario
{
    public Atendente(String nome, double salarioBruto, int dependentes)
    {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.dependentes = dependentes;
    }
    
    @Override
    protected double calcularImposto()
    {
        return ((salarioBruto - 2100) * 0.125) + salarioBruto * 0.11;
    }
    
    @Override
    protected double calcularSalarioFamilia()
    {
        return salarioBruto + dependentes + 0.03;
    }
}
