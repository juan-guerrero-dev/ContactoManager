package com.dev.guerrero.ContactManager.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "datosContacto")
public class DatosContacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "numeroTelefono", length = 15, nullable = false)
    private String numeroTelefono;
}
