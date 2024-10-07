package day17;

import java.io.InputStream;
import java.net.URL;

public class URLTest1 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1171062000");
		InputStream is = url.openStream();
		int input;
		while (true) {
			input = is.read();
			if (input == -1)
				break;
			System.out.print((char)input);
		}

	}

}
