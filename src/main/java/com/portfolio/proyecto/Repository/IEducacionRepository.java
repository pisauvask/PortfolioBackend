
package com.portfolio.proyecto.Repository;

import com.portfolio.proyecto.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Long> {
    
}
