import java.util.*;

public class RITA {
    private int[] arr;
    private int size;

    public RITA(){
        arr = new int[5];
        size = 0;
    }
    public void add(int val){
        if(size == arr.length){
            int[] t = new int[arr.length + 5];
            System.arraycopy(arr,0,t,0,arr.length);
            arr = t;
        }
        arr[size++] val;
        
    }
    
}