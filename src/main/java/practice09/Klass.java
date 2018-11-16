package practice09;

import java.util.ArrayList;

public class Klass {
    private int klass;
    private Teacher teacherInKlass;
    private ArrayList<Student> studentsListInKlass;
    private Student leader;

    public Klass(Teacher teacher, int klass){
        this.teacherInKlass = teacher;
        this.klass = klass;
    }

    public Klass(Student student, int klass){
        //addStudentToList(student);
        this.klass = klass;
    }

    public Klass(int klass){
        this.studentsListInKlass = new ArrayList<>();
        this.klass = klass;
    }

    public Klass(){
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


    public void appendMember(Student student){
        this.studentsListInKlass.add(student);
    }

    public void assignLeader(Student jerry) {
        if (!studentsListInKlass.contains(jerry)){
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = jerry;
    }

    public Student getLeader() {
        if(leader != null) {
            return this.leader;
        }
        return null;
    }
}
