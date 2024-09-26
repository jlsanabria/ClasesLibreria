package model;

import enumerator.EstadoCivil;
import enumerator.Pais;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase POJO - Plain Old Java Object
 */
public class Persona {
    // Variables de clase
    private String ci;
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private EstadoCivil estadoCivil;
    private Pais pais;
    private LocalDate fechaNacimiento;

    // Constructores
    public Persona() {
    }

    public Persona(String ci, String apPaterno, Pais pais) {
        this.ci = ci;
        this.apPaterno = apPaterno;
        this.pais = pais;
    }

    public Persona(String ci, String nombres, String apPaterno, String apMaterno,
                   EstadoCivil estadoCivil, Pais pais, LocalDate fechaNacimiento) {
        this.ci = ci;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.estadoCivil = estadoCivil;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter & Setter
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "ci='" + ci + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'' +
                ", estadoCivil=" + estadoCivil +
                ", pais=" + pais +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(ci, persona.ci) && Objects.equals(nombres, persona.nombres) &&
                Objects.equals(apPaterno, persona.apPaterno) && Objects.equals(apMaterno, persona.apMaterno) &&
                estadoCivil == persona.estadoCivil && pais == persona.pais &&
                Objects.equals(fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ci, nombres, apPaterno, apMaterno, estadoCivil, pais, fechaNacimiento);
    }
}
