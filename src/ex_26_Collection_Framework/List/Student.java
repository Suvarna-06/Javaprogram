package ex_26_Collection_Framework.List;

public class Student {
    private String name;
    private String rollNo;

    //Parametrized Constructor
    public Student(String name,String rollNo){
        this.name=name;
        this.rollNo =rollNo;
    }

    // Add getter setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getRollNo(){
        return rollNo;
    }

    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }

    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student roll No: " + this.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
