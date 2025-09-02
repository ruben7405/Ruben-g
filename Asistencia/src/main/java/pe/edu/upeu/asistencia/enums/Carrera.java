package pe.edu.upeu.asistencia.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Carrera {
    SISTEMAS(Facultadad.FIA, "Ing. Sistemas"),
    CIVIL(Facultadad.FIA, "Ing. Civil"),
    AMBIENTAL(Facultadad.FIA, "Ing. Ambiental"),

    ADMINISTRACION(Facultadad.FCE, "Administración"),
    NUTRICION(Facultadad.FCS, "Nutrición"),
    EDUCACION(Facultadad.FACIEDH, "Educación"),
    ;

    private Facultadad facultad;
    private String descripcion;
}