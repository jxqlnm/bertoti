/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.locadora;

/**
 *
 * @author Fatec
 */
public class Filme {
	
	private String nome;
	private Especificacao espec;
        public Filme(String nome, Especificacao espec) {
		this.nome = nome;
		this.espec = espec;
	}

	public String getNome(){
		return nome;
	}
	
	public void setPlaca(String novoNome){
		nome = novoNome;
	}

	public Especificacao getEspec() {
		return espec;
	}

	public void setEspec(Especificacao espec) {
		this.espec = espec;}

    Object getPlaca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}