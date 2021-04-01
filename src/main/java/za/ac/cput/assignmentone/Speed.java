package za.ac.cput.assignmentone;

public class Speed {
    
    private static int test1;
    private static int test2;
    private static int result;
    
    //Getters and Setters
    public static int getResult() {
        return result;
    }

    public static void setResult(int result) {
        Speed.result = result;
    }

    public static int getTest1() {
        return test1;
    }

    public static void setTest1(int test1) {
        Speed.test1 = test1;
    }

    public static int getTest2() {
        return test2;
    }

    public static void setTest2(int test2) {
        Speed.test2 = test2;
    }
    
    //ToString
     public String ToString(){
        System.out.println(result);
        return null;
    }    
   }

    
    

