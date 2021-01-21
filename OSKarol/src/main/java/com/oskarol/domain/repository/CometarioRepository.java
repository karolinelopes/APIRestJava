package com.oskarol.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oskarol.api.model.Comentario;

@Repository
public interface CometarioRepository extends JpaRepository<Comentario, Long> {

}
