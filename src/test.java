import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Kiểm tra số nguyên tố");
        System.out.println("2. Kiểm tra số chẵn lẻ");
        System.out.println("3. Kiểm tra số chính phương");
        System.out.println("4. Thoát chương trình");

        System.out.println("Enter selection");
        int selection = sc.nextInt();

        switch (selection) {
            case 1: {
                do {
                    System.out.println("Enter number U wanna check?");
                    int number = sc.nextInt();

                    if (number < 2) {
                        System.out.printf("%f is not a Prime", number);
                    } else {
                        int i = 2;
                        boolean check = true;
                        while (i <= Math.sqrt(number)) {
                            if (number % i == 0) {
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check) {
                            System.out.println(number + " is a prime");
                        } else {
                            System.out.println(number + " is not a prime");
                        }
                    }
                } while (true);
            }
            case 2: {
                do {
                    System.out.println("Enter number U wanna check?");
                    int number = sc.nextInt();

                    if (number < 0) {
                        System.out.print(number + " is not a integer\n");
                    } else if (number % 2 == 0) {
                        System.out.print(number + " is even number\n");
                    } else {
                        System.out.print(number + " is odd number\n");
                    }
                } while (true);
            }
            case 3: {
                do {
                    System.out.println("Enter number");
                    double number = sc.nextDouble();
                    double num = Math.sqrt(number);
                    if (num - Math.floor(num) == 0) {
                        System.out.print(number + " Là số chính phương\n");
                    } else {
                        System.out.print(number + " Không là số chính phương\n");
                    }
                } while (true);
            }
            case 4: {
                break;
            }
        }
    }
}
