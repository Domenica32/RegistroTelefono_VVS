package com.yourcompany.registrotelefono.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.*;

@Entity
@Getter
@Setter

public class empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@NotBlank
	@Column(length=50)
	String nombre;
	
	@NotNull
	@NotBlank
	@Column(length=50)
	String ruc;
	
	@NotNull
	@NotBlank
	@Column(length=50)
	String cuenta;

}
