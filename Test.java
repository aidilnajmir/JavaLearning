public class Test {
    public static void main (String args[]) {
        String a = new String("Sharma is a good player");
        String b = "Sharma is a good player";
        
        if(a == b) {
            System.out.println("a == b");
        }
        if(a.equals(b)) {
            System.out.println("a equals b");
        }
    }
}