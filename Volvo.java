
public class Volvo extends Car{
 double price;
 String productionYear;
 String registrationNumber;

 Engine eng;
 DashBoard db;
public Volvo(double price, String productionYear, String registrationNumber, Engine eng, DashBoard db)
{
 this.price=price;
this.productionYear=productionYear;
 this.registrationNumber=registrationNumber;
this.eng=eng;
 this.db=db;
 }
 public void changeFuel()
 {
System.out.println("Changing Fuel");
 }
public void checkBattery()
 {
 System.out.println("Checking battery");
 }
 public static void main(String[] args) {
  Engine eng = new Engine(34.7);
  DashBoard db= new DashBoard(5.0);

  Volvo v=new Volvo(700,"2022", "DHA34567",eng,db);
  v.drive();
  v.stop();
  v.changeFuel();
  v.checkBattery();
  v.model="SUV. XC40";
  v.company="Volvo";

 }
}

