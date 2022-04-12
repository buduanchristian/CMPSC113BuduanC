public class App {

    //Overloaded Methods
    //This method takes in two int parameters to add.
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }

    //This method takes in 3 int parameters to add.
    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //Create method that returns the greater integer value
    private static int greaterValue(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else
            return num2;
    }

    //Method that returns the greater double value
    private static double greaterValue(double num1, double num2){
        if (num1 > num2) {
            return num1;
        } else
            return num2;
    }

    //main class
    public static void main(String[] args) throws Exception {

        //Calling the Overloading Method that takes in 2 parameters, and 3 parameters
        System.out.println("The Sum of 37 and 43 = " + App.computeSum(37,43));
        System.out.println("The Sum of 37 , 43 and 100 = " + App.computeSum(37,43,100));

        //Calling the greaterValue method with integer parameters
        System.out.println("The greater integer value between 45 and 100 is " + App.greaterValue(45,100));

        //Call the greaterValue method with double parameters
        System.out.println("The greater double value between 3.14 and 9.8 is " + App.greaterValue(3.14,9.8));

    }
}