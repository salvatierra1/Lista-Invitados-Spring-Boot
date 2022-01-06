package listaInvitados.invitados.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import listaInvitados.invitados.dto.PersonaDTO;
import listaInvitados.invitados.entity.Persona;
import listaInvitados.invitados.mapper.PersonaMapper;
import listaInvitados.invitados.repository.PersonaRepository;
import listaInvitados.invitados.service.PersonaService;

@Service
public class PersonaImpl implements PersonaService {
	
	@Autowired
	private PersonaMapper perMapper;
	
	@Autowired
	private PersonaRepository perRepository;
	
	public PersonaDTO save(PersonaDTO dto) {
		
		Persona entity = perMapper.personaDTO2Entity(dto);
		
		Persona entitySaved = perRepository.save(entity);
		
		PersonaDTO result = perMapper.personaEntity2DTO(entitySaved);
		
		return result;
		
	}
	
	public void delete(Long id) {
		perRepository.deleteById(id);
	}
	
	@Override
	public List<PersonaDTO>traerPersona(){
		List<Persona>listaEntity = perRepository.findAll();
		List<PersonaDTO>resultado = perMapper.personaEntity2(listaEntity);
		return resultado;
	}

}
