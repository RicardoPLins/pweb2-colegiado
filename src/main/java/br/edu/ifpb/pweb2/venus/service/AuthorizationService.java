package br.edu.ifpb.pweb2.venus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.edu.ifpb.pweb2.venus.repository.UsuarioRepository;


@Service
public class AuthorizationService implements UserDetailsService{

    @Autowired
    UsuarioRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ur.findByLogin(username);
    }
    
}
