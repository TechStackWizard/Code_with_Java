public class StaticMeans {
    public static void main(String[] args) {

        // Employee e1 = new Employee("Rohan");
        // Employee e2 = new Employee("Subhrat");

        // System.out.println("Total Employees : "+ Employee.count);

        int res = MathUtitility.add(12, 20);
        System.out.println("TOtal sum is : "+res);
    }
}


class Employee{
    static int count = 0;

    String name;

    Employee(String name){
        this.name = name;
        count++;
    }
}

//Static Utitilithy Methods

class MathUtitility{
    static int add(int a, int b){
        return a+b;
    }
}

