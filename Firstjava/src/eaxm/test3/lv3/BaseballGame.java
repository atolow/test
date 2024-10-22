package eaxm.test3.lv3;

import java.util.*;

public class BaseballGame {
    private Set<Integer> randomset = new LinkedHashSet<>();
    private LinkedList<Integer> result = new LinkedList<>();
    private Set<Integer> characterset = new LinkedHashSet<>();
    private LinkedList<Integer> select = new LinkedList<>();
    private final LinkedList<Record> sample = new LinkedList<>();
    private int gameNumber=1;


    // 객체 생성시 정답을 만들도록 함
    public BaseballGame() {
        Random random = new Random();


        while (!(randomset.size() == 3)) {
            int num = random.nextInt(9) + 1;
            randomset.add(num);
        }
        result.addAll(randomset);

        Collections.shuffle(result);

        System.out.println("value = " + result);
    }
    public void play() {
        Scanner sc = new Scanner(System.in);
        BaseballGameDisplay baseballGameDisplay = new BaseballGameDisplay();


        int score=0;

        while (true) {
            System.out.println("< 게임을 시작합니다 >");
            // 1. 유저에게 입력값을 받음
            System.out.print("숫자를 입력하세요:");
            String num = sc.nextLine();
            // 2. 올바른 입력값을 받았는지 검증
            if (!validateInput(num)) {
                System.out.println("올바르지 않는 입력값입니다.");
                continue;
            }
            System.out.println("랜덤으로 정한갓 = " + result);
            System.out.println("내가정한 값 = " + select);



            // 3. 게임 진행횟수 증가

            // 4. 스트라이크 개수 계산
            int str = countStrike(num);
            // 5. 정답여부 확인, 만약 정답이면 break 를 이용해 반복문 탈출
            if (str == 3) {
                System.out.println("정답을 맞히셨습니다.");
                System.out.println();
                select.clear();
                break;
            }
            int bal = countBall(num);

            baseballGameDisplay.displayHint(str, bal);


            // 6. 볼 개수 계산
            // 7. 힌트 출력
            select.clear();

            score++;

            Record record = new Record(score,gameNumber);
            sample.add(record);



        }
        // 게임 진행횟수 반환
        gameNumber++;

    }

    protected boolean validateInput(String input) {
        if (input.length() != 3) {
            return false;
        }
        for (char a : input.toCharArray()) { //toCharArray = String을 char형을 배열로 바꿔줌
            if (!Character.isDigit(a) || a == 0) { //숫자가 아니거나 0일경우
                return false;
            }
            int num = Character.getNumericValue(a);
            characterset.add(num);
        }

        select.addAll(characterset);
        characterset.clear();


        return true;
    }

    public int countStrike(String input) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (select.get(i) == result.get(i)) {
                strike++;
            }
        }
        return strike;

    }

    public int countBall(String input) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (select.get(i) != result.get(i) && select.contains(result.get(i))) {
                ball++;
            }
        }
        return ball;
    }
    public void getBit(){
        if(sample.isEmpty()){
            System.out.println(" 기록이 없습니다. ");
        } else {

            for (Record record : sample) {
                Record.getHistory(record);
            }

        }
    }

    public class BaseballGameDisplay {
        public void displayHint(int strike, int ball) {
            if (strike == 0 && ball == 0) {
                System.out.println("All Out");
            } else {
                System.out.println("Strike: " + strike + " " + "Ball: " + ball);
            }
        }
    }





}