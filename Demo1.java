class Computer {

    public void playMusic() // void because we are expecting method playMusic to return nothing
    {
        System.out.println("Music is playing....");
    }

    public String getMeAPen(int cost) // here we are expecting getMeAPen method to return a String when we pass
                                      // integer i.e. cost
    {
        if (cost >= 10)
            return "Pen"; // returning a String

        return "Nothing";
    }

}

public class Demo1 {

    public static void main(String a[]) {
        Computer obj = new Computer(); // creating object of class Computer to use its method(playMusic and getMeAPen)
                                       // in this class
        obj.playMusic();
        String str = obj.getMeAPen(2); // storing the string we are expecting (Pen) and then printing it if the value
                                       // of int(cost) is 10 or more than 10
        System.out.println(str);
    }

}
