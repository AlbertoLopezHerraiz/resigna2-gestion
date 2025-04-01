package alh.resigna2.gestion.mappers;

import alh.resigna2.gestion.dto.PersonaDTO;
import alh.resigna2.gestion.entities.Persona;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonaMapper {
    public static PersonaDTO toDTO(Persona entity){
        return PersonaDTO.builder()
                .dni(entity.getDni())
                .nombre(entity.getNombre())
                .edad(entity.getEdad().toString())
                .direccion(DireccionMapper.toDTO(entity.getDireccion()))
                .build();
    }
}
