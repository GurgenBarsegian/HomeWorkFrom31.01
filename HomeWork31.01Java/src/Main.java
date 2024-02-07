import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArithmeticOperation arithmeticOperation =new ArithmeticOperation();
        String name1;
        System.out.println("Пользователь, введи свое имя: ");
        name1=scanner.nextLine();
        System.out.println(name1 + ", Проверим твои знания");

        int number1 = arithmeticOperation.number1;
        int number2 = arithmeticOperation.number2;
        int name1Add = arithmeticOperation.getResultOfAdd();
        int name1Sub = arithmeticOperation.getResultOfSub();
        int name1Mlt = arithmeticOperation.getResultOfMult();
        int name1Div = arithmeticOperation.getResultOfDiv();


        System.out.println("Сколько будет:  " + number1 + "+" + number2);
        int addResult=scanner.nextInt();
        boolean isRightAdd = addResult == name1Add;
        if (isRightAdd){
            System.out.println("Поздравляю! Вы  правильно ответили на вопрос");
        }
        else {
            System.out.println("Увы, ответ не правильный! Правильный ответ: " + name1Add);
        }


        System.out.println("Сколько будет:  " + number1 + "-" + number2);
        int subResult=scanner.nextInt();
        boolean isRightSub = subResult == name1Sub;
        if(isRightSub){
            System.out.println("Поздравляю! Вы  правильно ответили на вопрос");
        }
        else {
            System.out.println("Увы, ответ не правильный! Правильный ответ: " + name1Sub);
        }


        System.out.println("Сколько будет:  " + number1 + "*" + number2);
        int multResult =scanner.nextInt();
        boolean isRightMult = multResult == name1Mlt;
        if (isRightMult){
            System.out.println("Поздравляю! Вы  правильно ответили на вопрос");
        }
        else {
            System.out.println("Увы, ответ не правильный! Правильный ответ: " + name1Mlt);
        }

        System.out.println("Сколько будет:  " + number1 + "/" + number2);
        int divResult = scanner.nextInt();
        boolean isRightDiv = divResult == name1Div;
        if (isRightDiv){
            System.out.println("Поздравляю! Вы  правильно ответили на вопрос");
        } else {
            System.out.println("Увы, ответ не правильный! Правильный ответ: " + name1Div);
        }

        System.out.println("Поздравляю! Опросник завершен! Вот номер хорошего преподавателя по математике : +380......");
    }
}


//+ number1 + "+" + number2 + "=" + arithmeticOperation.getResultOfAdd())