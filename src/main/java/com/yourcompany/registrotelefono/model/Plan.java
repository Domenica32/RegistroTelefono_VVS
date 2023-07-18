package com.yourcompany.registrotelefono.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.*;

@Entity
@Getter
@Setter

public class Plan {
	@Id  
    @Column(length=6)  
    int id;
	@Column(length=50)
	@NotNull
	@NotBlank
	@Pattern(regexp = "^[\\w\\-]+$", message = "El nombre del plan solo puede contener letras, números y el guion (-)")
    String nombrePlan;
	@Column(length=50)
	@NotNull
	@NotBlank
	String descripcionPlan;

}
