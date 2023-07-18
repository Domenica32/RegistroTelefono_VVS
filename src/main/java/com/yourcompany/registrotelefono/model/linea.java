package com.yourcompany.registrotelefono.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.*;

@Entity
@Getter @Setter

public class linea {
	@Id  
    @Column(length=6)  
    int numero;
	@Column(length = 10)
    @Pattern(regexp = "\\d{10}", message = "El número de teléfono debe tener 10 dígitos")
    String telefono;
	@Column(length = 10)
    @Pattern(regexp = "\\d{10}", message = "El número de simcard debe tener 10 dígitos")
    String simcard;
	area area;	
	//RELACIONES 
	//USUARIO
	  @ManyToOne
	  @JoinColumn(name = "usuario_id")
	  @NotNull
	
	  usuario usuario;
	 //EMPRESA
	  @ManyToOne
	  @JoinColumn(name = "empresa_id")
		@NotNull
		
	  empresa empresa;
	  //TELEFONO
	  @OneToOne
	  @JoinColumn(name = "telefono_id")
	  @NotNull
		
	  telefono phone;
	  //ACTA ENTREGA
	   @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "actaEntrega_id")
		@NotNull
	

	   acta_entrega actaEntrega;
	  //PLAN
	   @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "plan_id")
		@NotNull
		
	    Plan plan;
}

 enum area{
	 Talento_Humano,
	 Comercial,
	 Tecnología,
	 Legal,
	 Administrativo,
	 Procesos,
	 Cartera;
	 
 }
