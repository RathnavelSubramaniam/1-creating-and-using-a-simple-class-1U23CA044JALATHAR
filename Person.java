class Person1 {
    String firstname;
    String lastname;
    int age;
    Person1 (String fname,String lname,int a){
        firstname=fname;
        lastname=lname;
        age=a;
    }
    String getfullname(){
    return (firstname+lastname);
    }
}
public class Person{
    public static void main(String args[])
    {
        Person1 b1=new Person1("Jhon"," Doe",30);
        Person1 b2=new Person1("Alice", " Smith",25);
        System.out.println("Person1:"+b1.getfullname());
        System.out.println("Person2:"+b2.getfullname()); 
        double avg=((b1.age+b2.age)/2);
        System.out.println("AverageAge:"+avg);
    }
}


  
