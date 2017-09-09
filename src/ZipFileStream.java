import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileStream {

	public static void main(String[] args) {

		Path folderZip = Paths.get("atividade-stream-diretorio");
		Path folderFiles = Paths.get("atividade-stream-diretorio/teste-stream");
		Path file = folderFiles.resolve("atividade-stream.zip");

		try {
			ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(file.toFile()));
			DirectoryStream<Path> stream = Files.newDirectoryStream(folderFiles);
			{

				for (Path path : stream) {

					ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
					// ZipEntry zipEntry = new ZipEntry("atividade-stream.txt");
					zip.putNextEntry(zipEntry);
					FileInputStream fileInputStream = new FileInputStream(path.toFile());

					byte[] buff = new byte[2048];
					int byteRead;

					while ((byteRead = fileInputStream.read(buff)) > 0) {
						zip.write(buff, 0, byteRead);
					}
					// zip.closeEntry();
					fileInputStream.close();
					// zip.flush();
					zip.close();
				}
			}

		} catch (IOException ex) {
			System.out.println("");
		}
	}
}