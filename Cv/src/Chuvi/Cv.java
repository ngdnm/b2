package Chuvi;
import java.util.Scanner;
class cv {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Nhap ban kinh duong tron: ");
        double radius = sc.nextDouble();
        double circumference= Math.PI * 2*radius;
        System.out.print("Chu vi hinh tron la:" +circumference) ;
    }
}
    