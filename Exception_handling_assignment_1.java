public class Exception_handling_assignment_1 {
    public static void main(String args[]) {
        try{
            int num=121/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("Number should not be divided by zero "+e);
        }
        finally {
            System.out.println("Thank you");
        }
    }
}
