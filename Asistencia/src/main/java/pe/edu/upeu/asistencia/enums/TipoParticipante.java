package pe.edu.upeu.asistencia.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum TipoParticipante {
    ASISTENTE("asistente"),
    ORGANIZADOR("Organizador"),
    PONENTE("Ponente"),;

    private String descripcion;
}
