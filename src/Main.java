public class Main {

    public static void main(String[] args) {
        User user = new User(1,"Hasan Fatih","Ertürk","hasan@email.com","12345","somegm");
        StudentManager studentManager = new StudentManager();
        studentManager.add(user);

    }
}
