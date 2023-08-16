package fc.java.model2;

public abstract interface Connection {
    //데이터베이스 연결동작
    public abstract void getConnection(String url, String username, String password);


}
