public class LargestNoArray {
    public static void main(String[] args) {
        int[] myarr = {15,31,44,55,85,77,88,5,4,6};
        int largest = myarr[0]; 
        int smallest = myarr[0];
        for(int i=1;i<myarr.length;i++){
            if(myarr[i] > largest){
                largest = myarr[i];
            }

            if(myarr[i] < smallest){
                smallest = myarr[i];
            }
        }

        System.out.println(largest);
        System.out.println(smallest);
    }
}
