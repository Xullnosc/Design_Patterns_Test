package BuilderPattern;



// Simple builder
// Avoid ending up with multiple overloaded constructors or constructors with many parameters, which can lead to confusion.
// The builder pattern makes the construction of complex objects more readable and easier to modify over time.
// Avoid writing multiple constructors, which can be error-prone, difficult to maintain, and leads to a lot of boilerplate code.
// Boilerplate code: Sections of code that are repeated in multiple places with little to no variation.
// You can create an additional Director class to further hide details of construction class

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;

    Student(String id, String name, int age, String gender, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
    }
}

 class StudentBuilder{
    private String id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;

    public StudentBuilder id(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }
    public StudentBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }
    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }
    public StudentBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public StudentBuilder email(String email) {
        this.email = email;
        return this;
    }
    public Student build() {
        return new Student(id, name, age, gender, address, phone, email);
    }

}

class BuilderPatternTest{
    public static void main(String[] args) {

    }
}


