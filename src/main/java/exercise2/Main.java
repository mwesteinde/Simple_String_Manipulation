package exercise2;

class Main {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        System.out.println(s1);
        System.out.println("The length of "+s1+" is "+s1.length());
        System.out.println("The first character of "+s1+" is "+s1.charAt(0));

        // let us use one of the methods in the StringUtility class
        // for static methods in a class, we use the syntax:
        // ClassName.methodName()
        // and the following is an example
        // In Repl.it, you can find the relevant file by clicking on
        // the file logo at the top left of the embedded window
        System.out.println(StringUtility.isPalindrome("abba"));
        // we should get true but will be false for now!

        // and let us test another method in StringUtility
        String clint = "clinteastwood"; // this is one way to define a String
        System.out.println(StringUtility.areAnagrams("oldwestaction", clint));
        // notice how we are passing one string within " " and another using a variable name
        // again, we will get a false but the answer should be true. fix it!
    }
}