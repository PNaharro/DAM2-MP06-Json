package cat.iesesteveterradas.mp06.uf1.ejercicio;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LeerArchivo {
    
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> llistaDeLlibres = objectMapper.readValue(new File("data/llibres_input.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));
        String print = "";
        for (Map<String, Object> map : llistaDeLlibres ) {
            print += "Id : " + map.get("id")+" Titol: "+map.get("títol")+" Autor: "+ map.get("autor")+" Any: "+ map.get("any")+"\n";
        }
        System.out.println("#");
        System.out.println(print);
        System.out.println("#");

    }
}
