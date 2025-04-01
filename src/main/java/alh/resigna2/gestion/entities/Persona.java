package alh.resigna2.gestion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personas")
public class Persona {
    @Id
    private Integer id;
    private String dni;
    private String nombre;
    private Integer edad;
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;

}
