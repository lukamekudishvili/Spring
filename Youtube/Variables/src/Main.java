class Main{

    public static void main (String [] args) {

        String password[] = { "XY01", "XY02", "XY03", "XY04"};

        String result =" ";

        for(int i = password.length-1; i>=2; i--) {

            result = result + password[i];

        }

        System.out.println(result); }

}