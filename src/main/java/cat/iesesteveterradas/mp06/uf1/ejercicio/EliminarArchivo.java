package cat.iesesteveterradas.mp06.uf1.ejercicio;

import java.io.File;
import java.io.IOException;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EliminarArchivo {
    public static void main(String[] args) throws IOException {
         ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> llistaDeLlibres = objectMapper.readValue(new File("data/llibres_input.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));
        Integer id = 1;
        for (Map<String, Object> map : llistaDeLlibres ) {
            if (id == map.get("id")){
                llistaDeLlibres.remove(map);
                break;
            }
        }

     
        objectMapper.writeValue(new File("data/llibres_input.json"), llistaDeLlibres);
        System.out.println("id 1, eliminado.");
        System.out.println("Dades guardades amb èxit a sortida.json!");
    }
}
