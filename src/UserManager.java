public class UserManager {
    public void add(User user){
    }
    public  void delete(User user){
    }
    public void update(User user){

    }
    public void getAll(User[] users){
        for(User user : users ){
            System.out.println(user.getUsername());
        }
    }

}
