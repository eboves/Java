package exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[] args){
        String[] numbers = new String[]{"123-123-3454", null, "163-234-3467", "234-435-4567"};

        for(int i = 0; i < numbers.length; i++){
            try{
                System.out.println(new Phone("iPhone: ", numbers[i]));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }
        }
    }
}
