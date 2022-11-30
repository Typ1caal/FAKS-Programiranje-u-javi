public class Array{
    
    int zb;
    Array(){
        int arr[] = {5, 4, 3, 521, 312, 213, 451, 23, 12};
            
            for(int i : arr){
	           zb = zb + i;
	        }
	   System.out.println(zb);
    }
}