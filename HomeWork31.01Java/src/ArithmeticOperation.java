import java.util.Random;

public class ArithmeticOperation {
    Random random=new Random();
    int number1 =random.nextInt(5, 10);
    int number2 =random.nextInt(1, 5);

    public int getResultOfAdd(){
        int sumOfAdd = number1+number2;
        return sumOfAdd;
    }
    public int getResultOfSub(){
        int sumOfSub = number1-number2;
        return sumOfSub;
    }
    public int getResultOfMult(){
        int sumOfMult = number1*number2;
        return sumOfMult;
    }
    public int getResultOfDiv(){
        int sumOfDiv = number1/number2;
        return sumOfDiv;
    }
}
