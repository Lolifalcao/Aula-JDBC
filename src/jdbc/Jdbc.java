package jdbc;

import jdbc.dao.DaoContato;
import jdbc.entidades.Contato;
import jdbc.utilidades.Conexao;

public class Jdbc {
	public static void main(String[] args) {
		/*if(Conexao.conectar() != null) {
			System.out.println("Conectado");
		}
		else {
			System.out.println("Erro ao conectar");
		}*/
		
		/*Contato c1 = new Contato("Carol","777776666","carol@gmail.com");
		DaoContato dc = new DaoContato();
		if(dc.salvar(c1)) {
			System.out.println("Contato cadastrado com sucesso");
		}*/
		
		/*Contato c2 = new Contato("José","888885555","jose@gmail.com");
		DaoContato dc = new DaoContato();
		if(dc.salvar(c2)) {
			System.out.println("Contato cadastrado com sucesso");
		}*/
		
		DaoContato dc = new DaoContato();
		//System.out.println(dc.consultar());
		//System.out.println(dc.consultar(2));
		
		/*Contato contato = dc.consultar(3);
		System.out.println(contato);
		contato.setNome("Alice");
		contato.setFone("444445555");
		contato.setEmail("alice@gmail.com");
			if(dc.alterar(contato)) {
				System.out.println("contato alterado com sucesso");
				System.out.println(contato);
			}*/
		
		Contato contato = dc.consultar(3);
		System.out.println(contato);
		dc.excluir(3);
		contato = dc.consultar(3);
		System.out.println(contato);
			
		System.out.println("fim");
		
	}

}
