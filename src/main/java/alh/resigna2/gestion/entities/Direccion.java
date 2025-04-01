package alh.resigna2.gestion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "direcciones" )
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long direccionId;
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
