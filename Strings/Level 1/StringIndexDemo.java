public class StringIndexDemo {
   
    public static void generateException() {
        
        System.out.println(text.charAt(10));
    }
    public static void handleException() {
        String text = "Java";
        try {
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       
        handleException();
    }
}
