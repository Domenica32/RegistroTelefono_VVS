package com.yourcompany.registrotelefono.model;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.*;


@Entity
@Getter
@Setter

public class acta_entrega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	@NotNull
	Date fechaEntrega;
	@Column(length=50)
	@NotNull
	@NotBlank
	String estadoEquipo;	


}
