public class Default {
      static int  a=12,b=10;

     static void main(String[] args){

        System.out.println(a+b);
        Default Obj=new Default();
        Obj.StudentInformation();
        Default2 obj2=new Default2();
        obj2.employeeInfo();

    }
         void StudentInformation(){
        String StudentName="vasu";
                int StudentId=123;
                int StudentMarks=60;
                System.out.println(StudentId);
            System.out.println(StudentName);
            System.out.println(StudentMarks);


        }
    }
   class Default2 {
       String EmployeeName = "ravi";
       int EmployeeId = 100;
       double EmployeeSalary = 20000.0;

       public void employeeInfo() {
           System.out.println(EmployeeName);
           System.out.println(EmployeeId);
           System.out.println(EmployeeSalary);


       }

   }