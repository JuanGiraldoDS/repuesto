package co.com.repuestos.ps.util;
import java.util.HashMap;
import java.util.Map;

public class Notas {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros

        Map<String, Double> map = new HashMap<>();

                map.put("camilo", 3.7);
                map.put("daniela", 4.0);
                map.put("estiven", 2.1);
                map.put("sandra", 3.1);
                map.put("esteban", 3.3);

                String mayorNota = " ";
                String menorNota = " ";
                Double MayorNota = 0.0;
                Double MenorNota = 4.0;
                Double total = 0.0;

                for (Map.Entry<String, Double> entry : map.entrySet()) {
                    String nombre = entry.getKey();
                    Double valor = entry.getValue();
                    total += valor;

                    if (MayorNota < valor ){
                        MayorNota = valor;
                        mayorNota = nombre;
                    }
                    if (MenorNota > valor){
                        MenorNota = valor;
                        menorNota = nombre;
                    }
                }
                Double promedio = total / map.size();
                System.out.println("La menor nota la tiene: " + menorNota + " y la nota es de: " + MenorNota);
                System.out.println("La mayor nota la tiene: " + mayorNota + " y la nota es de: " + MayorNota);
                System.out.println("El primedio de notas es de: " + promedio);

            }
        }