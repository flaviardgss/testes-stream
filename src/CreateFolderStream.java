import java.io.File;
import java.io.IOException;

public class CreateFolderStream {

	public static void main(String[] args) {

		File folder = new File("atividade-stream-diretorio");
		File folder2 = new File("atividade-stream-diretorio/teste-stream");

		folder.mkdir();
		folder2.mkdir();

		/*
		 * folder.delete(); folder2.delete();
		 */
	}
}
