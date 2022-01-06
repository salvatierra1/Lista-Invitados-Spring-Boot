package listaInvitados.invitados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import listaInvitados.invitados.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

	
}
