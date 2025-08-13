
import java.util.Scanner;



class selecao{

    public static void ordenacaoselecao(int n,int []num){
        
        for(int i=0;i<n-1;i++){
            int menor=i;
            for(int j=i+1;j<n;j++){
                if(num[menor]>num[j]){
                    menor=j;
                }
            }
            int temp=num[i];
            num[i]=num[menor];
            num[menor]=temp;
        }
    }
     public static void main(String[] args) {
           int n;
           Scanner sc = new Scanner(System.in);
           n=sc.nextInt();
           int [] num= new int[n];
           for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
           }

           ordenacaoselecao(n,num);
           for (int m : num) {
            System.out.print(m + " ");
        }
    }
    
     
}