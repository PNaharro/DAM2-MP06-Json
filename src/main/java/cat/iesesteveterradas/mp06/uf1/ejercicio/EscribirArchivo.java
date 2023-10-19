package cat.iesesteveterradas.mp06.uf1.ejercicio;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EscribirArchivo {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> llistaDeLlibres = objectMapper.readValue(new File("data/llibres_input.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));

        Map<String, Object> map = new HashMap<>();
        map.put("id",llistaDeLlibres.size()+1 );
        map.put("títol", "La Perdicion");
        map.put("autor", "Jose Marcos");
        map.put("any", 2000);

        llistaDeLlibres.add(llistaDeLlibres.size(), map);
        objectMapper.writeValue(new File("data/llibres_input.json"), llistaDeLlibres);
        System.out.println("Dades guardades amb èxit a sortida.json!");
        
    }
    
}
