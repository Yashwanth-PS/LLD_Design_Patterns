package Creational_Design_Pattern.Singleton.Singleton_Implementation;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();

        // Print the hash code (address) of the object
        System.out.println("Address of the object s1 : " + System.identityHashCode(s1));
        System.out.println("Address of the object s2 : " + System.identityHashCode(s2));
        System.out.println("Address of the object s3 : " + System.identityHashCode(s3));
        System.out.println("Address of the object s4 : " + System.identityHashCode(s4));
     }
}