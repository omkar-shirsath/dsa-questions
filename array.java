import java.util.*;

public class array{
    public static void inputArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in array : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The element of the array is : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println();
    }

    public static void getPairs(int arr []){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void getsubarray(int arr[]){
        int ms= Integer.MIN_VALUE;
        
        int prefix [] = new int[arr.length];
        
        for(int i = 0;i<arr.length;i++){
            prefix[i] = i == 0 ? arr[i]:prefix[i-1]+arr[i];
        }
        
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
               int cs = i==0 ? prefix[j]: prefix[j]-prefix[i-1];
               ms = Math.max(ms,cs);
            }

            
        }
        System.out.println("Maximume sum in the subarray : "+ms);

        
    }

    public static void kadans(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0;i<arr.length;i++){
            cs = cs+arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms,cs);
        }
        if(ms ==0){
            ms = Integer.MIN_VALUE;
            for(int i = 0;i<arr.length;i++){
                ms = Math.max(ms,arr[i]);
            }
        }
        System.out.println("maximume sum : "+ms);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = true;
        while (flag== true){
            System.out.printf("Menu :%n 1.pairs of array elements %n 2.subarrays of given array %n 3.kadans algo for maximume sum %n 4.exit%n");
            int ch = sc.nextInt();
            switch(ch){
               case 1: {
                    inputArray(arr);
                    getPairs(arr);
                    int numofpair = (n*(n-1))/2;
                    System.out.println("number of pairs : "+numofpair);
                }
                break;
                case 2:{
                    inputArray(arr);
                    getsubarray(arr);

                }
                break;
                case 3:{
                    inputArray(arr);
                    kadans(arr);
                }
                break;
               case 4:
                System.out.println("process exit !!!!");
                flag = false;
                break;
                default:
                System.out.println("wrong choice try again ");

            }
        }
        
        

    }
}