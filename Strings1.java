public class Strings1 {
    public static void main(String[] args) {
        String firstName = "john";
        String lastName = "doe";
        //String fullName = firstName + " " + lastName;
        // System.out.println(fullName); // printing string
        // System.out.println(fullName.length()); // length of string

        // for(int i = 0 ; i < fullName.length(); i ++){
        //     System.out.println(fullName.charAt(i)); // printing each character of string
        // }


        // compare
        //if(firstName.compareTo(lastName)==-1){
          //  System.out.println("firstName comes before lastName");
        //} else {
         //   System.out.println("firstName does not come before lastName");
      //  }

        // substring
        String fullName = firstName + " " + lastName;
        String subString = fullName.substring(2,4);
        System.out.println(subString);

    }
}
