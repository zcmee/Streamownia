package streams;

import api.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Streams {
    
    public static void main(String[] args) {
        
        Pair pair1 = new Pair("Bartosz", "Krymski");
        Pair pair2 = new Pair("Adam", "Bryksy");
        Pair pair3 = new Pair("Marek", "Rusnak");
        Pair pair4 = new Pair("Agnieszka", "Babiuch");
        
        List <Pair> pairs = new ArrayList<>(Arrays.asList(pair1, pair2, pair3, pair4));
        System.out.println(
                pairs.stream()
//                .map(Pair::getFirst)
                .filter(v -> v.getFirst().startsWith("A"))
//                .map(Pair::Pair)
                .collect(Collectors.toList())
        );
        
        pairs.stream()
                    .filter(pair -> pair.getFirst().startsWith("A"))
                    .forEach(System.out::print); 
        
        
        
    }
    
}
