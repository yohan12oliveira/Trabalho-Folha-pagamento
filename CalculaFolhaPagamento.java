
public class CalculaFolhaPagamento {
	
	private	double horasTrab;
	private double salarioHora;
	private double dependentes;
	


public CalculaFolhaPagamento(double horasTrab, double salarioHora, int dependentes) {
		
		this.setHorasTrab(horasTrab);
		this.setSalarioHora(salarioHora);
		this.setDependentes(dependentes);
	}



public double getHorasTrab() {
		return horasTrab;
	}

public void setHorasTrab(double horasTrab) {
		this.horasTrab = horasTrab;
	}

public double getSalarioHora() {
		return salarioHora;
	}

public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

public double getDependentes() {
		return dependentes;
	}

public void setDependentes(double dependentes) {
		this.dependentes = dependentes;
	}
	
		double salarioBruto() {
			return (getHorasTrab() * getSalarioHora() ) + (50 * getDependentes()); 
		}
		
public double  descontoInss() {
			
		if(salarioBruto() <= 1000) {
				return salarioBruto() * 8.5/100;
			}else if(salarioBruto() > 1000) {
				return salarioBruto() * 9/100;
			}
			
			return 0;
		}

public double descontoIr() {
	if(salarioBruto() <= 500) {
		return 0;
	}else if(salarioBruto() > 500 && salarioBruto() <= 1000) {
		return salarioBruto() * 5 / 100;
	}else if(salarioBruto() > 1000) {
		return salarioBruto() * 7  /100;
	}
		return 0;
}

public double salarioLiquido() {
	
	return salarioBruto() - descontoInss() - descontoIr(); 
			
	}
}