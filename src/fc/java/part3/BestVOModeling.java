package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO vo=new MovieVO("아바타",2021214,"제이크 설리","액션",192.0f,12);

        System.out.println(vo.toString());
        System.out.println(vo);

    }
}
