/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author Fatec
 */
public class Especificacao {
	
	private String genero;
	private String estudio;
	private String diretor;

	public Especificacao(String genero, String estudio, String diretor) {
		this.genero = genero;
		this.estudio = estudio;
		this.diretor = diretor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String novoGenero) {
		this.genero = novoGenero;
	}
	
	public String getEstudio() {
		return estudio;
	}
	
	public void setEstudio(String novoEstudio) {
		this.estudio = novoEstudio;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String novoDiretor) {
		this.diretor = novoDiretor;
	}
	
	public boolean comparar(Especificacao especificacao){
		if(this.genero.equals(especificacao.genero) &&            					
                   this.estudio.equals(especificacao.estudio) && 					
                   this.diretor.equals(especificacao.diretor)){
			return true;
		} else {
			return false;
		}
	}

}

