
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class Asignatura {
	private UUID idAsignatura;

    @NotNull(message = "Primer nombre es requerido")
    private String nombreAsignatura;
    
    private String estado;
    

    private String ciclo;

    private String parte;


    public String getNommbreAsigantura(){
        return primerNombre + " " + segundoNombre + " " + apellidoPaterno;
    }

    public String getIdAsigantura(){
        return id;
    }
}


