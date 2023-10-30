package cat.iesesteveterradas.mp06.uf1.ejercicio;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GuardarArchivo {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> llistaDeLlibres = objectMapper.readValue(new File("data/llibres_input.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));
        objectMapper.writeValue(new File("data/llibres_output.json"), llistaDeLlibres);
        System.out.println("Datos guardados en llibes_output");
        System.out.println("Dades guardades amb èxit a sortida.json!");
    }
}
