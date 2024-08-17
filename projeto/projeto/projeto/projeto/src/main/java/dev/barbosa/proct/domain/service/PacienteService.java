package dev.barbosa.proct.domain.service;
import dev.barbosa.proct.domain.repository.PacienteRepository;
import dev.barbosa.proct.domain.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;


    public Paciente salvar(Paciente paciente){

        return repository.save(paciente);
    }


    public List<Paciente> listarPacientes(){
        return repository.findAll();
    }


    public Optional<Paciente> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }


    public Paciente alterar(Long id, Paciente paciente) {
        Optional<Paciente> optPaciente = this.buscarPorId(id);

        if (optPaciente.isEmpty()) {
            throw new BusinessException("Paciente não cadastrado!");
        }

        paciente.setId(id);

        return salvar(paciente);
    }

}
