package br.com.ifal.dao;

import java.util.ArrayList;

import br.com.ifal.core.Contato;

public class ContatoDAO {

	private static int id = 0;
	private static ContatoDAO instance;
	private static ArrayList<Contato> contatos;

	static {
		contatos = new ArrayList<Contato>();
		instance = new ContatoDAO();
	}

	public static ContatoDAO getInstance() {
		return instance;
	}

	public void addTarefa(Contato contato) {
		contato.setId(++id);
		contatos.add(contato);
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}
}
