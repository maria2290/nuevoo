package com.leidy.trabajo.dao;

import com.leidy.trabajo.Dto.UsuarioDto;

public class UsuariosDao {
    ArrayList<HerramientaDto> herramientaDtos;

    public HerramientasDao() {
        this.herramientaDtos = new ArrayList<>();
    }
    public ArrayList<HerramientaDto>  leerTodos() {
        return this.herramientaDtos;
    }
    public void guardarTodos(ArrayList<HerramientaDto> herramientas) {
        herramientaDtos = herramientas;
    }
}

