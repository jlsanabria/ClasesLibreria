import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainListTextos {
    public static void main(String[] args) {
        List<String> frases = List.of("Frase 1", "Frase 2", "Frase 3", "Frase 4", "Frase 5", "Frase 6");
        //frases.add("Al que madruga Dios le ayuda");
        System.out.println("Mi lista de frases: " + frases);

        /**
         * Ejercicio (4 puntos)
         * Agregar 10 elementos a la lista de frases (textos) con add(String) o add(index, String)
         * y utilizar 7 métodos de la interface List
         */

        List<String> textos = new ArrayList<>();
        textos.add("Voces de Chernóbil");
        textos.add("El amor en los tiempos del colera");
        textos.add("Cien años de soledad");
        textos.add("Los muchachos de zinc");
        textos.add("La guerra no tiene rostro de mujer");
        textos.add("La revolución que nadie soñó");
        textos.add("El coronel no tiene quien le escriba");
        textos.add("De la tierra a la luna");
        textos.add("Tiene para avanzar");
        textos.add("Trapizonda");
        textos.add("Homo sapiens");
        textos.add("No TIENE DINERO");

        // Imprimir collection (List)
        textos.forEach(System.out::println);

        // Ejemplo: Hallar el texto con mayor cantidad de caracteres (mayor longitud)
        List<Integer> textoLongitud = textos.stream()
                .map(String::length)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Textos longitud --> " + textoLongitud);

        textos.stream()
                .map(t -> t + " --> " + t.length())
                .forEach(System.out::println);

        /**
         * Mostrar los elementos que empiezan con L
         */
        System.out.println(">>> Elementos que empiezan con L");
        textos.stream()
                .filter(titulo -> titulo.matches("^[Ll].*$"))
                .forEach(System.out::println);

        /**
         * Ejercicio (3 puntos)
         * Agregar 5 títulos de libros a la lista y luego hallar los elementos que tienen la palabra 'tiene'
         * o la letra 'm'
         * 7 minutos
         */
        textos.stream()
                .filter(t -> t.toLowerCase().matches("^.*(tiene|m).*$"))
                .forEach(System.out::println);

    }
}
