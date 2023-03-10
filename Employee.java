public class Employee {
 String name;
AddressInfo addressInfo;
 InsuranceInfo insuranceInfo;
public Employee(String name, AddressInfo addressInfo, InsuranceInfo insuranceInfo)
{
 this.name=name;
this.addressInfo=addressInfo;
 this.insuranceInfo=insuranceInfo;

 }
 public void display()
 {
System.out.println("Name of Employee : "+this.name);
 System.out.println("Address of Employee: "+
                addressInfo.street+", "+addressInfo.city+", "+
                 addressInfo.state+", "+addressInfo.postalCode);
 System.out.println("Insurance information: "+
                 insuranceInfo.policyName+", "+insuranceInfo.policyId);
 }


 public static void main(String[] args) {
 AddressInfo addressInfo= new AddressInfo("Sector 4", "Uttara", "Dhaka", "1711");
InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 123);
 Employee employee =new Employee("Mr. Rahim",addressInfo, insuranceInfo );
 employee.display();
 }
 }
