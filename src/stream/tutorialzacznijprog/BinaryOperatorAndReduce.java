package stream.tutorialzacznijprog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 *
 * @author Adam Bryksy
 */

public class BinaryOperatorAndReduce {
    
    public static void main(String[] args) {
        BinaryOperator<String> text = (x, y) -> x + " " + y;
        System.out.println(text.apply("Adam", "Bravo"));
        
        List<String> computerLanguageList = getComputerLanguageList();
        //number of elements
        long numberOfLines = computerLanguageList.stream().count();
        System.out.println("Number of lines ::: " + numberOfLines);
        List<Integer> numberLettersInRow = getNumberLettersInRow(computerLanguageList);
        System.out.println("Number of leters in a row ::: " + numberLettersInRow);
        System.out.println("Sum Number of letters in a row ::: " + getSumNumberLettersInRow(computerLanguageList));
        System.out.println("The above solution with using " + getSumNumberLettersInRowWithUsingReduce(computerLanguageList));
        System.out.println("The above solution with using and times two any letter " + getSumNumberLettersInRowTimes(computerLanguageList));
        
    }
    
    private static List<String> getComputerLanguageList() {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("php");
        list.add("python");
        list.add("perl");
        list.add("c");
        list.add("lisp");
        list.add("c#");
        return list;
    }
    
    
    private static List<Integer> getNumberLettersInRow(List<String> listLetters) {
        return listLetters.stream()
                          .map(el -> el.length())
                          .collect(Collectors.toList()) ;
    }
    
    private static int getSumNumberLettersInRow(List<String> listLetters) {
        return listLetters.stream()
                          .mapToInt(el -> el.length())
                          .sum();
    }
    
    private static int getSumNumberLettersInRowWithUsingReduce(List<String> listLetters) {
        return listLetters.stream()
                          .mapToInt(el-> el.length())
                          .reduce(10, (x, y) -> x + y);               
    }
    
    private static int getSumNumberLettersInRowTimes(List<String> listLetters) {
        return listLetters.stream()
//                          .reduce(10, (x, y) -> x +  (2 * y.length()), (x, y) -> x + y).intValue();
                          .reduce(10, (x, y) -> x +  y.length(), (x, y) -> y + (2* x)).intValue();
        
    }
    
}
