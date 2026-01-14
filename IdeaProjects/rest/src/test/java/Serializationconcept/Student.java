package Serializationconcept;

public class Student {
   private  int age;
    private  String name;
    private  String role;




    Student()
    {

    }

Student(int age, String name, String role)
{
    this.age=age;
    this.name=name;
    this.role=role;

}


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



}
