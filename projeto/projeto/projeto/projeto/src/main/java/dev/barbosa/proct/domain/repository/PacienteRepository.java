package dev.barbosa.proct.domain.repository;

import dev.barbosa.proct.domain.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
