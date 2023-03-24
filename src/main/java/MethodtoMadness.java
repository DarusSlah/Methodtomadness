import java.util.Scanner;

public class MethodtoMadness {
    // Question 1
    public static void  printName(){
        System.out.println("Darus Slah");
    }
    // Question 2
    public static String greetUser(String userName) {
        return "Welcome to my Website " + userName;
    }
    // Question 3
//public static double buyCoffee(double dollars){

//}
    // Question 4
    public static void myHobbies(){
        String[] myHobbies = {"playing video games" , "Driving" , "Swimming", "Reading"};
    }
    // Question 5
public static double checkWeather(String weatherCondition , int temperture ){

       if(weatherCondition=="hot"){
           if(temperture >= 80){
               System.out.println("wear shorts");
           }
       } else if (weatherCondition == "cool") {
           if(temperture >= 50){
               System.out.println("wear a jacket");
           }
       } else if (weatherCondition == "cold") {
           if(temperture <50){
               System.out.println("wear a jacket");

           }
       }else {
           System.out.println("No such weather condition");
       }

}


//}
    // Question 6
    public static double areaOfTriangle(int base , int height){
        int area = (base * height)/2;
        return(area);
    }


    public static void main(String[] args) {
        // Question 1
        printName();

        // Question 2
        greetUser("Darus");

        // Question 3

        // Question 4

        // Question 5

        // Question 6
        System.out.println(areaOfTriangle(5,6));
        // Question 7

        // Question 8
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your name?");
        String userName = userInput.nextLine();
        System.out.println("Hello " + userName);


        // Question 9

        // Question 10
        String[][] rappers = {
                {"Biggie", "Jay-Z, Nas"},
                {"Juicy", "22Twos", "One Mic"},

        };
    }
}
