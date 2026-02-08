package ExceptionHandling;

public class AgeCheck {
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
           // System.out.println("Not eligible for voting");
            throw new InvalidAgeException("Not eligible for voting.....");
        }else {
            System.out.println("Eligibility for voting");
        }
    }

    public static void main(String[] args){
        try {
            checkAge(3);
        }
        catch (InvalidAgeException e){
            System.out.println("Test failed: "+e.getMessage());
        }
    }
}
