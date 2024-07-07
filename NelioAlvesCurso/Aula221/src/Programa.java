import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String caminho = "C:\\Users\\Matheus\\textos\\texto.csv";
		
		new File("C:\\Users\\Matheus\\textos\\out").mkdir();
		new File("C:\\Users\\Matheus\\textos\\out\\summary.csv").createNewFile();
		String caminhoEscrita = "C:\\Users\\Matheus\\textos\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){	
			
			String line = br.readLine();
			
			while(line != null) {
				String[] particao = line.split(",");
				System.out.println(particao[0] + particao[1] + particao[2]);
				Produto produto = new Produto(particao[0], Double.parseDouble(particao[1]));
				System.out.println(produto);
				
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoEscrita, true))){
					bw.write(produto.getNome() + "," + (produto.getPreço() * Double.parseDouble(particao[2])));
					bw.newLine();
				}
				catch(IOException e){
					System.out.println("Error: " + e.getMessage());
				}
				
				line = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}	

	}

}
