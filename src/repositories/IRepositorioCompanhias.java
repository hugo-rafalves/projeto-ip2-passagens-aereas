package repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;

import entities.Companhia;
import entities.Local;
import entities.Voo;
import exceptions.CompanhiaExisteException;
import exceptions.CompanhiaInexistenteException;

public interface IRepositorioCompanhias {
	
	public Voo ProcurarVoo (Companhia comp, Local partida, Local destino, LocalDateTime saida, LocalDateTime chegada);
	public Companhia ProcurarCompanhia (Companhia comp);
	public void addCompanhia(Companhia comp) throws CompanhiaExisteException;
	public void removeCompanhia(Companhia comp) throws CompanhiaInexistenteException;
	public ArrayList<Companhia> listarCompanhias();
}
