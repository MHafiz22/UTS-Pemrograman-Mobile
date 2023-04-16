package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeList = listOf<NovelClass>(
            NovelClass(
                R.drawable.novel1,
                novelname = "Harry Potter and the Sorcerer's Stone",
                noveldate = "Tanggal Terbit: \n26 Juni 1997",
                novelauthor = "Pengarang: \nJ.K. Rowling",
                novelrate = "Rating: (4,5)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nKisah ini dimulai dengan cerita tentang seorang anak yatim piatu bernama Harry Potter, yang tinggal bersama keluarga bibinya yang kejam dan tidak menyukainya. Pada ulang tahun kesebelasnya, Harry menemukan bahwa ia sebenarnya adalah seorang penyihir dan dia diundang untuk belajar di Hogwarts School of Witchcraft and Wizardry.\n" +
                        "\nDi Hogwarts, Harry berteman dengan Ron Weasley dan Hermione Granger, dan bersama-sama mereka mengeksplorasi dunia sihir dan menghadapi bahaya yang menantang, termasuk mengungkap misteri tentang \"The Sorcerer's Stone\" atau \"Batu Bertuah\". Batu tersebut merupakan artefak yang paling diinginkan oleh penyihir jahat bernama Voldemort, yang berusaha untuk kembali ke kekuatan penuh dengan cara apa pun.\n" +
                        "\nNovel ini penuh dengan petualangan seru dan aksi magis yang menarik, serta menghadirkan dunia sihir yang fantastis yang memikat pembaca dari awal hingga akhir. Harry Potter and the Sorcerer's Stone menjadi awal dari kisah seru Harry Potter yang legendaris dan diikuti oleh jutaan pembaca di seluruh dunia."
            ),
            NovelClass(
                R.drawable.novel2,
                novelname = "Harry Potter and the Chamber of Secrets",
                noveldate = "Tanggal Terbit: \n02 Juli 1998",
                novelauthor = "Pengarang: \nJ.K. Rowling",
                novelrate = "Rating: (4,4)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nDi awal cerita, Harry kembali ke Hogwarts untuk tahun ajaran keduanya. Namun, sekolah ini terancam bahaya ketika terjadi serangkaian serangan misterius yang menargetkan siswa yang tidak berdarah murni. Harry sendiri juga menjadi korban ketika terkena sihir yang membuatnya membesar dan merusak ruang kelas.\n" +
                        "\nBersama dengan teman-temannya, Ron dan Hermione, Harry mulai menyelidiki serangan-serangan tersebut dan menemukan adanya \"Chamber of Secrets\", sebuah ruangan rahasia di dalam Hogwarts yang dipercayai menjadi asal muasal serangan-serangan tersebut. Mereka juga menemukan bahwa seseorang atau sesuatu yang tidak diketahui telah membebaskan ular raksasa yang berada di dalam ruangan tersebut, dan hanya Harry yang dapat menghentikannya.\n" +
                        "\nDalam perjalanan mereka untuk menyelesaikan misteri ini, Harry dan teman-temannya mengalami berbagai macam petualangan dan menghadapi bahaya yang semakin besar. Mereka juga bertemu dengan beberapa karakter baru yang memainkan peran penting dalam cerita."
            ),
            NovelClass(
                R.drawable.novel3,
                novelname = "Harry Potter and the Prisoner of Azkaban",
                noveldate = "Tanggal Terbit: \n08 Juli 1999",
                novelauthor = "Pengarang: \nJ.K. Rowling",
                novelrate = "Rating: (4,6)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nDi awal cerita, Harry mengetahui bahwa seorang tahanan yang kabur dari penjara ajaib Azkaban, seorang penyihir bernama Sirius Black, dikabarkan berada dalam pencarian untuk membunuhnya. Harry menjadi semakin khawatir ketika ia mengetahui bahwa Sirius Black adalah orang yang dianggap bertanggung jawab atas kematian orang tuanya.\n" +
                        "\nSementara itu, di Hogwarts, Harry dan teman-temannya mempelajari teknik sihir baru dan menemukan adanya makhluk misterius yang disebut \"Dementor\" yang digunakan untuk menjaga penjara Azkaban. Dementor diketahui dapat menghisap kebahagiaan seseorang dan meninggalkan seseorang dalam keadaan putus asa dan depresi.\n" +
                        "\nDalam upaya untuk melindungi dirinya sendiri dan orang yang dicintainya, Harry berusaha untuk menemukan kebenaran tentang Sirius Black dan mencari cara untuk menghadapi Dementor. Di sisi lain, Hermione memulai kampanye untuk membebaskan seorang \"Hippogriff\" bernama Buckbeak yang dianggap bertanggung jawab atas serangan pada seorang siswa."
            ),
            NovelClass(
                R.drawable.novel4,
                novelname = "Harry Potter and the Goblet of Fire",
                noveldate = "Tanggal Terbit: \n08 Juli 2000",
                novelauthor = "Pengarang: \nJ.K. Rowling",
                novelrate = "Rating: (4,5)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nDalam novel ini, Hogwarts menjadi tuan rumah dari Turnamen Triwizard, sebuah kompetisi sihir yang diadakan antara tiga sekolah sihir terkemuka di Eropa. Namun, ketika Piala Api memilih empat peserta untuk berpartisipasi dalam turnamen, termasuk Harry, hal itu menimbulkan kecurigaan karena seharusnya hanya ada tiga peserta.\n" +
                        "\nKetika Harry mulai mempersiapkan dirinya untuk bertanding, ia menyadari bahwa kekuatan jahat yang berbahaya sedang bangkit kembali di dunia sihir. Dan ketika peserta mulai menghadapi bahaya dan rintangan yang mematikan, Harry menemukan dirinya menjadi sasaran serangan dari kekuatan jahat tersebut.\n" +
                        "\nSelama Turnamen Triwizard, Harry menemukan adanya sebuah konspirasi yang mengancam keamanan Hogwarts dan dunia sihir secara keseluruhan. Dalam upaya untuk mengungkapkan kebenaran di balik serangkaian insiden yang terjadi, Harry harus menghadapi tantangan yang semakin berbahaya dan menguji keterampilan sihirnya."
            ),
            NovelClass(
                R.drawable.novel5,
                novelname = "Harry Potter and the Order of the Phoenix",
                noveldate = "Tanggal Terbit: \n27 Juni 2003",
                novelauthor = "Pengarang: \nJ.K. Rowling",
                novelrate = "Rating: (4,5)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nDi awal cerita, Harry merasa sangat kesepian dan terasing di musim panasnya setelah insiden dengan Cedric Diggory di Turnamen Triwizard. Harry merasa lebih buruk lagi ketika ia dihadapkan dengan Dementor yang mencoba menyerangnya di Muggle (manusia biasa) London.\n" +
                        "\nKembali di Hogwarts, Harry menemukan bahwa banyak siswa dan bahkan beberapa guru tidak percaya bahwa ia mengalami serangan Dementor. Selain itu, Harry menghadapi keengganan dari Kementerian Sihir untuk mengakui bahwa Voldemort telah kembali, dan bahkan beberapa orang dari kalangan sihir juga tidak percaya bahwa kekuatan jahat tersebut kembali bangkit.\n" +
                        "\nKetika Hogwarts berada dalam bahaya dan Harry merasa tidak bisa bergantung pada siapapun, ia bersama teman-temannya membentuk kelompok rahasia bernama \"The Order of the Phoenix\" untuk melawan kekuatan jahat yang kembali bangkit. Mereka berjuang untuk mengumpulkan bukti bahwa Voldemort telah kembali dan siap melancarkan serangan besar-besaran, sementara di sisi lain, Harry mempersiapkan dirinya untuk menghadapi penghianatan dan intrik yang lebih besar dari yang pernah ia alami sebelumnya."
            ),
            NovelClass(
                R.drawable.novel6,
                novelname = "Harry Potter and the Half-Blood Prince",
                noveldate = "Tanggal Terbit: \n16 Juli 2005",
                novelauthor = "Pengarang: \nJ.K. Rowling",
                novelrate = "Rating: (4,6)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nDalam novel ini, Harry kembali ke Hogwarts untuk tahun ajaran keenam dan belajar bahwa Dumbledore telah memilihnya sebagai murid pribadi untuk membantunya dalam mencari informasi tentang masa lalu Voldemort. Selain itu, Harry menemukan sebuah buku yang memungkinkannya untuk menjadi lebih terampil dalam sihir dan mengungkap rahasia tentang masa lalu kepala sekolah Hogwarts yang misterius, Profesor Snape.\n" +
                        "\nNamun, di balik kehidupan yang tampak tenang di Hogwarts, kekuatan jahat sedang merencanakan serangan yang lebih besar dari sebelumnya, dan Harry merasa semakin terancam. Selain itu, Harry menemukan bahwa Draco Malfoy, murid Hogwarts yang selalu menjadi saingannya, sedang merencanakan sesuatu yang buruk, dan Harry merasa bertanggung jawab untuk menghentikannya.\n" +
                        "\nSeiring tahun ajaran berlangsung, Harry menemukan dirinya semakin terlibat dalam persiapan perang yang akan datang dan menemukan rahasia yang mengubah hidupnya selamanya. Dalam upaya untuk melawan kekuatan jahat yang kembali bangkit, Harry dan teman-temannya berjuang untuk melindungi Hogwarts dan dunia sihir secara keseluruhan."
            ),
            NovelClass(
                R.drawable.novel7,
                novelname = "Harry Potter and the Deathly Hallows",
                noveldate = "Tanggal Terbit: \n14 Juli 2007",
                novelauthor = "Pengarang: \nJ.K. Rowling",
                novelrate = "Rating: (4,6)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nDalam novel ini, Harry dan teman-temannya Ron dan Hermione berusaha mencari Horcrux - benda yang berisi sebagian jiwa Voldemort dan harus dihancurkan agar Voldemort bisa dihentikan. Namun, tugas tersebut semakin sulit ketika Hogwarts jatuh ke tangan Voldemort dan mereka harus melanjutkan pencarian mereka di luar lingkungan yang aman.\n" +
                        "\nHarry menyadari bahwa ia harus menyelesaikan tugasnya sendiri dan berjuang untuk melindungi orang yang dicintainya dari Voldemort dan pengikutnya. Harry menemukan keberanian yang lebih besar dari sebelumnya, dan ia tahu bahwa ia harus menghadapi Voldemort secara langsung untuk mengakhiri kekuatan jahat tersebut.\n" +
                        "\nDi tengah-tengah perjalanan mereka, Harry menemukan petunjuk-petunjuk tentang sebuah legenda kuno yang menceritakan tiga artefak yang dikenal sebagai Deathly Hallows, dan ketika ia menyadari kekuatan yang ada di dalamnya, ia menyadari bahwa pilihan yang sulit harus dibuat dan keselamatan semua orang bergantung padanya."
            ),
            NovelClass(
                R.drawable.novel8,
                novelname = "The Song of Achilles",
                noveldate = "Tanggal Terbit: \n05 September 2011",
                novelauthor = "Pengarang: \nMadeline Miller",
                novelrate = "Rating: (4,3)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nCerita dimulai dengan Patroclus, seorang pangeran muda yang diasingkan dari rumahnya setelah tindakan impulsifnya membunuh seorang anak. Ia dikirim ke istana Peleus, raja Fthia, untuk hidup sebagai tamu. Di sana ia bertemu dengan putra Peleus, Achilles, seorang pemuda yang akan menjadi prajurit terhebat dalam sejarah Yunani. Meskipun keduanya memiliki karakter dan bakat yang berbeda, mereka cepat menjadi sahabat dekat.\n" +
                        "\nKetika Perang Troya pecah, Achilles dipanggil untuk bergabung dalam peperangan sebagai prajurit terbaik Fthia. Patroclus, yang telah menjadi pasangan hidupnya, juga pergi bersamanya sebagai sahabat dan pendukungnya. Di tengah-tengah peperangan yang kejam dan berdarah, mereka berjuang untuk mencapai tujuan mereka sambil menjaga hubungan mereka tetap kokoh.\n" +
                        "\nNamun, takdir selalu bermain dengan cara yang tak terduga. Sebuah peristiwa tragis menguji cinta mereka dan memaksa mereka untuk membuat pilihan sulit yang akan mengubah hidup mereka selamanya."
            ),
            NovelClass(
                R.drawable.novel9,
                novelname = "Charlie and The Chocolate Factory",
                noveldate = "Tanggal Terbit: \n17 Januari 1964",
                novelauthor = "Pengarang: \nRoald Dahl",
                novelrate = "Rating: (4,1)",
                ratingbar = 4.0,
                noveldesc = "Sinopsis: \nWilly Wonka adalah seorang ahli pembuat cokelat dan pemilik pabrik cokelat terbesar di dunia. Namun, pabriknya selama beberapa tahun telah ditutup untuk umum dan tidak ada yang tahu mengapa. Akhirnya, Wonka mengadakan undian di seluruh dunia, yang memberikan lima anak keberuntungan kesempatan untuk mengunjungi pabrik cokelatnya yang legendaris.\n" +
                        "\nCharlie sangat senang ketika dia menemukan tiket emas di dalam bungkus cokelatnya yang murah, dan menjadi salah satu dari lima anak yang beruntung tersebut. Ia pergi bersama dengan kakek-neneknya ke dalam pabrik cokelat Wonka, dan di sana mereka menemukan dunia yang luar biasa dan ajaib.\n" +
                        "\nNamun, tidak seperti anak-anak lain yang tidak bisa mengendalikan diri mereka, Charlie selalu berperilaku sopan dan santun. Ia sangat terkesan dengan pabrik dan menjadi teman baik dengan Willy Wonka. Tapi ketika anak-anak lain mulai berperilaku buruk, satu per satu mereka menghilang dan hanya Charlie yang tersisa."
            ),
            NovelClass(
                R.drawable.novel10,
                novelname = "Divergent",
                noveldate = "Tanggal Terbit: \n26 April 2011",
                novelauthor = "Pengarang: \nVeronica Roth",
                novelrate = "Rating: (4,2)",
                ratingbar = 4.0,
                noveldesc = "Sinopsis: \nCerita ini berpusat pada tokoh utama bernama Tris Prior, seorang gadis berusia enam belas tahun yang dilahirkan ke dalam fraksi Kebenaran, tetapi pada saat pengujian, hasilnya menunjukkan bahwa ia tidak dapat dicocokkan dengan satu fraksi saja. Tris adalah seorang Divergent, yang sangat berbahaya bagi pemerintah yang berkuasa.\n" +
                        "\nSetelah memilih untuk bergabung dengan fraksi Ketangguhan, Tris harus berjuang untuk bertahan hidup dan menemukan tempatnya di tengah-tengah persaingan yang intens dan kekerasan yang meningkat. Selama proses inisiasi fraksi, Tris membangun hubungan dengan Four, seorang pria misterius dan kuat, yang kemudian menjadi teman dan kekasihnya.\n" +
                        "\nNamun, ketika pemerintah fraksi mengambil tindakan yang semakin brutal dan kekerasan semakin meningkat, Tris dan Four harus memutuskan apakah mereka akan berdiri dan melawan atau melarikan diri. Mereka menemukan bahwa ada kekuatan yang lebih besar yang bekerja di balik tindakan pemerintah, dan mereka harus menghadapi musuh yang sangat kuat dan berbahaya untuk membela hak-hak mereka dan kebebasan mereka."
            ),
            NovelClass(
                R.drawable.novel11,
                novelname = "Rule of Wolves",
                noveldate = "Tanggal Terbit: \n30 Maret 2021",
                novelauthor = "Pengarang: \nLeigh Bardugo",
                novelrate = "Rating: (4,3)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nSetelah mengalami trauma di masa lalu dan menjalani pengobatan untuk mengontrol monster dalam dirinya, Nikolai harus mencari cara untuk menggabungkan kedua sisi kekuatannya, baik sebagai manusia maupun monster, untuk melawan ancaman yang semakin mendekat.\n" +
                        "\nDi sisi lain, Zoya Nazyalensky, Grisha yang kuat dan mantan jenderal, juga sedang berjuang dengan masa lalunya sendiri dan mencoba untuk memperbaiki hubungannya dengan Nikolai, yang pernah menjadi musuhnya.\n" +
                        "\nKetika Ravka dihadapkan pada ancaman serius dari musuh lama, Nikolai dan Zoya harus berjuang untuk melindungi negara mereka dan mengalahkan musuh mereka dengan memanfaatkan semua kekuatan mereka, baik manusia maupun Grisha. Namun, mereka juga harus menghadapi konspirasi dan pengkhianatan yang mengancam untuk menghancurkan segalanya."
            ),
            NovelClass(
                R.drawable.novel12,
                novelname = "The Lost Hero – The Heroes Of Olympus",
                noveldate = "Tanggal Terbit: \n12 Oktober 2010",
                novelauthor = "Pengarang: \nRick Riordan",
                novelrate = "Rating: (4,3)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nJason, yang kehilangan ingatannya, terbangun di tempat yang tidak dikenal dan menemukan bahwa dia adalah seorang demigod, keturunan dewa Yunani. Dia bergabung dengan Piper, seorang demigod dari klan Cherokee yang memiliki kemampuan memikat, dan Leo, seorang demigod yang sangat terampil dalam merakit mesin, untuk melakukan misi penyelamatan yang penuh bahaya.\n" +
                        "\nDalam perjalanan mereka, ketiga demigod ini harus menghadapi berbagai rintangan dan bahaya, termasuk pertarungan dengan para monster dan dewa-dewa jahat. Mereka juga menemukan bahwa misi mereka ternyata terkait dengan ramalan kuno yang memprediksi kedatangan seorang pahlawan yang akan menyelamatkan dunia dari malapetaka."
            ),
            NovelClass(
                R.drawable.novel13,
                novelname = "Six of Crows",
                noveldate = "Tanggal Terbit: \n29 September 2015",
                novelauthor = "Pengarang: \nLeigh Bardugo",
                novelrate = "Rating: (4,5)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nKaz Brekker, seorang pemimpin kelompok, menerima tawaran pekerjaan yang tak terlalu mudah yaitu mencuri seorang ilmuwan yang menciptakan formula ajaib yang dapat memberikan kekuatan ekstra pada seseorang. Tugas tersebut sulit dan berbahaya, tetapi potensi hadiahnya sangat besar. Kaz dan timnya mulai merencanakan pencurian tersebut dan menyusun strategi untuk melaksanakannya.\n" +
                        "\nSelama pencurian, mereka dihadapkan dengan banyak rintangan, termasuk perang dengan geng saingan dan kekhawatiran untuk masing-masing anggota tim yang bisa mengganggu jalannya misi. Namun, Kaz dan timnya tidak akan menyerah dan akan melakukan segala cara untuk mencapai tujuan mereka."
            ),
            NovelClass(
                R.drawable.novel14,
                novelname = "Crooked Kingdom",
                noveldate = "Tanggal Terbit: \n20 September 2016",
                novelauthor = "Pengarang: \nLeigh Bardugo",
                novelrate = "Rating: (4,6)",
                ratingbar = 4.5,
                noveldesc = "Sinopsis: \nSetelah berhasil melakukan pencurian besar-besaran di novel pertama, \"Six of Crows\", kelompok ini sekarang terjebak dalam situasi yang semakin berbahaya. Salah satu anggota mereka telah diculik, dan mereka harus menemukan cara untuk menyelamatkannya sambil menghadapi kekuatan jahat yang lebih besar dari sebelumnya.\n" +
                        "\nNamun, selama pencarian mereka, kelompok tersebut menemukan bahwa ada rencana besar yang sedang direncanakan oleh musuh terbesar mereka, yang akan mengancam tidak hanya mereka, tetapi juga seluruh kota Ketterdam. Kelompok penjahat ini harus mengatasi perbedaan-perbedaan mereka dan bekerja sama untuk mengalahkan musuh mereka dan melindungi kota mereka."
            ),
            NovelClass(
                R.drawable.novel15,
                novelname = "Curiosity House: The Shrunken Head",
                noveldate = "Tanggal Terbit: \n29 September 2015",
                novelauthor = "Pengarang: \nLauren Oliver & H.C. Chester",
                novelrate = "Rating: (3,9)",
                ratingbar = 4.0,
                noveldesc = "Sinopsis:\nSuatu hari, salah satu atraksi utama sirkus, kepala suku dari kepala yang dikecilkan, dicuri dari ruang pameran. Empat anak yatim piatu tersebut terlibat dalam pencarian kepala suku yang dicuri dan menemukan bahwa mereka terjebak dalam teka-teki yang lebih besar dan lebih berbahaya. Mereka menemukan bukti bahwa ada seseorang yang ingin menghancurkan Curiosity House dan semua yang di dalamnya.\n" +
                        "\nDalam pencariannya, keempat anak yatim piatu tersebut harus menghadapi berbagai rintangan dan bahaya, termasuk teka-teki yang rumit dan musuh yang kuat. Namun, mereka bertekad untuk mengungkap rahasia di balik kepala suku yang dicuri dan menyelamatkan rumah mereka dari kehancuran."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NovelAdapter(this, animeList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}