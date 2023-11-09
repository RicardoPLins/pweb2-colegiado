package br.edu.ifpb.pweb2.venus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifpb.pweb2.venus.model.usuario.Usuario;
import br.edu.ifpb.pweb2.venus.service.RoleService;
import br.edu.ifpb.pweb2.venus.service.UsuarioService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/teste")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    RoleService rs;

    @GetMapping("/usuarios")
    public ModelAndView listUsuarios(ModelAndView mv){
        mv.addObject("usuarios", usuarioService.findAll());
        mv.setViewName("/usuario/list");
        return mv;
    }

    // Requisição para salvar ou editar o usuario
    @RequestMapping("usuario/novo")
    public ModelAndView getFormNovo(ModelAndView mv, Usuario usuario){
        mv.setViewName("/usuario/formUsuario");
        mv.addObject("usuario", usuario);
        mv.addObject("tipoUsuario", "usuario");
        mv.addObject("roles", rs.findAll());

        return mv;
    }

    @RequestMapping("usuario/editar/{id}")
    public ModelAndView getFormEdit(@PathVariable(value = "id") Integer id, ModelAndView mv, Usuario usuario){
        usuario = usuarioService.findById(id);
        mv.setViewName("/usuario/formUsuario");
        mv.addObject("usuario", usuario);
        mv.addObject("roles", rs.findAll());

        return mv;
    }
    
    // Busca o usuario pelo ID (perfil)
    @GetMapping("usuario/{id}")
    public ModelAndView getUsuarioById(@PathVariable(value = "id") Integer id, ModelAndView mv){
        mv.addObject("usuario", usuarioService.findById(id));
        mv.setViewName("/usuario/perfil");

        return mv;
    }

    @PostMapping("/usuario")
    public String save(@Valid Usuario usuario, BindingResult result, RedirectAttributes redirectAtt){

        if(result.hasErrors()){
            return "/usuario/formUsuario";
        }

        usuarioService.save(usuario);
        
        redirectAtt.addFlashAttribute("message","usuario cadastrado com sucesso");

        return "redirect:/usuarios";
    }

    

}
