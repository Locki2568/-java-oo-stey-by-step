package practice05;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int klass){
        super(name,age);
        this.klass = klass;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        //I am a Student. I am at Class 2.
        return super.introduce() +" "+ String.format("I am a Student. I am at Class %d.", this.klass);
    }
}