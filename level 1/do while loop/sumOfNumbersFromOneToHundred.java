public class sumOfNumbersFromOneToHundred {

    public static void main(String[] args) {

        int sum = 0;
        int count = 1;        

        do{
                    
            sum += count;
            
            count++;

         }while(count <= 100);


        System.out.print(sum);

    }

}
