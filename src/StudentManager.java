public class StudentManager extends UserManager{
    @Override
    public void add(User user) {
        System.out.println(user.getUsername()+" Adlı kişi sisteme eklendi");
    }
    @Override
    public void delete(User user) {
        System.out.println(user.getUsername()+" Adlı kişi sistemden silindi");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getUsername()+" Adlı kişi güncellendi");
    }
}
