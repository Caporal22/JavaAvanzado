package com.devtalles.estructuradedatos.iteradores;

import java.util.ArrayList;
import java.util.List;

public class NameRepository {

    private final List<String> names;

    public NameRepository(List<String> initialNames) {
        this.names = new ArrayList<>(initialNames);
    }

    public List<String> getNames() {
        return names;
    }
}
