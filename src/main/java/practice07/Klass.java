package practice07;

import java.util.ArrayList;

public class Klass {
    private int klass;
    private Teacher teacherInKlass;
    private ArrayList<Student> studentsListInKlass;
    public Klass(Teacher teacher, int klass){
        this.studentsListInKlass = new ArrayList<>();
        this.teacherInKlass = teacher;
        this.klass = klass;
    }

    public Klass(Student student, int klass){
        addStudentToList(student);
        this.klass = klass;
    }

    public Klass(int klass){
        this.klass = klass;
    }

    public Klass(){
        this.klass = klass;
    }

    public int getNumber(){
        return this.klass;
    }

    public int getKlass(){
        return this.klass;
    }

    public String getDisplayName(){
        if(this.klass != 0){
            return "Class "+this.klass;
        }else{
            return "No Class";
        }
    }


    public void addStudentToList(Student student){
        this.studentsListInKlass.add(student);
    }
}
