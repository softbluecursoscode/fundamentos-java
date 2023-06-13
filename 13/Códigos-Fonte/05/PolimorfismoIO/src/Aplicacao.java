import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

//		FileInputStream fin = new FileInputStream("entrada.txt");
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		transfer(fin, fout);
		
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		OutputStream cout = System.out;
//		transfer(fin, cout);
		
//		InputStream cin = System.in;
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		transfer(cin, fout);
		
		FileInputStream fin = new FileInputStream("entrada.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		transfer(fin, bout);
		
		byte[] bytes = bout.toByteArray();
		String s = new String(bytes);
		System.out.println(s);
	}
	
	private static void transfer(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		
		int bytesLidos;
		while ((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}
}
