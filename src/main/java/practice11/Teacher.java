package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private Klass klass;
    LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
        klass.assignTeacher(this);
    }

    public Teacher(int id, String name, int age){
        super(id,name,age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList){
        super(id,name,age);
        this.linkedList = linkedList;
        for(Klass klass : linkedList){
            klass.assignTeacher(this);
        }
    }

//    private void updateClass(Teacher teacher, Klass klass){
//        klass.assignTeacher(teacher);
//    }

    public Klass getKlass(){return  this.klass;}

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public String introduce(){
        //"My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3."
        return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", getDisplayNameFromList());
    }

    private String getDisplayNameFromList(){
        if (linkedList == null){
            return "No Class";
        }
        String displayName = "Class ";
        for(Klass klass :this.linkedList){
            displayName += klass.getNumber() + ", ";
        }
        return displayName.substring(0, displayName.length()-2);
    }

    public String introduceWith(Student student) {
        for (Klass klass : linkedList) {
            if (student.isIn(klass)) {
                return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", student.getName());
            }
        }
        return super.introduce() + " " + String.format("I am a Teacher. I don't teach %s.", student.getName());
    }

    public void updateIntroduce(Student student, Klass klass){
        String update = String.format("I am %s. I know %s has joined %s.", this.getName(), student.getName(), klass.getDisplayName());
        System.out.print(update+"\n");
    }

    public void updateIntroduceWith(Student student, Klass klass) {
        String update = String.format("I am %s. I know %s become Leader of %s.", this.getName(), student.getName(), klass.getDisplayName());
        System.out.print(update+"\n");
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        for(Klass klass: linkedList){
            if (student.isIn(klass)){
                return true;
            }
        }
        return false;
    }
}
