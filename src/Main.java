import enumerator.EstadoCivil;
import enumerator.Pais;
import model.Cliente;
import model.ClienteComercial;
import model.Empleado;
import model.Persona;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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
//        Empleado empleado = new Empleado();
//        empleado.setCi("87435435");
//        System.out.println(empleado);

        /**
         * Ejercicio (5 puntos)
         * Implementar la clase Cliente(ciNit, razonSocial, correoElectronico, numeroContacto)
         * que extienda o herede de Persona. Luego instanciar un cliente con todos los datos
         * a través de los setters para finalmente imprimir.
         */

        ClienteComercial clienteComercial = new ClienteComercial();
//        clienteComercial.setNombres("Jose Luis");
//        clienteComercial.setApPaterno("Sanabria");
//        clienteComercial.setApMaterno("Calle");
//        clienteComercial.setEstadoCivil(EstadoCivil.SOLTERO);
//        clienteComercial.setFechaNacimiento(LocalDate.of(1990, 4, 30));
//        clienteComercial.setCorreoElectronico("jsanabria@icei.tech");
//        clienteComercial.setRazonSocial("SANABRIA SOFTWARE");
//
//        System.out.println(clienteComercial);
//
//        System.out.println("Mostrar usuario --> " + clienteComercial.generarUsuario());
//
//        System.out.println("Hash usuario -->  " + clienteComercial.generarUsuario(
//                clienteComercial.getNombres().charAt(0),
//                clienteComercial.getApPaterno()));

        // Cliente 1
        Cliente cliente1 = new Cliente();
        cliente1.setCi("87435435");
        cliente1.setNombres("Jose Luis");
        cliente1.setApPaterno("Sanabria");
        cliente1.setFechaNacimiento(LocalDate.of(1990, 4, 30));
        cliente1.setEstadoCivil(EstadoCivil.SOLTERO);
        // Cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setCi("6634434");
        cliente2.setNombres("Laura");
        cliente2.setApPaterno("Morales");
        cliente2.setFechaNacimiento(LocalDate.of(1985, 6, 17));
        cliente2.setEstadoCivil(EstadoCivil.CASADO);
        // Cliente 3
        Cliente cliente3 = new Cliente();
        cliente3.setCi("75486756");
        cliente3.setNombres("Gabriela");
        cliente3.setApPaterno("Arancibia");
        cliente3.setFechaNacimiento(LocalDate.of(1999, 11, 12));
        cliente3.setEstadoCivil(EstadoCivil.SOLTERO);

//        System.out.println("Mi cliente One --> " + cliente1);
//        System.out.println("Mi cliente Two --> " + cliente2);
//        System.out.println("Mi cliente Three --> " + cliente3);

        Empleado empleado1 = new Empleado();
        Persona persona1 = new Persona();

        List<Cliente> listaClientes = new ArrayList<>();
        // Métodos de la clase List
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        System.out.println("Mi lista de clientes: \n" + listaClientes);





    }
}