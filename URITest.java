import java.net.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.LinkOption;
public class URITest{
	public static void main(String[] args) throws Exception{
		URI u = new URI("file:///c", "", null);
		System.out.println(new File(u).toString());
		System.out.println(new File(u).exists());
	}

}
