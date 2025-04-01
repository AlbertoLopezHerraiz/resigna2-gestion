package alh.resigna2.gestion.mappers;

import alh.resigna2.gestion.dto.DireccionDTO;
import alh.resigna2.gestion.entities.Direccion;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DireccionMapper {

    public static DireccionDTO toDTO(Direccion entity){
        return DireccionDTO.builder()
                .tipoVia(entity.getTipoVia())
                .nombreVia(entity.getNombreVia())
                .numero(entity.getNumero())
                .portal(entity.getPortal())
                .escalera(entity.getEscalera())
                .planta(entity.getPlanta())
                .puerta(entity.getPuerta())
                .codigoPostal(entity.getCodigoPostal())
                .municipio(entity.getMunicipio())
                .provincia(entity.getProvincia())
                .pais(entity.getPais())
                .build();
    }
}
