
class A{
    public:
    String name;
    int age;
    int rollno;
    int address;
    int phoneNo;
    

   // void printInfo(){
      //  System.out.println(name);
        //System.out.println(age);
        //System.out.println(rollno);
        //System.out.println(address);
        //System.out.println(phoneNo);


        void printInfo( int rollno, int age){
        if(rollno == 101987 && age == 15){
            System.out.println("Name: Jack");
            System.out.println("Age: 15");
            System.out.println("Roll No: 101987");
            System.out.println("Address: 1234");
            System.out.println("Phone No: 9876543");
        }
        else{
            System.out.println("No information found for the given roll number.");
        }
    }

    void main(String args[]){
        A object =new A();
       // object.name = "Jack";
       // object.age = 30;
       // object.rollno = 101987;
        //object.address = 1234;
        //object.phoneNo = 9876543;
        //
        object.printInfo(101987, 15);
        
    }

}
