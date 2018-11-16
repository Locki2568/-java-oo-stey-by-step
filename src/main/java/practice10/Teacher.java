package practice10;

import sun.awt.image.ImageWatched;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person {
    private Klass klass;
    LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age){
        super(id,name,age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList){
        super(id,name,age);
        this.linkedList = linkedList;
    }

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
