package listaInvitados.invitados.service;

import java.util.List;

import listaInvitados.invitados.dto.PersonaDTO;

public interface PersonaService {



	PersonaDTO save(PersonaDTO dto);

	void delete(Long id);

	List<PersonaDTO>traerPersona();

	
}
