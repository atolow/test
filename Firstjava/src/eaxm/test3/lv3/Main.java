package eaxm.test3.lv3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // BaseballGame 객체 생성 & 게임 시작
        Scanner sc = new Scanner(System.in);
        BaseballGame baseballGame = new BaseballGame();

        while(true) {
            System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
            System.out.println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");

            int game = sc.nextInt();

            if(game==1) {
                baseballGame.play();
            }
            else if(game==2){
                baseballGame.getBit();
            }
            else if(game==3){
                return;
            }
        }


    }
}
