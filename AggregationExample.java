class Student{
    private String name;
    private int roll_no;
    public Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
    public void showStudent(){
        System.out.println("Name of the student : "+name);
        System.out.println("Student Roll number :"+roll_no);
    }
}
class Department{
    private String departmentname;
    private Student[] student;
    public Department(String departmentname,Student[] student){
        this.departmentname=departmentname;
        this.student=student;
    }
    public void showDepartmentDetails(){
        System.out.println("Department : "+departmentname);
        System.out.println("Students details in department:");
        for(Student s:student){
            s.showStudent();
        }
    }
}
class AggregationExample{
    public static void main(String args[]){
        Student s1=new Student("Joe",123);
        Student s2=new Student("Jo",124);
        Student[] studentList={s1,s2};
        Department dep=new Department("CS",studentList);
        dep.showDepartmentDetails();
    }
}