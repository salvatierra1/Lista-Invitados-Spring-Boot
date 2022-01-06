package listaInvitados.invitados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import listaInvitados.invitados.dto.PersonaDTO;
import listaInvitados.invitados.service.PersonaService;

@RestController
@RequestMapping("personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@PostMapping
	public ResponseEntity<PersonaDTO>save(@RequestBody PersonaDTO persona){
		
		PersonaDTO personaGuardada = personaService.save(persona);
		return ResponseEntity.status(HttpStatus.CREATED).body(personaGuardada);

}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>delete(@PathVariable Long id){
		personaService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@GetMapping("persona")
	public ResponseEntity<List<PersonaDTO>>obtenerPersonas(){
		List<PersonaDTO>personasList = personaService.traerPersona();
		return ResponseEntity.status(HttpStatus.OK).body(personasList);
	}
}
