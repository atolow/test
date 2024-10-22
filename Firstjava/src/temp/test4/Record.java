package temp.test4;


public class Record{
    private int score;
    private int games;
    private int change;
    public Record(int score, int games,int change) {
        this.score = score;
        this.games = games;
        this.change = change;

    }

    public int getChange() {
        return change;
    }

    public int getScore() {
        return score;
    }

    public int getGames() {
        return games;
    }
    public static void getHistory(Record record) {

        System.out.println(record.getGames() + "번째 게임 : 시도 횟수: " + record.getScore() +" 난이도: " +record.getChange());
    }

}