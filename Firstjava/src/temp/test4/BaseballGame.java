package temp.test4;

import java.util.*;

public class BaseballGame {
    Scanner sc = new Scanner(System.in);
    private Set<Integer> randomset = new LinkedHashSet<>();
    private LinkedList<Integer> result = new LinkedList<>();
    private Set<Integer> characterset = new LinkedHashSet<>();
    private LinkedList<Integer> select = new LinkedList<>();
    private final LinkedList<Record> sample = new LinkedList<>();
    private int gameNumber=1;
    private static Integer change= null;

    // 객체 생성시 정답을 만들도록 함
    public BaseballGame() {
        Random random = new Random();
        result.clear();
        randomset.clear();
        while (!(randomset.size() == 3)) {
            int num = random.nextInt(9) + 1;
            randomset.add(num);
        }
        result.addAll(randomset);

        Collections.shuffle(result);

        System.out.println("value = " + result);
    }
    public BaseballGame(String input) {
        Random random = new Random();
        result.clear();
        randomset.clear();

        while (!(randomset.size() == Integer.parseInt(input))) {
            int num = random.nextInt(9) + 1;
            randomset.add(num);
        }
        result.addAll(randomset);

        Collections.shuffle(result);

        System.out.println("value = " + result);

    }

    public void level(){
        System.out.println("설정하고자 하는 자리수를 입력하세요.");

        while(true) {
            String input = sc.nextLine();
            change = Integer.parseInt(input);
            if(change ==3 || change==4 || change==5){
                break;
            }else{
                System.out.println("잘못된 값 입력입니다.");
            }
        }
        System.out.println(change + "난이도로 설정하였습니다.");
        new BaseballGame(String.valueOf(change)).play();



    }
    public void play() {
        BaseballGameDisplay baseballGameDisplay = new BaseballGameDisplay();
        if(change==null){
            change=3;
        }

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




            int str = countStrike(num);
            if (str == 3) {
                System.out.println("정답을 맞히셨습니다.");
                System.out.println();
                select.clear();
                break;
            }
            else if(str==4){
                System.out.println("정답을 맞히셨습니다.");
                System.out.println();
                select.clear();
                break;
            }
            else if(str==5){
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

            Record record = new Record(score,gameNumber,change);
            sample.add(record);
        }
        // 게임 진행횟수 반환
        gameNumber++;

    }

    protected boolean validateInput(String input) {
        if (input.length() != Integer.parseInt(String.valueOf(input.length()))) {
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
        for (int i = 0; i < Integer.parseInt(String.valueOf(input.length())); i++) {
            if (select.get(i) == result.get(i)) {
                strike++;
            }
        }
        return strike;

    }

    public int countBall(String input) {
        int ball = 0;
        for (int i = 0; i < Integer.parseInt(String.valueOf(input.length())); i++) {
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