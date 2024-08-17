package dev.barbosa.proct.api.controller;

import dev.barbosa.proct.domain.entity.Paciente;
import dev.barbosa.proct.domain.service.PacienteService;
import dev.barbosa.proct.api.mapper.PacienteMapper;
import dev.barbosa.proct.api.request.PacienteRequest;
import dev.barbosa.proct.api.response.PacienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;
    private final PacienteMapper _mapper;

    public PacienteController(PacienteMapper mapper) {
        _mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponse>> listarPacientes() {
        List<Paciente> pacientes = service.listarPacientes();
        List<PacienteResponse> pacienteResponses = _mapper.toPacienteResponseList(pacientes);
        return ResponseEntity.status(HttpStatus.OK).body(pacienteResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponse> buscarPacientePorId(@PathVariable Long id) {
        Optional<Paciente> pacienteOptional = service.buscarPorId(id);

        return ResponseEntity.status(HttpStatus.OK).body(_mapper.toPacienteResponse(pacienteOptional.get()));
    }

    @PostMapping
    public ResponseEntity<PacienteResponse> salvarPaciente(@RequestBody PacienteRequest pacienteRequest) {
        Paciente paciente = _mapper.toPaciente(pacienteRequest);
        Paciente pacienteSalvo = service.salvar(paciente);
        PacienteResponse pacienteResponse = _mapper.toPacienteResponse(pacienteSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteResponse);
    }


    @PutMapping("/{id}")
    public ResponseEntity<PacienteResponse> alterar(@PathVariable Long id, @RequestBody PacienteRequest pacienteRequest) {
        Paciente paciente = _mapper.toPaciente(pacienteRequest);
        Paciente pacienteSalvo = service.alterar(id, paciente);
        PacienteResponse pacienteResponse = _mapper.toPacienteResponse(pacienteSalvo);
        return ResponseEntity.status(HttpStatus.OK).body(pacienteResponse);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPaciente(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
