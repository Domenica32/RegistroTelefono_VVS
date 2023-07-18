package com.yourcompany.registrotelefono.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.*;

@Entity 
@Getter @Setter

public class telefono {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=15)
	@NotNull
	@NotBlank
    @Pattern(regexp = "\\d{15}", message = "El número de simcard debe tener 15 dígitos")
    String imei;
	@Column(length=50)
	@NotNull
	@NotBlank

	String nombreEquipo;

	@Column(length=50)
	String observaciones;
	

}
