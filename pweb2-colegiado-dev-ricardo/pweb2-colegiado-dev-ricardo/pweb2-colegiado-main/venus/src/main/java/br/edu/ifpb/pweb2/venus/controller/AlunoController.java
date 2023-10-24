package br.edu.ifpb.pweb2.venus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifpb.pweb2.venus.service.AlunoService;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;

    @RequestMapping("/form")
    public ModelAndView getForm(ModelAndView modelAndView){
        modelAndView.setViewName("alunos/form");
        // modelAndView.addObject("aluno", new Aluno())
        return modelAndView;
        
    }

    @GetMapping
    public ModelAndView listAll(ModelAndView modelAndView){
        modelAndView.setViewName("alunos/list");
        modelAndView.addObject("contas", alunoService.findAll());
        return modelAndView;
    }
    @RequestMapping("/{id}/delete")
    public ModelAndView deleteById(@PathVariable(value = "id") Integer id, 
        ModelAndView mav, RedirectAttributes attr) {
        alunoService.deleteById(id);
        attr.addFlashAttribute("mensagem", "Aluno removido com sucesso!");
        mav.setViewName("redirect:/alunos");
        return mav;
    }

}
