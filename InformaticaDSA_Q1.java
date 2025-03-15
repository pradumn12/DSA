import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InformaticaDSA_Q1 {
    public static void main(String[] args) {
        String[] arr = {"Apple","Banana","Orange","Apple","Kiwi","Orange","Banana","Watermeloon","Apple","Orange","Banana"};

        //sortByValueAscending(arr);
        //sortByValueDescending(arr);
        //sortByKeysAscending(arr);
        //sortByKeysDescending(arr);
        sortByValueDescendingAndAlphabeticIfValueMatch(arr);
    }
    public static void sortByValueAscending(String[] arr){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,(map.get(str))+1);
            }else{
                map.put(str,1);
            }
        }

        System.out.println("Normal map frequency: "+map);

        Map<String,Integer> sorted_Map = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e2,LinkedHashMap::new));
        System.out.println("After sort");
        sorted_Map.forEach((key,value) -> System.out.println(key +" "+ value));
    }
    public static void sortByValueDescending(String[] arr){

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,(map.get(str))+1);
            }else{
                map.put(str,1);
            }
        }

        System.out.println("Normal map frequency: "+map);

        Map<String,Integer> sorted_Map = map.entrySet().stream()
        .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e2,LinkedHashMap::new));
        System.out.println("After sort");
        sorted_Map.forEach((key,value) -> System.out.println(key +" "+ value));

    }
    public static void sortByKeysAscending(String[] arr){

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,(map.get(str))+1);
            }else{
                map.put(str,1);
            }
        }

        System.out.println("Normal map frequency: "+map);

        Map<String,Integer> sorted_Map = map.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e2,LinkedHashMap::new));
        System.out.println("After sort");
        sorted_Map.forEach((key,value) -> System.out.println(key +" "+ value));

    }

    public static void sortByKeysDescending(String[] arr){

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,(map.get(str))+1);
            }else{
                map.put(str,1);
            }
        }

        System.out.println("Normal map frequency: "+map);

        Map<String,Integer> sorted_Map = map.entrySet().stream()
        .sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e2,LinkedHashMap::new));
        System.out.println("After sort");
        sorted_Map.forEach((key,value) -> System.out.println(key +" "+ value));

    }
    public static void sortByValueDescendingAndAlphabeticIfValueMatch(String[] arr){

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,(map.get(str))+1);
            }else{
                map.put(str,1);
            }
        }

        System.out.println("Normal map frequency: "+map);

        Map<String,Integer> sorted_Map = map.entrySet().stream()
        .sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry::getKey))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e2,LinkedHashMap::new));
        System.out.println("After sort");
        sorted_Map.forEach((key,value) -> System.out.println(key +" "+ value));

    }

}
