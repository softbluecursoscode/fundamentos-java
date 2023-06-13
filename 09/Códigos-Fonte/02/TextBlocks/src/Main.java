
public class Main {

	public static void main(String[] args) {
		
//		String html = 
//				"<html>\n" +
//				"    <body>\n" + 
//				"        <h1>Texto qualquer</h1>\n" + 
//				"    </body>\n" +
//				"</html>";
	
		String texto = "Texto qualquer";
		
		String html = """
                      <html>
                          <body>
                              <h1>
                              """ + texto + """
                              </h1>
                          </body>
                      </html>
                      """;
		
		System.out.println(html);
	}
}
