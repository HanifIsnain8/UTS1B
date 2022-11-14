
import java.util.Random;
import java.util.Scanner;

public class JawabanUTS {

    int jmlprodi = 3;
    static int totaljmlmaba = 1050;
    public static String[] Tinformatika = new String[500];
    public static String[] DKV = new String[300];
    public static String[] Tkom = new String[250];

    public static void Printinfoprodi() {
        int totalTinformatika = 0;
        int totalsisakuota = 0;
        for (int index = 0; index < Tinformatika.length; index++) {
            if (Tinformatika[index] != null) {
                totalTinformatika++;
            }
        }
        int totalDKV = 0;
        for (int index = 0; index < DKV.length; index++) {
            if (DKV[index] != null) {
                totalDKV++;
            }
        }
        int totalTkom =0;
        for (int index=0;index<Tkom.length;index++){
            if (Tkom[index] != null){
                totalTkom++;
            }
        }
        totalsisakuota = totaljmlmaba - totalTinformatika - totalTkom - totalDKV;
        System.out.println("Total  Mahasiswa Baru Prodi Teknik Informatika :" + totalTinformatika + "" + "| Total Mahasiswa baru Prodi DKV :" + totalDKV + "| Total Mahasiswa Baru Teknik Komputer :" + totalTkom);
        System.out.println("Jumlah Seluruh Mahasiwa Baru :" + totaljmlmaba + "| Total Sisa Kuota :" + totalsisakuota);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String maba){
        int indexNow=0;
        for (int index=0; index<myArray.length; index++) {
            if (myArray[index] != null) {
                indexNow = index + 1;
            }
        }
        if (indexNow < myArray.length){
            myArray[indexNow] = maba;
        }
    }
    public static void simpanmaba(int angkaRandom, String maba) {
        switch (angkaRandom){
            case 1:
                CheckIndexArray (Tinformatika,maba);
                System.out.println("NIM Anda Adalah TI22" );
                Printinfoprodi();
                break;
            case 2:
                CheckIndexArray(DKV,maba);
                System.out.println("NIM Anda Adalah DK22");
                Printinfoprodi();
                break;
            case 3:
                CheckIndexArray(Tkom,maba);
                System.out.println("NIM Anda Adalah TK22");
                Printinfoprodi();
                break;
        }
    }
    public static void inputmaba() {
        Scanner inputData = new Scanner(System.in);
        while (true) {
            System.out.print("Nama Mahasiswa Baru = ");
            String namamaba = inputData.nextLine();
            System.out.print("Program Studi Yang Di Pilih =");
            String Prodi = inputData.nextLine();
            if (namamaba.isBlank()) {
                System.out.println("Program Studi Wajib Di Isi");
                inputmaba();
            } else {
                Random hasilRandom = new Random();
                int NimRandom = hasilRandom.nextInt(3)+1;
                simpanmaba(NimRandom, namamaba);
            }
        }
    }
    public static void main(String[] args) {
        inputmaba();
    }
}



