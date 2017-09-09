import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileStream {

	public static void main(String[] args) {

		try {
			FileOutputStream file = new FileOutputStream(
					"atividade-stream-diretorio/teste-stream/atividade-stream.txt");
			PrintWriter writer = new PrintWriter(file);

			writer.println("Flávia Rodrigues ; 312161030 ; 15/06/1995");
			writer.println("Márcio Carvalho  ; 312161031 ; 12/02/1980");
			writer.println("Maria da Silva   ; 312161032 ; 10/05/1970");
			writer.println("Eduarda Macedo   ; 312161033 ; 07/11/1990");
			writer.println("João dos Santos  ; 312161034 ; 06/08/1985");
			writer.println("Carlos Santana   ; 312161035 ; 23/03/1992");

			writer.close();
			file.close();
		} catch (IOException ex) {
			System.out.println("");
		}
	}
} 