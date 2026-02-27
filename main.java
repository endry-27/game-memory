import java.util.Scanner;
import java.sql.Array;
import java.util.Random;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
 
        ArrayList<String> majorArcanapast = new ArrayList<>();
        ArrayList<String> majorArcanapresent = new ArrayList<>();
        ArrayList<String> majorArcanafuture = new ArrayList<>();
        ArrayList<String> NAMAARCANA = new ArrayList<>();
        
        
       
      // NAMA ARCANA
        NAMAARCANA.add("THE FOOL");
        NAMAARCANA.add("THE MAGICIAN");
        NAMAARCANA.add("THE HIGH PRIESTESS");
        NAMAARCANA.add("THE EMPRESS");
        NAMAARCANA.add("THE EMPEROR");
        NAMAARCANA.add("THE HIEROPHANT");
        NAMAARCANA.add("THE LOVERS");
        NAMAARCANA.add("THE CHARIOT");
        NAMAARCANA.add("STRENGTH");
        NAMAARCANA.add("THE HERMIT");
        NAMAARCANA.add("WHEEL OF FORTUNE");
        NAMAARCANA.add("JUSTICE");
        NAMAARCANA.add("THE HANGED MAN");
        NAMAARCANA.add("DEATH");
        NAMAARCANA.add("TEMPERANCE");
        NAMAARCANA.add("THE DEVIL");
        NAMAARCANA.add("THE TOWER");
        NAMAARCANA.add("THE STAR");
        NAMAARCANA.add("THE MOON");
        NAMAARCANA.add("THE SUN");
        NAMAARCANA.add("JUDGEMENT");
        NAMAARCANA.add("THE WORLD");
            
        // PAST CARD
        majorArcanapast.add("kepolosanmu saat memulai tanpa rasa takut"); // THE FOOL
        majorArcanapast.add("saat kamu menyadari semua alat sudah ada di tanganmu"); // THE MAGICIAN
        majorArcanapast.add("rahasia batin yang selama ini kamu simpan sendiri"); // THE HIGH PRIESTESS
        majorArcanapast.add("kenyamanan hangat yang pernah memeluk hari-harimu"); // THE EMPRESS
        majorArcanapast.add("kedisiplinan keras yang membentuk dirimu yang sekarang"); // THE EMPEROR
        majorArcanapast.add("suara bijak yang dulu menuntun setiap keputusanmu"); // THE HIEROPHANT
        majorArcanapast.add("janji setia yang pernah mengikat dua dunia"); // THE LOVERS
        majorArcanapast.add("ambisi besar yang memaksamu terus berlari"); // THE CHARIOT
        majorArcanapast.add("keberanianmu menghadapi ketakutan terbesar dalam diri"); // STRENGTH
        majorArcanapast.add("malam-malam sepi saat kamu hanya bicara dengan diri sendiri"); // THE HERMIT
        majorArcanapast.add("saat nasib memaksamu berputar ke arah yang tak diduga"); // WHEEL OF FORTUNE
        majorArcanapast.add("kebenaran pahit yang akhirnya harus kamu akui"); // JUSTICE
        majorArcanapast.add("saat kamu memilih berhenti dan merelakan segalanya"); // THE HANGED MAN
        majorArcanapast.add("gugurnya masa lalu yang memberi ruang untuk napas baru"); // DEATH
        majorArcanapast.add("perlahan-lahan kamu belajar menyatukan kepingan yang pecah"); // TEMPERANCE
        majorArcanapast.add("belenggu nafsu yang sempat membuatmu kehilangan arah"); // THE DEVIL
        majorArcanapast.add("goncangan hebat yang meruntuhkan istana ilusimu"); // THE TOWER
        majorArcanapast.add("doa-doa tulus yang kamu panjatkan di tengah kegelapan"); // THE STAR
        majorArcanapast.add("keraguan yang sempat membuatmu tersesat dalam mimpi"); // THE MOON
        majorArcanapast.add("puncak kebahagiaan yang pernah menyinari duniamu"); // THE SUN
        majorArcanapast.add("panggilan jiwa yang akhirnya memintamu untuk bangun"); // JUDGEMENT
        majorArcanapast.add("akhir sebuah perjalanan yang membuatmu merasa utuh"); // THE WORLD

        // PRESENT CARD 
        majorArcanapresent.add("langkah berani di tepi jurang ketidaktahuan"); // THE FOOL
        majorArcanapresent.add("kemampuanmu yang sedang memuncak untuk mencipta"); // THE MAGICIAN
        majorArcanapresent.add("hening yang sedang membisikkan jawaban terjujur"); // THE HIGH PRIESTESS
        majorArcanapresent.add("proses pembuahan ide yang kian subur dan nyata"); // THE EMPRESS
        majorArcanapresent.add("tanggung jawab besar yang kini menguji ketegasanmu"); // THE EMPEROR
        majorArcanapresent.add("pencarian nilai di balik struktur yang mengekang"); // THE HIEROPHANT
        majorArcanapresent.add("pilihan hati yang sedang menuntut komitmen penuh"); // THE LOVERS
        majorArcanapresent.add("kendali keras yang kau pegang di tengah laju hidup"); // THE CHARIOT
        majorArcanapresent.add("kelembutan batin yang sedang menjinakkan amarah"); // STRENGTH
        majorArcanapresent.add("dialog sunyi dengan diri di tengah bisingnya dunia"); // THE HERMIT
        majorArcanapresent.add("pusaran takdir yang sedang memutar arah hidupmu"); // WHEEL OF FORTUNE
        majorArcanapresent.add("timbangan batin yang sedang mencari titik tegak"); // JUSTICE
        majorArcanapresent.add("masa jeda untuk melihat dunia secara terbalik"); // THE HANGED MAN
        majorArcanapresent.add("proses melepas kulit lama yang mulai terasa sesak"); // DEATH
        majorArcanapresent.add("seni meracik harmoni di tengah kekacauan rasa"); // TEMPERANCE
        majorArcanapresent.add("jeratan candu atau bayang-bayang yang menggodamu"); // THE DEVIL
        majorArcanapresent.add("runtuhnya dinding ilusi yang memaksamu melihat nyata"); // THE TOWER
        majorArcanapresent.add("cahaya pemulihan yang perlahan menyentuh lukamu"); // THE STAR
        majorArcanapresent.add("kabut keraguan yang sedang menyelimuti pandangan"); // THE MOON
        majorArcanapresent.add("kejujuran murni yang sedang menerangi segalanya"); // THE SUN
        majorArcanapresent.add("gema panggilan jiwa yang memintamu segera bangun"); // JUDGEMENT
        majorArcanapresent.add("perasaan utuh di mana semua kepingan mulai menyatu"); // THE WORLD
        
        // FUTURE
        majorArcanafuture.add("pintu tak dikenal yang akan segera terbuka"); // THE FOOL
        majorArcanafuture.add("momen ketika semua rencana akan menjadi nyata"); // THE MAGICIAN
        majorArcanafuture.add("rahasia besar yang akan segera terungkap"); // THE HIGH PRIESTESS
        majorArcanafuture.add("musim panen atas segala yang kau tanam"); // THE EMPRESS
        majorArcanafuture.add("puncak otoritas yang akan kau genggam erat"); // THE EMPEROR
        majorArcanafuture.add("tuntunan bijak yang akan segera kau temukan"); // THE HIEROPHANT
        majorArcanafuture.add("pertemuan jiwa yang akan menguji ketulusanmu"); // THE LOVERS
        majorArcanafuture.add("kemenangan mutlak yang akan kau rebut"); // THE CHARIOT
        majorArcanafuture.add("kekuatan batin yang akan segera kau buktikan"); // STRENGTH
        majorArcanafuture.add("pencarian jawaban yang akan membawamu pulang"); // THE HERMIT
        majorArcanafuture.add("kejutan nasib yang akan mengubah garis hidupmu"); // WHEEL OF FORTUNE
        majorArcanafuture.add("keadilan yang akan segera menemukan jalannya"); // JUSTICE
        majorArcanafuture.add("sudut pandang baru yang akan membebaskanmu"); // THE HANGED MAN
        majorArcanafuture.add("perubahan besar yang akan melahirkan dirimu yang baru"); // DEATH
        majorArcanafuture.add("kedamaian murni yang akan segera kau rasakan"); // TEMPERANCE
        majorArcanafuture.add("godaan besar yang akan menguji kemandirianmu"); // THE DEVIL
        majorArcanafuture.add("guncangan mendadak yang akan membersihkan jalanmu"); // THE TOWER
        majorArcanafuture.add("bintang penuntun yang akan menghapus keraguanmu"); // THE STAR
        majorArcanafuture.add("petualangan di balik kabut yang penuh misteri"); // THE MOON
        majorArcanafuture.add("fajar kemenangan yang akan segera menyinari harimu"); // THE SUN
        majorArcanafuture.add("panggilan takdir yang takkan bisa kau abaikan"); // JUDGEMENT
        majorArcanafuture.add("pencapaian tertinggi yang akan melengkapi jiwamu"); // THE WORLD        
        Random r= new Random();
        ;
         
        int lihat=3;      
        System.out.println("selmat datang di ramalan tarot");
        System.out.println("Sekerang saya ada 21 kartu dan anda akan memilih 3 secara acak \n nah anda mau melihat \n1.masa depan\n2.masa kini\n3.masa lampau?");
    do{
 
        int pil = s.nextInt();
        
        switch (pil) {  
            case 1:
                int ran=r.nextInt(22);
                System.out.println("MASA LALU MU MENGATAKAN :");
                artitarot a= new artitarot(NAMAARCANA.get(ran),majorArcanapast.get(ran));
                a.showkartu();
                lihat--;
                
                break;
            case 2:
                int rran=r.nextInt(22);
                System.out.println("MASA KINI MU MENGATAKAN");
                artitarot b= new artitarot(NAMAARCANA.get(rran),majorArcanapresent.get(rran));
                b.showkartu();
                lihat--;
                
                break;
            case 3:
                int rrran=r.nextInt(22);
                System.out.println("MASA DEPAN MU MENGATAKAN");
                artitarot c= new artitarot(NAMAARCANA.get(rrran),majorArcanapast.get(rrran));
                c.showkartu();
                lihat--;

            default:
                break;
        }
            
    }while (lihat !=0); 
    System.out.println("HEHEHE BAGAIMANA ? SETERAH PADAMU UNTUK PERCAYA ATAU TIDAK");
        
   
  
    }
}
