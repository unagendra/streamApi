package streamAPI;

//Lambda, Lambda method inference,
// Stream, sorting, filter, map, Collectors

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {

       // Older way
//        Walkable obj = new WalkFast();
//        obj.walk(4,true);

//        Walkable obj = new Walkable() {
//            @Override
//            public int walk(int steps) {
//                return 0;
//            }
//        };

//        Walkable obj = (steps, isEnabled) -> {
//            System.out.println("Walking fast "+ steps +" steps.");
//            return 2*steps;
//        };

//        Walkable obj2 = (steps, isEnabled) -> 2*steps;
//
//      obj2.walk(4, true);


//        List<String> car=List.of("Bugati","Audi","Hummer");
//        car.stream()
//                .sorted()
//                .forEach((action)-> System.out.println(action);


       List<String> fruits = List.of("Banana", "Apple", "Kiwi", "Mango");
//
//        List<String> Cfruits=  fruits.stream()
//               .sorted()
//               .filter((fruit)->fruit.length()<5)
//               .collect(Collectors.toList());
//        System.out.println(Cfruits);

        Map<String, Integer> fruitsList = fruits
                .stream()
//                .map(fruit -> fruit.length())
                .collect(Collectors.toMap(
                        fruit -> fruit,
                        fruit-> fruit.length()
                ));

        System.out.println(fruitsList);
//
//        Stream<String> stream = fruits.stream();
////
//        stream
//                .filter(fruit -> fruit.length() < 6)
//                .sorted()
//                .map(String::length)
//                .map(fruitLength -> 2*fruitLength)
//                .forEach(fruit -> System.out.println(fruit));



    }
}

interface Walkable {
    int walk(int steps, boolean isEnabled);
}

//
//class WalkFast implements Walkable{
//
//
//
//    @Override
//    public int walk(int steps, boolean isEnabled) {
//        System.out.println("Walking fast "+ steps +" steps."+ isEnabled);
//        return 2*steps;
//    }
//}