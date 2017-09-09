import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileStream {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("atividade-stream-diretorio/teste-stream/atividade-stream.txt");
			InputStreamReader reader = new InputStreamReader(file);

			BufferedReader buff = new BufferedReader(reader);
			String line;

			do {
				line = buff.readLine();

				if (line != null) {
					String[] words = line.split(";");
					System.out.println("");

					for (int i = 0; i < words.length; i++) {
						System.out.println(words[i]);
					}
				}
			} while (line != null);

		} catch (IOException ex) {
			System.out.println("");
		}
	}
}
