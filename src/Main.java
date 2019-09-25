import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter any integer : ");
        Scanner input = new Scanner(System.in);
        Converter convert = new Converter(input.nextInt());
        System.out.println("Binary : "+convert.toBinary());
        System.out.println("Octal  : "+convert.toOctal());
        System.out.println("Hex    : "+convert.toHex());
    }
}
