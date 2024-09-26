import enumerator.EstadoCivil;
import enumerator.Pais;
import model.Empleado;
import model.Persona;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
//        Persona persona = new Persona();
//        //Persona persona = new Persona("6151222", "Jose", "Sanabria", "Calle",
//        //        EstadoCivil.CASADO, Pais.BOLIVIA, LocalDate.of(1990, 4, 30));
//
//        //Persona persona = new Persona("6545333", "Sanabria", Pais.BOLIVIA);
//
//        persona.setCi("63254324");
//        persona.setNombres("Ricardo");
//        persona.setApPaterno("Sanabria");
//        persona.setApMaterno("Sanabria");
//        persona.setFechaNacimiento(LocalDate.of(2004, 3, 2));
//        System.out.println(persona);

//        Empleado empleado = new Empleado("76463443", "Alfredo", "Guillen", "Bustillos",
//                EstadoCivil.SOLTERO, Pais.ARGENTINA, LocalDate.of(1976, 3, 15),
//                "EMP-1000", LocalDate.of(2000, Month.JANUARY, 10));
        Empleado empleado = new Empleado();
        empleado.setCi("87435435");
        System.out.println(empleado);

        /**
         * Ejercicio (5 puntos)
         * Implementar la clase Cliente(ciNit, razonSocial, correoElectronico, numeroContacto)
         * que extienda o herede de Persona. Luego instanciar un cliente con todos los datos
         * a través de los setters para finalmente imprimir.
         */

    }
}