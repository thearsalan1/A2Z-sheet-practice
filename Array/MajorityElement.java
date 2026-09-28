package Array;

public class MajorityElement {
    public static void UsingMooreVotingAlgo(int[] arr){
        int candidate =0 ;
        int count = 0;
        for(int num : arr){
            if(count == 0 ) candidate=num;
            count+= (candidate == num) ? 1 : -1;
        }
        int freq=0;
        for(int num :arr){
            if(candidate == num) freq++;
        }
        if(freq> arr.length/2) System.out.println(candidate);
        else System.out.println("No majority element");
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1,1, 2};
        UsingMooreVotingAlgo(arr);
    }
}
