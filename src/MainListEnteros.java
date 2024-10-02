import java.util.ArrayList;
import java.util.List;

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
//        numerosSuerte.removeAll(otrosNumeros);
//        System.out.println("(7)  Mi numeros de la suerte: " + numerosSuerte);
        System.out.println("¿La colección otrosNumeros se encuentra en numerosSuerte? --> " + numerosSuerte.containsAll(otrosNumeros));
        System.out.println("Tamaño de la lista (número de elementos) --> " + numerosSuerte.size());
        System.out.println("Creando sublista --> " + numerosSuerte.subList(4, 10));

        numerosSuerte.clear(); // Limpia o remueve todos los elementos de la lista
        System.out.println("(8)  Mi numeros de la suerte: " + numerosSuerte);
    }
}
