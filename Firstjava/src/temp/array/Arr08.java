package temp.array;

public class Arr08 {
    public static void main(String[] args) {
        //최대값
        int[] arr ={3,2,1,5,101};

        int max= arr[0];
        for (int num : arr) {
            if(num>max) {
                max = num;
            }
        }
        System.out.println("max = " + max);

        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("min = " + min);

    }
}
