package br.edu.ifpb.pweb2.venus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ifpb.pweb2.venus.model.Aluno;
import br.edu.ifpb.pweb2.venus.repository.AlunoRepository;

@Component
public class AlunoService implements Service<Aluno, Integer>{
    
   @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    @Override
    public Aluno findById(Integer id) {
        Aluno aluno = null;
        Optional<Aluno> opAluno = alunoRepository.findById(id);
        if (opAluno.isPresent()) {
            aluno = opAluno.get();
        }
        return aluno;
        
    }

    @Override
    public Aluno save(Aluno t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    public void deleteById(Integer id) {
        alunoRepository.deleteById(id);
    }
}
