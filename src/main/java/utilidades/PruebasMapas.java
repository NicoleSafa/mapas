package utilidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PruebasMapas {

    public static void main(String[] args){

    //Crear mapas
    Map<String, Integer> puntuacionesDulces = new HashMap<>();

    //Insertar valores en mapa
    puntuacionesDulces.put("Donut", 6);
    puntuacionesDulces.put("Palmera", 8);
    puntuacionesDulces.put("Napolitana", 9);
    puntuacionesDulces.put("Gofre", 10);

    //Modificar elementos
    puntuacionesDulces.replace("Donut", 7);

    //Eliminar elementos
        puntuacionesDulces.remove("Gofre");

    //Tamanio de un mapa
    System.out.println(puntuacionesDulces.size());

    //Obtener valor para una clave
    System.out.println(puntuacionesDulces.get("Donut"));

    //Saber si un mapa contiene un elemento
    System.out.println(puntuacionesDulces.containsKey("Gofre"));

    List<String> sabores = List.of("Chocolate", "Huevo", "Kit Kat");

    sabores.forEach(sabor -> System.out.println(sabor));

    for(String sabor : sabores){
        System.out.println(sabor);
    }

    System.out.println(puntuacionesDulces);





    }
}
