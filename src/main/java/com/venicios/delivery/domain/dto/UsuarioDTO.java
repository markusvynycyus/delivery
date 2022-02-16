package com.venicios.delivery.domain.dto;


import com.venicios.delivery.domain.model.Usuario;


public class UsuarioDTO { // Objeto que vai ser exposto para o mundo externo.
    private Long id;
    private String nome;

    public UsuarioDTO(){
    }

    public UsuarioDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
     //  Constrtutor q recebe a Entidade para facilitar a conversão de entidade em DTO
    public UsuarioDTO(Usuario usuario){
        id = usuario.getId();
        nome = usuario.getNome();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
