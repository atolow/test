package fc.java.realtest;

import java.util.*;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples","bananas","milk","eggs"};
        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println("-".repeat(30));

        System.out.println(list.getClass().getName());
        System.out.println("-".repeat(30));

//        list.add("yogurt");

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        System.out.println("-".repeat(30));


        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard"," cheese"));
        System.out.println(nextList);
        System.out.println("-".repeat(30));


        groceries.addAll(nextList);
        System.out.println(groceries);
        System.out.println("-".repeat(30));


        System.out.println("Third item = "+ groceries.get(2));
        System.out.println("-".repeat(30));

        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
            System.out.println("-".repeat(30));
        }

        groceries.add("yogurt");
        System.out.println("first =" +groceries.indexOf("yogurt"));
        System.out.println("last =" + groceries.lastIndexOf("yogurt"));
        System.out.println("-".repeat(30));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);
        System.out.println("-".repeat(30));

        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);
        System.out.println("-".repeat(30));

        groceries.retainAll(List.of("apples","milk","mustard","cheese")); //이거 뺴꼬 다 지우기
        System.out.println(groceries);
        System.out.println("-".repeat(30));

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());
        System.out.println("-".repeat(30));

        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());  //작은거부터 큰 순서대로 정렬
        System.out.println(groceries);
        System.out.println("-".repeat(30));

        groceries.sort(Comparator.reverseOrder());  //큰거부터 작은 순서대로 정렬
        System.out.println(groceries);
        System.out.println("-".repeat(30));

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
        System.out.println("-".repeat(30));


        String[] wow = new String[] {"First","Second","Third"};   //->Arrays 생성
        var house = Arrays.asList(wow);             //ArrayList 로변환
        System.out.println("Array"+ Arrays.toString(wow));
        System.out.println("List" + house);
        System.out.println("-".repeat(30));

        house.set(0,"one");
        house.sort(Comparator.naturalOrder());
        System.out.println("List"+house);
        System.out.println("Array"+Arrays.toString(wow));
        System.out.println("-".repeat(30));

    }
}
