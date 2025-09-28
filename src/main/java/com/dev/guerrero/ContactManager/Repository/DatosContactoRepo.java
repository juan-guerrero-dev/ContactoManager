package com.dev.guerrero.ContactManager.Repository;

import com.dev.guerrero.ContactManager.Model.DatosContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosContactoRepo extends JpaRepository<DatosContacto, Long> {
}
