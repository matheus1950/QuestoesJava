import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<String, Integer>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("votos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                String nome = partes[0].trim();
                int votos = Integer.parseInt(partes[1].trim());
                               
                if (mapa.containsKey(nome)) {
                    mapa.put(nome, mapa.get(nome) + votos); 
                } else {
                    mapa.put(nome, votos); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for(String key : mapa.keySet()) {
        	System.out.println(key + ": " + mapa.get(key));
        }
        
	}
}
