package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce(){
        //My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
        if(this.klass.getLeader() != null &&  this.klass.getLeader().equals(this)) {
            return super.introduce() + " " + String.format("I am a Student. I am Leader of Class %d.", this.klass.getNumber());
        }else{
            return super.introduce() + " " + String.format("I am a Student. I am at Class %d.", this.klass.getNumber());
        }
    }
}