package day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest3 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1171062000");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = null;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}

	}

}
