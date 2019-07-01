package entities;
import exceptions.*;

public class Bilhete {
	
	private Passageiro passageiro;
	private Voo voo;
	private int assento;
	private double valor;
	private Companhia companhia;
	
	public Bilhete (Passageiro passageiro, Companhia companhia, Voo voo ,int assento) 
			throws AssentoInvalidoException, AssentoOcupadoException, VooNaoExisteException {
		if (companhia == null || passageiro == null || voo == null || assento < 0) {
            throw new IllegalArgumentException();
        }
		this.valor = companhia.valorBilhete(voo);
		this.passageiro = passageiro;
        this.voo = voo;
        this.assento = assento;
        this.voo.marcarAssento(assento);
	}
	
	public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }
    
    public String getNomePassageiro() {
        return passageiro.getNome();
    }

    public long getCpfPassageiro() {
        return passageiro.getCpf();
    }
    
    public double getValor() {
    	return this.valor;
    }

	public Companhia getCompanhia() {
		return companhia;
	}

	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}
    
}