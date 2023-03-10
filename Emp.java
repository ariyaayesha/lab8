public class Emp {
    int id;
    String name;
    Address address;
    public Emp(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public void display(){
        System.out.println(id+""+name);
        System.out.println(address.city+address.state+address.county);
    }
    public static void main(String[] args) {
        Address address1=new Address("gazipur","konabari","dhaka");
        Address address2=new Address("gazipur","konabari","dhaka");

        Emp e =new Emp(12,"ayesha",address1);
        Emp e2 =new Emp(13,"esha",address2);
       e.display();
       e2.display();

    }
}