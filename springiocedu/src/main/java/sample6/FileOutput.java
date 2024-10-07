package sample6;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Outputter{
	private String filePath;  
	
	public FileOutput() {
		System.out.println("2. IoC 컨테이너에 의해서 FileOutput 객체 생성");
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		System.out.println("3. IoC 컨테이너에 의해서 FileOutput 객체의 setFilePath() 호출");
	}

	@Override
	public void output(String message) throws IOException {
		FileWriter out=new FileWriter(filePath);
		out.write(message);
		out.close();
		System.out.println("7. FileOutput 객체의 output() 호출");
	}
}






