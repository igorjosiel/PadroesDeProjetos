
package tamplate;

public class Tamplate
{

    public static void main(String[] args)
    {
        Funcionario funcionario = new Gerente("Carlos", 5000, 5);
        
        System.out.println("Gerente - salario: " + funcionario.calcularSalario(300));
        
        Funcionario funcionario2 = new Atendente("Lucia", 1200, 2);
        
        System.out.println("Atendente - salario: " + funcionario2.calcularSalario(10));
        
        Funcionario funcionario3 = new Estoquista("Lauro", 15000, 3);
        
        System.out.println("Estoquista - salario: " + funcionario3.calcularSalario(20));
    }
}
