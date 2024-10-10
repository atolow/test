package assignment;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();


        Scanner sc = new Scanner(System.in);
        System.out.print("저장할 자료구조명을 입력합니다: ");
        String type = sc.nextLine();

        String context;
        if(type.equals("List")){
            while(true) {
                context =sc.nextLine();
                if (context.equals("end")) {
                    break;
                }
                linkedList.add(context);
            }
        }
        else if(type.equals("Set")){
            while(true) {
                context =sc.nextLine();
                if (context.equals("end")) {
                    break;
                }
                set.add(context);
            }
        }
        else if(type.equals("Map")){
            while(true) {
                context =sc.nextLine();
                if (context.equals("end")) {
                    break;
                }
                map.put(context,context);
            }
        }

        System.out.println("[" +type +"으로 저장된 백종원 돼지고기 김치찌개 만들기]");

        if(type.equals("List")){
            for(int i=1;i<linkedList.size();i++) {
                System.out.println(i + "." + linkedList.get(i));
            }
        }
        else if(type.equals("Set")){

            int i=1;
            Iterator<String> iterator = set.iterator();
            while(iterator.hasNext()){

                System.out.println(i + "." +iterator.next() + " ");
                i++;
            }
        }
        else if(type.equals("Map")){
            int i=1;
            for (String value : map.values()) {
                System.out.println(i + "." + value);
                i++;
            }
        }


    }
}
