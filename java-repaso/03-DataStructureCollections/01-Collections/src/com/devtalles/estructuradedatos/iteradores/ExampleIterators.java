package com.devtalles.estructuradedatos.iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {

    public static void main(String[] args) {

        final List<String> names = new ArrayList<>();

        names.add("Daniel");
        names.add("Juan");
        names.add("Carlos");

//        for(String name : names){
//            if(name.startsWith("A") || name.startsWith("C")){
//                names.remove(name);
//            }
////            System.out.println(name);
//        }

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.startsWith("D")) {
                iterator.remove(); // forma correcta de eliminar mientras iteras
            }
        }

        System.out.println("Resultado final: " + names);
    }
}
