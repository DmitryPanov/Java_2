package lesson2;

public class NotANumberException extends Exception {

    public NotANumberException(){
        System.out.println("Содержит строку или символ");
    }

}
