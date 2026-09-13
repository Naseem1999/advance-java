
class Demo{
     public static void main(String[] args) {
        // int i=0;
        // int j=18/i;
        // System.out.println(j);
        // System.out.println("Bye");

        int i=2;
        int j=0;
        String str=null;

        int nums[]=new int[5];
        try{
           j=18/i;
           System.out.println(str.length());
           System.out.println(nums[1]);
           System.out.println(nums[5]);
        }catch(ArithmeticException e){
            System.out.println("Can not divided By zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your Limit");
        }catch(Exception e){
            System.out.println("Something went wrong.. "+e);
        }
        System.out.println(j);
        System.out.println("Bye");
     }
}