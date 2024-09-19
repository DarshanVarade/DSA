public class ifelse{
    public static void main(String args[]){
        int age=21;
        if(age>=18){
            System.out.println("adult");
        }
        if(age>=13 && age<18){
            System.out.println("teenager");

        }

        else{
            System.out.println("not adult");
        }

        int a=1,b=3;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

    }
}