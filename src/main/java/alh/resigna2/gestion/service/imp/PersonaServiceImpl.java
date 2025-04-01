package alh.resigna2.gestion.service.imp;

import alh.resigna2.gestion.dto.PersonaResponseDTO;
import alh.resigna2.gestion.entities.Persona;
import alh.resigna2.gestion.mappers.PersonaMapper;
import alh.resigna2.gestion.repositories.PersonaRepository;
import alh.resigna2.gestion.service.PersonaService;
import alh.resigna2.gestion.utils.MessageUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonaServiceImpl implements PersonaService {
    private final PersonaRepository personaRepository;
    private final MessageUtils messageUtils;
    @Override
    public PersonaResponseDTO obtenerPersonaDni(String dni) {
        PersonaResponseDTO response = new PersonaResponseDTO();
        Persona persona = personaRepository.findByDni(dni).orElse(null);
        if(persona == null){
            return PersonaResponseDTO.builder().error(messageUtils.getText("persona.null")).build();
        }
        System.out.println(persona);
        response.setPersona(PersonaMapper.toDTO(persona));
        return response;
    }
}
