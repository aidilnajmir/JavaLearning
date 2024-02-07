public class Question2Final {
    public static void printAdditionExpression(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        //System.out.print(nums[i] + " + "); // remove this line
        // Insertion of code starting from here
        if (i < nums.length - 1) {
        System.out.print(nums[i] + " + ");
        }
        else {
        System.out.print(nums[i]);
        }
        // Insertion of code ending here
        }
        System.out.println();
        }
}
