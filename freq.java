public class freq {
    //frequency array is used when we know the range of array
    //value of n should be small for frequency array
/*     public static void main(String[] args) {

        String s = "banana";

        int freq[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                char ch = (char)(i + 'a');
                System.out.println(ch + " -> " + freq[i]);
            }
        }
    }
}*/ 

     public static void main(String[] args) {

        int arr[] = {1,2,2,3,1,5};

        int freq[] = new int[6];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }
}

    /*  public static void main(String[] args) {
        int count = 1 ;
        int arr[] = {2 , 3 , 4, 2, 5, 3};
        for(int i = 0 ; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        System.out.println("count" + count);
        }

    }
}*/

/*public static void main(String[] args) {
    int arr[] = {2, 3, 4, 2, 5, 3};

    for (int i = 0; i < arr.length; i++) {
        int count = 1;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }

        System.out.println(arr[i] + " -> " + count);
    }
}
}*/