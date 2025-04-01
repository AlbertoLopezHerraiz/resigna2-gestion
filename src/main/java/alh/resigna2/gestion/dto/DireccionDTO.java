package alh.resigna2.gestion.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DireccionDTO {
    private String tipoVia;
    private String nombreVia;
    private String numero;
    private String portal;
    private String escalera;
    private String planta;
    private String puerta;
    private String codigoPostal;
    private String municipio;
    private String provincia;
    private String pais;
}
