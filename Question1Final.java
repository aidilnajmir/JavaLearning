public class Question1Final {
    public static void main(String[]args){

        int [] arraylist1 = {3, 13, 3, 3};
        int [] arraylist2 = {20, 20, 20};
        int [] arraylist3 = {10, 10, 7, 20, 20, 15};
        int [] arraylist4 = {7, 7, 2, 2, 2, 2, 6, 6, 6};
        int [] arraylist5 = {15, 9, 19};
        int [] arraylist6 = {29};
        int [] arraylist7 = {};

        System.out.println(longestRun (arraylist1));
        System.out.println(longestRun (arraylist2));
        System.out.println(longestRun (arraylist3));
        System.out.println(longestRun (arraylist4));
        System.out.println(longestRun (arraylist5));
        System.out.println(longestRun (arraylist6));
        System.out.println(longestRun(arraylist7));
    }

    public static int longestRun(int[] values){
        if (values == null || values.length == 0) {
            return 0;
        }
        int lastVal = values[0];
        int currentLength = 1;
        int longestLength = 1;
        
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] == lastVal)
        {
            currentLength++;
        }
        
        else
            {currentLength = 1;}
        
           lastVal = values[i];
        
            if (currentLength > longestLength)
           { longestLength = currentLength; }
        }
            return longestLength;
        
           }
}
