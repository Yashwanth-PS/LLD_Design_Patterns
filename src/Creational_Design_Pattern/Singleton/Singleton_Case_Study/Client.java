package Creational_Design_Pattern.Singleton.Singleton_Case_Study;

public class Client {
    public static void main(String[] args){
        Singleton_DB_Connection  s = Singleton_DB_Connection.getInstance();
        Singleton_DB_Connection  s1 = Singleton_DB_Connection.getInstance();
        Singleton_DB_Connection  s2 = Singleton_DB_Connection.getInstance();
        Singleton_DB_Connection  s3 = Singleton_DB_Connection.getInstance();

        s.makeConnection();
        s.makeConnection();
        s1.makeConnection();
        s1.makeConnection();
        s2.makeConnection();
        s2.makeConnection();
        s3.makeConnection();
        s3.makeConnection();
    }
}