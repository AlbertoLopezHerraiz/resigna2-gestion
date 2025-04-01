package alh.resigna2.gestion.dto;

import alh.resigna2.gestion.entities.Direccion;
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
public class PersonaDTO {
    private String dni;
    private String nombre;
    private String edad;
    private String apellidos;
    private DireccionDTO direccion;
    private String fechaNacimiento;
    private String fechaAlta;
    private String email;
}
