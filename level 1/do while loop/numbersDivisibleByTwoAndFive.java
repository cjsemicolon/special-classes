public class numbersDivisibleByTwoAndFive {

    public static void main(String[] args) {

        int count = 1;        

        do{

            if(count % 2 == 0 && count % 5 == 0){

                System.out.print(count + " ");
    
            }
                    
            
            
            count++;

         }while(count <= 50);


        

    }

}
