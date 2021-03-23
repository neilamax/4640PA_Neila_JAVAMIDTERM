package design;

public abstract class  Employee2 implements Employee {

        String firstName;
        String lastName;
        String name=firstName+ lastName;
        int numberOfhours;
         double salary;

        public Employee2(){

        }

        public Employee2(String firstName, String lastName, String name) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.name = name;
        }

    public Employee2( int numberOfhours, double salary) {

        this.numberOfhours = numberOfhours;
        this.salary = salary;
    }

    public int getNumberOfhours(int numberOfhours) {
        System.out.println("I work "+numberOfhours+" hours a week");
        return numberOfhours;
    }
    public int getWage(int wage){
        System.out.println( "the wage is " + wage);
        return wage;
    }


    public boolean fullTime(int numberOfhours){
            if(numberOfhours>=40){
                System.out.println(" you are working full time");
                return true;
            }
            return false;
        }


    public abstract void assignDepartment(int dept);

    public abstract int calculateSalary(int numberOfhours, int wage);
}
