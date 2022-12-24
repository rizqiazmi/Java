package CRUD;

import java.io.*;
import java.time.*;
import java.util.*;
import javax.swing.GrayFilter;

public class Operasi {
    
    public static void updateData() throws IOException{
        // mengambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);


        // membuat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // menampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan diupdate: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin di upadate

        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null){
            entryCounts++;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan entrycounts == update
            if (updateNum == entryCounts){
                System.out.println("\nData yang ingin anda update adalah: ");
                System.out.println("=======================================");
                System.out.println("Referensi   : " + st.nextToken());
                System.out.println("Tahun       : " + st.nextToken());
                System.out.println("Penulis     : " + st.nextToken());
                System.out.println("Penerbit    : " + st.nextToken());
                System.out.println("Judul       : " + st.nextToken());

                // update data

                // mengambil input dari user
                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];

                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();

                for (int i = 0; i < fieldData.length; i++){
                    boolean isUpdate = Utility.getYesorNo("apakah anda ingin merubah " + fieldData[i]);
                    originalData = st.nextToken();
                    if (isUpdate){

                        // user input
                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("masukan tahun terbit, format=(YYYY): ");
                            tempData[i] = Utility.ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine();
                        }

                    } else {
                        tempData[i] = originalData;
                    }
                }

                // tampilkan data baru ke layar
                System.out.println("\nData baru anda adalah: ");
                System.out.println("=======================================");
                st = new StringTokenizer(data,",");
                st.nextToken();
                System.out.println("Tahun       : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis     : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit    : " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul       : " + st.nextToken() + " --> " + tempData[3]);

                boolean isUpdate = Utility.getYesorNo("Apakah anda yakin ingin mengupdate data tersebut");

                if (isUpdate){

                // cek data baru di database
                boolean isExist = Utility.cekBukuDiDatabase(tempData,false);

                if (isExist) {
                    System.err.println("data buku sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                } else {

                    // format data baru kedalam database
                    String tahun = tempData[0];
                    String penulis = tempData[1];
                    String penerbit = tempData[2];
                    String judul = tempData[3];


                // membuat primary key
                long nomorEntry = Utility.ambilEntryPerTahun(penulis, tahun) + 1;

                String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
                String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                // tulis data ke database
                bufferedOutput.write(primaryKey + "," + tahun + ","+ penulis +"," + penerbit + ","+judul);
                   
            }
            } else {
                // copy data
                bufferedOutput.write(data);

            }
        } else {
            // copy data
            bufferedOutput.write(data);

        }
        bufferedOutput.newLine();
        data = bufferedInput.readLine();
    }
        bufferedOutput.flush();

        // tutup filenya
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        
        // menjalankan method
        System.gc();

        // delete file
        java.nio.file.Files.delete(database.toPath());

        // rename file ermpDb menjadi database
        tempDB.renameTo(database);
    }

    public static void deleteData() throws IOException {
        // ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // membuat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan didelete
        boolean isFound = false;
        int entryCounts = 0;
        
        String data = bufferedInput.readLine();

        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data,",");
            // tampilkan data yang ingin dihapus
            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin anda hapus adalah: ");
                System.out.println("====================================");
                System.out.println("Referensi   : " + st.nextToken());
                System.out.println("Tahun       : " + st.nextToken());
                System.out.println("Penulis     : " + st.nextToken());
                System.out.println("Penerbit    : " + st.nextToken());
                System.out.println("Judul       : " + st.nextToken());

                isDelete = Utility.getYesorNo("Apakah anda yakin akan mengpaus");
                isFound = true;

            }

            if(isDelete){
                // skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();

        }

        if(!isFound){
            System.err.println("Buku tidak ditemukan");
        }
        // menulis data ke file
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        // menjalankan method
        System.gc();
        
        // delete original file
        java.nio.file.Files.delete(database.toPath());

        // rename file sementara ke database
        tempDB.renameTo(database);

    }

    public static void tampilkanData() throws IOException {
        
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis              |\tPenerbit   |\tJudul Buku");
        System.out.println("======================================================================");
        
        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null) {     
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data,",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ",stringToken.nextToken());
            System.out.printf("|\t%-20s ",stringToken.nextToken());
            System.out.printf("|\t%-10s ",stringToken.nextToken());
            System.out.printf("|\t%s ",stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println("======================================================================");

    }

    public static void cariData() throws IOException{

        // membaca database ada tau tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            cariData();
            return;
        }

        // kita ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("masukan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // kita cek keyword database
        Utility.cekBukuDiDatabase(keywords,true);
    }

    public static void tambahData() throws IOException {

        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("masukkan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("masukan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("masukan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("masukan tahun terbit, format=(YYYY): ");
        tahun = Utility.ambilTahun();

        // cek buku di database 
        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = Utility.cekBukuDiDatabase(keywords,false);
        
        // menulis buku di database
        if (!isExist){
        // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
        System.out.println(Utility.ambilEntryPerTahun(penulis, tahun) + 1);
        long nomorEntry = Utility.ambilEntryPerTahun(penulis, tahun) + 1;

        String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
        String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
        System.out.println("\nData yang anda masukan adalah");
        System.out.println("=================================");
        System.out.println("primaryKey     : " + primaryKey);
        System.out.println("tahun terbit   : " + tahun);
        System.out.println("penulis        : " + penulis);
        System.out.println("judul          : " + judul);
        System.out.println("penerbit       : " + penerbit);
        
        boolean isTambah = Utility.getYesorNo("Apakah anda ingin menambah data tersebut? ");

        if(isTambah) {
            bufferOutput.write(primaryKey + "," + tahun + ","+ penulis +"," + penerbit + ","+judul);
            bufferOutput.newLine();
            bufferOutput.flush();
        }

        } else {
            System.out.println("buku yang anda akan masukan sudah tersedia di database dengan data berikut:");
            Utility.cekBukuDiDatabase(keywords,true);
        }

        bufferOutput.close();
    }

}