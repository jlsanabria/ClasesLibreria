package model;

import enumerator.EstadoCivil;
import enumerator.Pais;

import java.time.LocalDate;
/**
 *    Persona
 *       ^
 *    Cliente
 *       ^
 * ClienteComercial
 */
public class ClienteComercial extends Cliente {
    private String razonSocial;

    public ClienteComercial() {
    }

    // Constructores
    public ClienteComercial(String ci, String nombres, String apPaterno, String apMaterno,
                            EstadoCivil estadoCivil, Pais pais, LocalDate fechaNacimiento,
                            String correoElectronico, String numeroContacto, String razonSocial) {
        super(ci, nombres, apPaterno, apMaterno, estadoCivil, pais, fechaNacimiento, correoElectronico, numeroContacto);
        this.razonSocial = razonSocial;
    }

    public ClienteComercial(String correoElectronico, String numeroContacto, String razonSocial) {
        super(correoElectronico, numeroContacto);
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "*************************************" +
                "\nCLIENTE COMERCIAL " +
                "\n**************************************" +
                "\n Nombres: " + getNombres() +
                "\n Paterno: " + getApPaterno() +
                "\n Materno: " + getApMaterno() +
                "\n Estado Civil: " + getEstadoCivil().getDescripcionEstadoCivil() +
                "\n Correo electrónico: " + getCorreoElectronico() +
                "\n Razon Social: " + razonSocial +
                "\n**************************************";
    }

    /**
     * Jose Sanabria --> jsanabria
     * @return
     */
    public String generarUsuario() {
        return getNombres()
                .substring(0, 1)
                .concat(getApPaterno())
                .toLowerCase();
    }

    public int generarUsuario(Character inicial, String paterno) {
        return inicial
                .toString()
                .concat(paterno)
                .toLowerCase()
                .hashCode();
    }
}
