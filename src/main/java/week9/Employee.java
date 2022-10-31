package week9;

public class Employee {
        public static void main(String args[]){
            //create array of employee object
            employee[] obj = new employee[2] ;

            //create actual employee object
            obj[0] = new employee();
            obj[1] = new employee();

            //assign data to employee objects
            obj[0].setData(100,"ABC");
            obj[1].setData(200,"XYZ");

            //display the employee object data
            System.out.println("Employee Object 1:");
            obj[0].showData();
            System.out.println("Employee Object 2:");
            obj[1].showData();
        }
    }
    //Employee class with empId and name as attributes
    class employee {
        int empId;
        String name;
        public void setData(int c,String d){
            this.empId=c;
            this.name=d;
        }
        public void showData(){
            System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
            System.out.println();
        }
    }

