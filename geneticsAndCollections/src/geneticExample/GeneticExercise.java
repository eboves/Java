package geneticExample;


import java.util.ArrayList;
import java.util.List;

public class GeneticExercise {
    public static void main(String[] args){
        ArrayList<Object> variables = new ArrayList<Object>();
        double doubleNumber = 1.5;
        String name = "name";
        int number = 7;
        char a = 'a';

        variables.add(doubleNumber);
        variables.add(name);
        variables.add(number);
        variables.add(a);
        for(Object variable: variables){
            displayName(variable);
        }
    }
    static <T> void displayName(T variables){
        System.out.println(variables.getClass().getName());
    }
}
