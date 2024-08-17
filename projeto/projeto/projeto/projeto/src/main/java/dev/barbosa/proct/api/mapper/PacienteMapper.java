package dev.barbosa.proct.api.mapper;

import dev.barbosa.proct.api.request.PacienteRequest;
import dev.barbosa.proct.api.response.PacienteResponse;
import dev.barbosa.proct.domain.entity.Paciente;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PacienteMapper {

    private final ModelMapper mapper;

    public PacienteMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }


    public Paciente toPaciente(PacienteRequest pacienteRequest) {
        return mapper.map(pacienteRequest, Paciente.class);

    }

    public PacienteResponse toPacienteResponse(Paciente paciente) {
        return mapper.map(paciente, PacienteResponse.class);
    }


    public List<PacienteResponse> toPacienteResponseList(List<Paciente> pacientes) {

        return pacientes.stream()
                .map(this::toPacienteResponse)
                .collect(Collectors.toList());
    }

}
