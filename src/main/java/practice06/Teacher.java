package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age, int klass){
        super(name,age);
        this.klass = klass;
    }

    public Teacher(String name, int age){
        super(name,age);
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce(){
        //My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
        if (klass != 0) {
            return super.introduce() + " " + String.format("I am a Teacher. I teach Class %d.", getKlass());
        }else{
            return super.introduce() + " " +"I am a Teacher. I teach No Class.";
        }
    }
}
