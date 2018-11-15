package practice04;

public class Worker extends Person {

    public Worker(String name, int age){
        super(name, age);
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public String introduce(){
        //I am a Worker. I have a job.
        return super.introduce().trim() +"I am a Worker. I have a job.";
    }
}
