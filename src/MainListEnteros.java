import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainListEnteros {
    public static void main(String[] args) {
        List<Integer> numerosSuerte = new ArrayList<>();
        numerosSuerte.add(2);
        numerosSuerte.add(7);
        numerosSuerte.add(10);
        numerosSuerte.add(14);
        numerosSuerte.add(33);
        System.out.println("(1)  Mi numeros de la suerte: " + numerosSuerte);
        numerosSuerte.addFirst(25);
        numerosSuerte.add(4, 13);
        numerosSuerte.addLast(39);
        numerosSuerte.add(13);
        numerosSuerte.addFirst(13);
        System.out.println("(2)  Mi numeros de la suerte: " + numerosSuerte);
        System.out.println("¿lista vacia? --> " + numerosSuerte.isEmpty());
        numerosSuerte.remove(Integer.valueOf(25));
        numerosSuerte.remove(5);
        System.out.println("(3)  Mi numeros de la suerte: " + numerosSuerte);
        System.out.println("¿contiene el elemento? --> " + numerosSuerte.contains(10));
        System.out.println("Obtiene elemento --> " + numerosSuerte.get(3));
        System.out.println("Obtiene primer elemento --> " + numerosSuerte.getFirst());
        System.out.println("Obtiene último elemento --> " + numerosSuerte.getLast());
        System.out.println("Posición del elemento (primera coincidencia) --> " + numerosSuerte.indexOf(13));
        System.out.println("Posición del elemento (última coincidencia) --> " + numerosSuerte.lastIndexOf(13));
        System.out.println("(4)  Mi numeros de la suerte (reversed): " + numerosSuerte.reversed());
        numerosSuerte.set(4, 17);
        System.out.println("(5)  Mi numeros de la suerte: " + numerosSuerte);


        List<Integer> otrosNumeros = List.of(11, 22, 33, 44, 55, 66);
        numerosSuerte.addAll(otrosNumeros);
        System.out.println("(6)  Mi numeros de la suerte: " + numerosSuerte);
        numerosSuerte.removeAll(otrosNumeros);
        System.out.println("(7)  Mi numeros de la suerte: " + numerosSuerte);
        System.out.println("¿La colección otrosNumeros se encuentra en numerosSuerte? --> " + numerosSuerte.containsAll(otrosNumeros));
        System.out.println("Tamaño de la lista (número de elementos) --> " + numerosSuerte.size());
        System.out.println("Creando sublista --> " + numerosSuerte.subList(2, 5));

//        int mayor = 0;
//        List<Double> montos = new ArrayList<>();
//        double interes = 0.11;
//        for (Integer numero: numerosSuerte) { // forEach
//            if(numero > mayor) {
//                mayor = numero;
//            }
//            // agregar monto con el interés
//            double monto = numero + (numero * interes);
//            montos.add(monto);
//        }
//
//        System.out.println("El mayor es --> " + mayor);
//        System.out.println("Lista montos finales --> " + montos);

        // API STREAM (Java 8+)
        /*
        Ejemplo 1. Hallar los números mayores a 10
         */
        System.out.println("Números mayores a 10 con API Stream Java");
        Predicate<Integer> predMayor = num -> num > 8;
        Predicate<Integer> predMenor = num -> num < 30;
        Predicate<Integer> predDistinto = num -> num != 13;
        numerosSuerte
                .stream()
                .filter(num -> num > 8 && num < 30 && num != 13)
                .forEach(System.out::println);

        /**
         * Ejercicio 2 (3 puntos)
         * Hallar el número mayor de la lista de enteros con programación funcional (API Java Stream)
         */

        numerosSuerte.clear(); // Limpia o remueve todos los elementos de la lista
        System.out.println("(8)  Mi numeros de la suerte: " + numerosSuerte);
    }
}
