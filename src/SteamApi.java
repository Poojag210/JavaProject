import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SteamApi {
    public static void main(String[] args) {

//        *Easy : Given a list of integers, count how many numbers are even using Stream API.
//
//        Example : 	Input: [1, 2, 3, 4, 5, 6]
//        Output: 3

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Even No Count : "+integerList.stream().filter(even->even%2==0).count());

//        *Medium : Given a list of names, return only names that start with the letter "A".
//
//                Example : 	Input: ["Alice", "Bob", "Anna", "Charlie"]
//        Output: ["Alice", "Anna"]

        List<String> names=Arrays.asList("Alice", "Bob", "Anna", "Charlie");
        System.out.println("Names starts with A count : "+names.stream().filter(name->name.startsWith("A")).count());

//        *Hard : Find the maximum number from a list using Stream API.
//
//        Example : 	Input: [10, 5, 20, 8]
//        Output: 20

        List<Integer> maximunNo = Arrays.asList(10,5,20,8);
        System.out.println("Max no : "+maximunNo.stream().max(Integer::compare).get());
    }
}
