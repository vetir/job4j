package lifeCode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NoRepetitions {

    public static void main(String[] args) {
//Например 2 массива int[] arr1 = {-10, -20, 5, 2, 2, -10, 6} и int[]
// arr2 = {-20, 1, 3, 3, 7, 6, 0, 0}.
// Ответ должен получится -10 5 2 2 -10 1 3 3 7 0 0
// В первом случае надо вывести элемнты из первого массива если их нет во втором
        int[] arr = {-10,-20,5,2,2,-10,6};
        int[] arr2 = {-20,1,3,3,7,6,0,0};
        matches(arr,arr2);
        matches(arr2,arr);


    }
    public static void matches(int[] arr, int[] arr2){
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!found)
                System.out.print(arr[i] + " -> ");
            found = false;
        }
    }
}
// Orders - {id, userid, amount}
//Select userid as job4j.User from Orders group by userid Having SUM(amount) > 1000000
//Select userid  from Orders group by userid Having SUM(amount) > 1000000
