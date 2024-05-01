// //24. methods in Java

// class Computer {

// public void playMusic() // void because we are expecting method playMusic to
// return nothing
// {
// System.out.println("Music is playing....");
// }

// public String getMeAPen(int cost) // here we are expecting getMeAPen method
// to return a String when we pass
// // integer i.e. cost
// {
// if (cost >= 10)
// return "Pen"; // returning a String

// return "Nothing";
// }

// }

// public class Demo1 {

// public static void main(String a[]) {
// Computer obj = new Computer(); // creating object of class Computer to use
// its method(playMusic and getMeAPen)
// // in this class
// obj.playMusic();
// String str = obj.getMeAPen(2); // storing the string we are expecting (Pen)
// and then printing it if the value
// // of int(cost) is 10 or more than 10
// System.out.println(str);
// }

// }
// ...
// ...
// ...
// ...
// ...

// //25. Method Overloading

// //When Methods of same name but different parameters or
// TYPE(int,double,float,etc) of parameters in a SAME class is used as Method
// overloading. You will call the method according to the type of parameter or
// number of parameters according to your needs.

// class Calculator {
// public int add(int n1, int n2) {
// return n1 + n2;
// }

// public int add(int n1, int n2, int n3) { // here we used the same method(add)
// and changes the number of parameters
// return n1 + n2 + n3;
// }

// public double add(int n1, double n2) { // here we used the same method(add)
// and changed the type of parameters
// return n1 + n2;
// }
// }

// class Demo1 {
// public static void main(String a[]) {
// Calculator obj = new Calculator();

// // int r1 = obj.add(15, 5);
// // System.out.println(r1); //ans: 20

// // int r1 = obj.add(5, 9, 1); //here we are using add method of three
// // parameters. Similarly as per your need you can use other above add methods
// // too.
// // System.out.println(r1); // ans: 15

// double r1 = obj.add(5, 100000);
// System.out.println(r1); // ans: 100005.0

// }
// }
// ...
// ...
// ...
// ...
// ...

// //Creation of Array

// public class Demo1 {
// public static void main(String a[]) {

// int nums[] = { 6, 5, 0, 2 }; // the [] says nums is an array
// System.out.println(nums[0]); // printing value at 0th position. ans: 6

// nums[1] = 4; // overwriting value at present at the 1st position
// System.out.println(nums[1]); // ans: 4
// }
// }

//what if you don't know values but know the lenth of an array
public class Demo1 {
    public static void main(String a[]) {
        int nums[] = new int[4]; // length of the array is four. Bydefault the values in the array are set to 0
        nums[0] = 9; // setting the values
        nums[1] = 4;
        nums[2] = 7;
        nums[3] = 2;

        // for (int i = 0; i < 4; i++) {
        // System.out.println(nums[i]); //ans: 9 4 7 2
        // }

        // using enhanced loop- intead of writing above for loop, we can tell the
        // program to give us whatever values in the arrays are

        for (int n : nums) {
            System.out.println(n); // ans: 9 4 7 2
        }

    }
}

// ...
// ...
// ...
// ...
// ...