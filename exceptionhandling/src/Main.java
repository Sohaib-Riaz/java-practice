public class Main{
    public static void main(String[] args){
        //Aritmetic Exception
        int a =10;
        int b=0;
        try{
            int result = a/b;
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("Invalid value");
        }finally {
            System.out.println("Enter valid Values i.e b>0");
        }
        //Null pointer Exception
        String name=null;
        try{
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println("Null pointer Exception Occurs");
        }finally {
            System.out.println("Enter Valid String");
        }

        //ArrayIndexOutOfBounds
        int[] array={1,2,4};
        try{
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception Occurs");
        }



    }
}