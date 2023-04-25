package fc.java.model2;

public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password oracle을 접속 시도한다.");
    }
}
