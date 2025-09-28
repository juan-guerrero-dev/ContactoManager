package com.dev.guerrero.ContactManager.Controller;

import com.dev.guerrero.ContactManager.Model.DatosContacto;
import com.dev.guerrero.ContactManager.Service.DatosContactosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contactos")
public class DatosContactosController {

    private final DatosContactosService service;

    @Autowired
    public DatosContactosController(DatosContactosService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> guardarContacto(@RequestBody DatosContacto contacto) {
        service.guardar(contacto);
        return ResponseEntity.ok("Contacto añadido con exito");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> borrarContacto(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.ok("Contacto eliminado con exito");
    }

    @GetMapping
    public List<DatosContacto> obtenerListaContacto(){
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public DatosContacto obtenerContacto(@PathVariable long id){
        return service.obtenerPorId(id);
    }


}

