public class questao4 {
    private double salarioBase;
    private EmpregadoComissao empregadoComissao;

    public questao4(String primeiroNome, String sobrenomePaterno,
                                     String numeroCPF, double vendasBrutas,
                                     double porcentagemComissao, double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("O salário base deve ser >= 0.0");
        }
        this.salarioBase = salarioBase;
        this.empregadoComissao = new EmpregadoComissao(primeiroNome, sobrenomePaterno,
                                                       numeroCPF, vendasBrutas, porcentagemComissao);
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("O salário base deve ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double entradas() {
        return getSalarioBase() + empregadoComissao.entradas();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s : %.2f", "salário base",
                empregadoComissao.toString(), "salário base", getSalarioBase());
    }
}
