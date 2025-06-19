import mypack.Mypackage;

public class TestAll {
    public static void main(String[] args) {
        // Call static method
        Mypackage.staticMethod();
        
        // Create instance and call instance method
        Mypackage obj = new Mypackage();
        obj.displayMessage();
        
        // Call main method
        Mypackage.main(new String[0]);
    }
}