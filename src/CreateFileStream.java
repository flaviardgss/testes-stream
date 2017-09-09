import java.io.File;
import java.io.IOException;

public class CreateFileStream {

	public static void main(String[] args) {

		File file = new File("atividade-stream-diretorio/teste-stream/atividade-stream.txt");

		try {
			file.createNewFile();

		} catch (IOException ex) {

		}
		//file.delete();
	}
}
