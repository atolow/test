package fc.java.model2;

public class MysqlDriver implements Connection{
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password mysql을 접속 시도한다.");
    }
}
