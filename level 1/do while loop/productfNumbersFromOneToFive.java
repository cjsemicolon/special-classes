public class productfNumbersFromOneToFive {

    public static void main(String[] args) {

        int product = 1;
        int count = 1;        

        do{
                    
            product *= count;
            
            count++;

         }while(count <= 5);


        System.out.print(product);

    }

}
