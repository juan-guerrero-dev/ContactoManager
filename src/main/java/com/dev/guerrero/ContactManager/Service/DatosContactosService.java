package com.dev.guerrero.ContactManager.Service;

import com.dev.guerrero.ContactManager.Model.DatosContacto;

import java.util.List;

public interface DatosContactosService{
    DatosContacto guardar(DatosContacto datosContacto);
    List<DatosContacto> obtenerTodos();
    DatosContacto obtenerPorId(Long id);
    void eliminar(Long id);
}
