package com.springbeans.aulaBeansDio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Ubik");
        livro.setCodigo("0451BD");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Philip K. Dick");
        livro.exibir();

    }
}
