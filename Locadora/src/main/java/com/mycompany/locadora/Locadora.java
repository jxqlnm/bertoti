/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author Fatec
 */
import java.util.LinkedList;
import java.util.List;

public class Locadora {

     private final List<Filme> filmes = new LinkedList<>();

     public void cadastrarCarro(Filme filme){
          filmes.add(filme);
     }

     public List<Filme> buscarFilmePorEspecificacao(Especificacao espec){
           List<Filme> filmesEncontrados = new LinkedList<>();
           for(Filme filme:filmes){
               
            if(filme.getEspec().comparar(espec)) filmesEncontrados.add(filme);
           }
           return filmesEncontrados;
     }

     public Filme buscarFilmePorNome(String nome){
          for(Filme filme:filmes){
          if(filme.getNome().equals(nome)) return filme; 
          }
          return null;
     }

     public List<Filme> getFilmes(){
           return filmes;
     }
}
