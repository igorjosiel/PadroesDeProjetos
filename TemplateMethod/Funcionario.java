
package tamplate;

abstract class Funcionario
{
    protected String nome;
    protected double salarioBruto;
    protected int dependentes;
    
    public double calcularSalario(double perc)
    {
        double salario = salarioBruto + calcularSalarioFamilia();
        
        salario = salario + calcularSalarioFamilia();
        salario = salario + calcularImposto();
        
        return salario;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + nome + " \n salario: " + calcularSalario(0);
    }
    
    protected abstract double calcularImposto();
    protected abstract double calcularSalarioFamilia();
    
}
