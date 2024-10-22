package temp.test3;


public class Record{
    private int score;
    private int games;

    public Record(int score, int games) {
        this.score = score;
        this.games = games;
    }

    public int getScore() {
        return score;
    }

    public int getGames() {
        return games;
    }
    public static void getHistory(Record record) {

        System.out.println(record.getGames() + "번째 게임 : 시도 횟수: " + record.getScore());
    }

    @Override
    public String toString() {
        return "Record{" +
                "score=" + score +
                ", games=" + games +
                '}';
    }
}