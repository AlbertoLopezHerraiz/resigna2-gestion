package alh.resigna2.gestion.controller;

import alh.resigna2.gestion.dto.PersonaResponseDTO;
import alh.resigna2.gestion.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/persona")
@RequiredArgsConstructor
@RestController
public class PersonaController {

    private final PersonaService personaService;

    @GetMapping("/{dni}")
    public ResponseEntity<PersonaResponseDTO> hola(@PathVariable(name = "dni") String dni) {
        PersonaResponseDTO persona = personaService.obtenerPersonaDni(dni);
        return ResponseEntity.ok().body(persona);
    }

}
