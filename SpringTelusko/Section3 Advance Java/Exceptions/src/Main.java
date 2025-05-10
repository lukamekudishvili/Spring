public class Main {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0)
                throw new MyException("J not allowed to be 0");
        }catch (Exception e){
            System.out.println(e.getCause());
            j=18/1;
        }

        System.out.println(j);
        System.out.println("Bye");

        try{
            Class.forName("DEMO")
        }
    }
}
