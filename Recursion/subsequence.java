import java.util.*;

class subsequence{
    static void printsubs(int ind, ArrayList<Integer> ds, int[] arr, int n){

        // BASE CASE:
        // All elements have been considered.
        // the current ds represents one complete subsequence
        if(ind==n){
            System.out.println(ds);
            return;
        }

        // CASE 1: Pick
        // include the current element in the subsequence
        ds.add(arr[ind]);

        // Recursively explore the next index with this element picked.
        printsubs(ind+1, ds, arr, n);

        // BACKTRACKING:
        // Remove the last picked element to restore the previous state.
        ds.remove(ds.size()-1);


        // CASE 2: Not Pick
        // Skip the current element and move to the next index.
        printsubs(ind+1, ds, arr, n);
    }

    public static void main(String[] args){
        // input array.
        int[] arr={3,1,2};

        // Length of the array.
        int n =arr.length;

        // Initally, the subsequence is empty.
        ArrayList<Integer> ds=new ArrayList<>();

        // Start recursion from index 0.
        printsubs(0,ds,arr,n);
    }


}
// Output
// [3, 1, 2]
// [3, 1]
// [3, 2]
// [3]
// [1, 2]
// [1]
// [2]
// []