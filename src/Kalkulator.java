import java.util.Scanner;

public class Kalkulator {
    private int angkaPertama;
    private int angkaKedua;
    private String operator;
    private int hasil;

    public void inputUser(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka pertama: ");
        angkaPertama = input.nextInt();

        System.out.print("Masukan operator +, -, %, /, *: ");
        operator  = input.next();

        System.out.print("Masukan angka kedua: ");
        angkaKedua = input.nextInt();
    }

    public void operasi(){
        switch (operator){
            case "+":
                hasil = angkaPertama + angkaKedua;
                System.out.printf("%d + %d = %d \n",angkaPertama,angkaKedua,hasil);
                break;
            case "-":
                hasil = angkaPertama - angkaKedua;
                System.out.printf("%d - %d = %d \n", angkaPertama, angkaKedua, hasil);
                break;
            case "*":
                hasil = angkaPertama * angkaKedua;
                System.out.printf("%d * %d = %d\n",angkaPertama, angkaKedua, hasil );
                break;
            case "/":
                hasil = angkaPertama / angkaKedua;
                System.out.printf("%d / %d = %d", angkaPertama, angkaKedua, hasil);
                break;
            case "%":
                hasil = angkaPertama % angkaKedua;
                System.out.println(hasil);
                break;
            default:
                System.out.println("Oops operator tidak ada, silahkan masukan kembali operator yang tersedia");
        }

    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.inputUser();
        kalkulator.operasi();
    }
}
