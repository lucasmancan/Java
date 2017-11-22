public class Main{

    
    public static void main(String[] args) {
        
        double i , j, k;
        
        for(i=0;i<=2;i=i+0.2){
            for(k=1;k<=3;k++){
           j=k+i;
           if(j%1==0){
            System.out.printf("I=%.0f J=%.0f\n",i, j);
           }else{
               System.out.printf("I=%.1f J=%.1f\n",i, j);
           }  
 

            }
            
        }
        
    }
}