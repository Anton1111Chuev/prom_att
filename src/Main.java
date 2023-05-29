import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("введите строку");

        Scanner in = new Scanner(System.in);
        String inData = in.nextLine();
        String[] arr = inData.split(" ");
        ArrayList<String> result = new ArrayList<String>();

        for (String el : arr)
        {
            if (el.length()<= 3) {
                result.add(el);
            }
        }
        System.out.println(result);
    }
}