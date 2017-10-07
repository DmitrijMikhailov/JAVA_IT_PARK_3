import java.util.Scanner;
class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int many = scanner.nextInt();
        int fiveThousand, oneThousend, fiveHundred, hundred, fifty, ten, five, two, one;
        fiveThousand = many / 5000;
        many = many - fiveThousand * 5000;
        oneThousend = many / 1000;
        many = many - oneThousend * 1000;
        fiveHundred = many / 500;
        many = many - fiveHundred * 500;
        hundred = many / 100;
        many = many - hundred * 100;
        fifty = many / 50;
        many = many - fifty * 50;
        ten = many / 10;
        many = many - ten * 10;
        five = many / 5;
        many = many - five * 5;
        two = many / 2;
        many = many - two * 2;
        one = many / 1;
        System.out.println("|5000 - " + fiveThousand + "| 1000 - " + oneThousend + "| 500 - " + fiveHundred + "| 100 - " + hundred + "| 50 - " + fifty + "| 10 - " + ten + "| 5 - " + five + "| 2 - " + two + "| 1 - " + one);

    }
}