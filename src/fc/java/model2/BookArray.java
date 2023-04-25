package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY=5; //수정불가(final)
    private Book[] elements;
    private int size=0;

    //생성동작
    public BookArray(){
        elements=new Book[DEFAULT_CAPACITY];
    }
    //저장하는 동작
    public void add(Book element){
        //크키체크? if
        if(size==elements.length){
            ensureCaptity();
        }
        elements[size++]=element;
    }

    public void ensureCaptity() {
        int newCapacity=elements.length+1;
        elements=Arrays.copyOf(elements,newCapacity);  //newCapacity를 elements 에 카피
    }

    //얻느동작
    public Book get(int index) {
        if(index<0 || index>=size) //-1,5~
        {
            throw new IndexOutOfBoundsException(("index 범위초과"));
        }
        return elements[index];
    }
    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

}
