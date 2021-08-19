public class Student extends User{
    private String age;
    private String degree;
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


    public Student (String age, String degree){
        this.age=age;
        this.degree=degree;
    }




    }

