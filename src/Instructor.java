public class Instructor extends User{
    private String salary;
    private String age;
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }



    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



    public Instructor(String salary, String age){
        this.age=age;
        this.salary=salary;
    }

}
