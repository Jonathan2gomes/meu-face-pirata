package com.facebook.domain;

import java.time.LocalDate;

public class UsuarioFacebook {
    
    private String nome;
    
    private String emprego;
    
    private String informacoesAcademicas;
    
    private String estadoCivil;
    
    private LocalDate dataNasc;
    
    private String data;
    
    private char sexo;
    
    private void criarUsuario() {
        
    UsuarioFacebook usuario1 = new UsuarioFacebook(); 
    usuario1.nome = "Gustavito";
    usuario1.dataNasc = LocalDate.of(1994, 10, 22);
    usuario1.data = String.valueOf(dataNasc);

    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    System.out.println(usuario1.nome + usuario1.data + usuario1.dataNasc + "blablabla");
    
        
    }
}
