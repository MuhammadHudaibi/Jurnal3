package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { SinglyLinked<Profile> linkedList = new SinglyLinked<>();
        Scanner input = new Scanner(System.in);
        String dataNip, dataNama, dataDivisi, opsi;
        int masukan=0;
        int hapusData=0;

        while(masukan!=4){
            System.out.println("Pilih Inputan:");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cek list anggota");
            System.out.println("4. Keluar");
            masukan=input.nextInt();

            if(masukan==1){
                System.out.println("Masukkan data anggota ");
                System.out.println("Masukan nip, nama dan divisi");
                dataNip=input.next();
                dataNama=input.next();
                dataDivisi=input.next();

                System.out.println("Tambahkan? (y/n))");
                opsi=input.next();
                if(opsi.equals("y")){
                    linkedList.insertAtFront(new Profile(dataNip, dataNama, dataDivisi));
                }
                if(opsi.equals("n")){
                    linkedList.insertAtBack(new Profile(dataNip, dataNama, dataDivisi));
                }
            }
            else if(masukan==2){
                System.out.println("Data Yang Akan Dihapus:");
                System.out.println("1. Data Pertama");
                System.out.println("2. Data Terakhir");
                hapusData=input.nextInt();
                if(hapusData==1){
                    linkedList.removeFromFront();
                    linkedList.print();
                }
                else if(hapusData==2){
                    linkedList.removeFromBack();
                    linkedList.print();
                }
            }
            else if(masukan==3) {
                linkedList.print();

            }
        }
    }
}