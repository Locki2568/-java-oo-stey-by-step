package practice07;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        //I am a Student. I am at Class 2.
        return super.introduce() +" "+ String.format("I am a Student. I am at Class %d.", this.klass.getNumber());
    }
}
