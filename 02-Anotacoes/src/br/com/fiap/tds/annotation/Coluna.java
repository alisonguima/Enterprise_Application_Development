package br.com.fiap.tds.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Teste.java - compilar -> Teste.class (bytecode) -> Interpretar JVM "Executar"

//Definir o lugar em que a anota��o pode ser utilizada
//FIELD -> atributos
@Target( { ElementType.FIELD, ElementType.METHOD })

//Definir at� quando a anota��o estar� presente
// SOURCE -> at� o c�digo (.java)
// CLASS -> at� o bytecode (.class) (default)
// RUNTIME -> at� a execu��o
@Retention(RetentionPolicy.RUNTIME)
public @interface Coluna {
	String nome();
	String tipo();
	boolean pk() default false;
	int tamanho() default 255;
}