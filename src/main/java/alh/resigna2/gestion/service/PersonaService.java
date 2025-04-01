package alh.resigna2.gestion.service;

import alh.resigna2.gestion.dto.PersonaResponseDTO;


public interface PersonaService {
    PersonaResponseDTO obtenerPersonaDni(String dni);
}
