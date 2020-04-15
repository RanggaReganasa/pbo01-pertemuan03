package Percabangan;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai = 'D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs : \"Terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs : \"Kenapa ulun kada dapat A,pak ?\"");
                System.out.println("Dosen : \"#@$#\"");
                break;
            case 'C':
                System.out.println("Mhs : \"Ulun turun pul pak ae , tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs : \"hihihi ...\"");
                break;
            case 'D' :
                System.out.println("Mhs : \"Ulun turun pul pak ae, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Dosen : \"Memeriksa Berkas\"");
                System.out.println("Dosen : \"Menceleng -_-\"");
                System.out.println("Mhs : \"Kabur ...\"");
                break;
        }
    }
}
