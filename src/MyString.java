public class MyString {
    public static void main(String[] args) {
        String hello = "Hello, Oleksandr!";
        System.out.println(hello);

        int stringLength = hello.length();
        System.out.println(stringLength);

        String helloUp = hello.toUpperCase();
        System.out.println(helloUp);

        String helloLow = hello.toLowerCase();
        System.out.println(helloLow);

        String addString = helloLow + helloUp;
        System.out.println(addString);

        String stringWithInt =
                hello + ", this string length is: " + stringLength;
        System.out.println(stringWithInt);

        String movie = "My favourite movie is \n\"Home Alone\"";
        System.out.println(movie);
    }
}
