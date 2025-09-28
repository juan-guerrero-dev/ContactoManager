package com.dev.guerrero.ContactManager.Service;

import com.dev.guerrero.ContactManager.Model.DatosContacto;
import com.dev.guerrero.ContactManager.Repository.DatosContactoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosContactosServiceImpl implements DatosContactosService {

    private final DatosContactoRepo repo;

    public DatosContactosServiceImpl(DatosContactoRepo repo) {
        this.repo = repo;
    }

    @Override
    public DatosContacto guardar(DatosContacto contacto) {
        return repo.save(contacto);
    }

    @Override
    public List<DatosContacto> obtenerTodos() {
        return repo.findAll();
    }

    @Override
    public DatosContacto obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}

