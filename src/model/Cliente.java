package model;

import enumerator.EstadoCivil;
import enumerator.Pais;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente extends Persona {
    private String correoElectronico;
    private String numeroContacto;

    public Cliente() {
        super();
    }

    public Cliente(String correoElectronico, String numeroContacto) {
        this.correoElectronico = correoElectronico;
        this.numeroContacto = numeroContacto;
    }

    public Cliente(String ci, String nombres, String apPaterno, String apMaterno, EstadoCivil estadoCivil,
                   Pais pais, LocalDate fechaNacimiento, String correoElectronico, String numeroContacto) {
        super(ci, nombres, apPaterno, apMaterno, estadoCivil, pais, fechaNacimiento);
        this.correoElectronico = correoElectronico;
        this.numeroContacto = numeroContacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "correoElectronico='" + correoElectronico + '\'' +
                ", numeroContacto='" + numeroContacto + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(correoElectronico, cliente.correoElectronico) && Objects.equals(numeroContacto, cliente.numeroContacto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), correoElectronico, numeroContacto);
    }
}
