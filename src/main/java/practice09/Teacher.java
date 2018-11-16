package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age){
        super(id,name,age);
        this.klass = new Klass();
    }

    public Klass getKlass(){return  this.klass;}

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public String introduce(){
        //My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.

        return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", klass.getDisplayName());
    }

    public String introduceWith(Student student) {
        //assertThat(tom.introduceWith(jerry)).isEqualTo("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.");
        if (this.getKlass().getNumber() == student.getKlass().getNumber()) {
            return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", student.getName());
        }else{
            return super.introduce() + " " + String.format("I am a Teacher. I don't teach %s.", student.getName());
        }
    }
}
