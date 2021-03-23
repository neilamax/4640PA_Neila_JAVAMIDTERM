package design;

public class FortuneEmployee {

    /**
     FortuneEmployee class has a main method where you will be able to create Object from
        EmployeeInfo class to use fields and attributes
     <p>
     Demonstrate as many methods as possible to use with proper business work flow.
        Try to think like a Software Architect/Developer.
        This application should provide basic employee information services
     </p>
     <p>
     Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     </p>
     **/
    public static void main(String[] args) {
        EmployeeInfo estes=new EmployeeInfo();
        estes.employeeName();
        estes.employeeId();
        estes.employeeSSn();
      estes.numOfYearsWorked();
        estes.assignDepartment(4);
        estes.calculateSalary(40,20);
        estes.fullTime(45);
        estes.calculateEmployeeBonus("Average performance",estes.calculateSalary());
       estes.calculateEmployeePension(15);



    }

}
