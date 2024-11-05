package integrador2.microusuario.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.Id;

@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull

    private String nombre;

}
