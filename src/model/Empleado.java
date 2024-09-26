package model;

import enumerator.EstadoCivil;
import enumerator.Pais;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona {
    // Variables de clase
    private String codEmpleado;
    private LocalDate fechaIngreso;

    // Constructores
    public Empleado() {
        super();
    }

    public Empleado(String ci, String apPaterno, Pais pais, String codEmpleado, LocalDate fechaIngreso) {
        super(ci, apPaterno, pais);
        this.codEmpleado = codEmpleado;
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado(String ci, String nombres, String apPaterno, String apMaterno, EstadoCivil estadoCivil,
                    Pais pais, LocalDate fechaNacimiento) {
        super(ci, nombres, apPaterno, apMaterno, estadoCivil, pais, fechaNacimiento);
    }

    public Empleado(String ci, String nombres, String apPaterno, String apMaterno, EstadoCivil estadoCivil, Pais pais,
                    LocalDate fechaNacimiento, String codEmpleado, LocalDate fechaIngreso) {
        super(ci, nombres, apPaterno, apMaterno, estadoCivil, pais, fechaNacimiento);
        this.codEmpleado = codEmpleado;
        this.fechaIngreso = fechaIngreso;
    }

    // Getter and Setter
    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codEmpleado='" + codEmpleado + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(codEmpleado, empleado.codEmpleado) && Objects.equals(fechaIngreso, empleado.fechaIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codEmpleado, fechaIngreso);
    }
}
