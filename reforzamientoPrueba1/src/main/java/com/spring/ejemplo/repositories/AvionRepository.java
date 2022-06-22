package com.spring.ejemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ejemplo.models.Avion;

/*public interface para que se interprete como tal */
/*<objeto, tipoDato ID> */
@Repository
public interface AvionRepository extends JpaRepository<Avion, Long> {
    
}
