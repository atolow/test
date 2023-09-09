package fc.java.sleep;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.io.File;

public class sleep {

    public static void main(String[] args) {

        String path = "C:\\sleep"; //폴더 경로
        File Folder = new File(path);

        if (!Folder.exists()) {
            try{
                Folder.mkdir(); //폴더 생성합니다.
                System.out.println("폴더가 생성되었습니다.");
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }else {
            System.out.println("이미 폴더가 생성되어 있습니다.");
        }

        /////////////////////////////////////////////////////
        sleep getImage = new sleep();

        String strUrl = "http://moonserver.co.kr/files/attach/images/67/152/c74a8c18c79155612d309974e98a994b.png"; //불러올 URL

        try {

            getImage.saveImage(strUrl);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    private void saveImage(String strUrl) throws IOException {

        URL url = null;
        InputStream in = null;
        OutputStream out = null;

        try {

            url = new URL(strUrl);

            in = url.openStream();

            out = new FileOutputStream("C:\\sleep\\test.jpg"); //저장경로

            while(true){
                //이미지를 읽어온다.
                int data = in.read();
                if(data == -1){
                    break;
                }
                //이미지를 쓴다.
                out.write(data);

            }

            in.close();
            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }finally{

            if(in != null){in.close();}
            if(out != null){out.close();}

        }
    }

}