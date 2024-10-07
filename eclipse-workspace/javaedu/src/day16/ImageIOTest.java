package day16;
import java.io.*;
import java.net.URL;

public class ImageIOTest { 
    public static void main(String[] args) {
    	final String ROOT = "c:/iotest/";
        final String LIST = ROOT + "list.txt";
        final String NEW_DIR = ROOT + String.format("%tY_%1$tm_%1$td", new java.util.Date());
        File fObj = new File(NEW_DIR); 
        if (!fObj.exists()) {
			fObj.mkdir();
		}
        try (BufferedReader br = new BufferedReader(new FileReader(LIST))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] imageInfo = line.split(",");
                String imageName = imageInfo[0];
                String imageUrl = imageInfo[1];
                String destinationFile = NEW_DIR + "/" + imageName + ".jpg";

                saveImage(imageUrl, destinationFile);

                System.out.println("저장 완료 : " + imageName);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없음(ㅜㅜ) : "+ LIST);
            if (fObj.exists()) {
    			fObj.delete();
    		}
        } catch (IOException e) {
        	e.printStackTrace();
            System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
            if (fObj.exists()) {
    			fObj.delete();
    		}
        }
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }
}
