package listaInvitados.invitados.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import listaInvitados.invitados.dto.PersonaDTO;
import listaInvitados.invitados.entity.Persona;

@Component
public class PersonaMapper {
	
	public Persona personaDTO2Entity(PersonaDTO dto){
		 
		Persona personaEntity = new Persona();
		
		personaEntity.setNombre(dto.getNombre());
		personaEntity.setApellido(dto.getApellido());
		personaEntity.setDni(dto.getDni());
		
		return personaEntity;
			
		
	}
	
	public PersonaDTO personaEntity2DTO(Persona entity) {
		
		PersonaDTO dto = new PersonaDTO();
		
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setApellido(entity.getApellido());
		dto.setDni(entity.getDni());
		
		return dto;
		
	}
	
	public List<PersonaDTO>personaEntity2(List<Persona>listaEntity){
		List<PersonaDTO>dtoList = new ArrayList<>();
		for (Persona ent : listaEntity) {
			dtoList.add(personaEntity2DTO(ent));
		
		}
		return dtoList;
	}

	
}
