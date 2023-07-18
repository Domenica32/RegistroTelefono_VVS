package com.yourcompany.registrotelefono.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.*;

@Entity 
@Getter @Setter

public class usuario {
	
	@Id  
    @Column(length=6)  
    int id;
	@NotNull
	@NotBlank

	String name;

}
