package com.example.budayasepakbola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_list.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.inggris,"Budaya Sepakbola di Inggris (kiblat sepakbola)","berkelakuan baik di negeri sendiri, tapi menggila di Eropa... ","Di Inggris, kebab dan kentang goreng ditambah bir setengah liter sebelum ke stadion sudah cukup. " +
                " pergi ke bar, menyaksikan pertandingan, kembali ke bar.  " +
                "berkelakuan baik di negeri sendiri, tapi menggila di Eropa. Di Inggris, penonton duduk di bangku stadion. Di Inggris, petugas keamanan memperhatikan ulah penonton."))

        data?.add(DataModel(R.drawable.italia,"Budaya Sepakbola di Italia (Golden era of football)","Hanya di Italia, kami terpaku kepada formasi, Sepak bola modern telah berubah...", " Hanya di Italia, kami terpaku kepada formasi," +
                " Sepak bola modern telah berubah dan anda harus bisa mengikuti perkembangan waktu, para suporter mempunyai jadwal rutin stadion. pasta dan segelas red wine adalah hidangan tepat sebelum pertandingan. " +
                "Di Italia, bangku stadion bisa dijadikan senjata. petugas keamanan menyaksikan pertandingan tapi merangkap sebagai Ultras."))

        data?.add(DataModel(R.drawable.spanyol,"Budaya Sepakbola di Spanyol (Sepakbola yang indah nan selaras)","sepak bola adalah jendela untuk memahami kebudayaan lokal, termasuk hasrat separatisme, persaingan gender, hingga tradisi ... ", "sepak bola adalah jendela untuk memahami kebudayaan  " +
                " termasuk hasrat separatisme, persaingan gender, hingga tradisi kuliner. Sepak bola memang kerap terpaut dengan politik. Ada banyak contohnya. Di Austria, klub Hakoah bergerilya sebagai duta propaganda Yahudi di Eropa. Di Skotlandia, rivalitas Celtic dan Rangers mencerminkan perebutan hegemoni antara penganut Katolikdan Protestan. " +
                "sepak bola merupakan agama tak resmi terbesar di Vitoria-Gasteiz. Klub lokalnya bernama Deportivo Alaves. Tak banyak yang bisa diceritakan darinya, kecuali bahwa Alaves merupakan klub medioker yang pernah hampir bangkrut akibat korupsi"))

        data?.add(DataModel(R.drawable.jerman,"Budaya Sepakbola di Jerman ( Negara dengan trofi piala dunia terbanyak)","Bagi banyak wisatawan yang melancong ke Jerman, kunjungan mereka tidak akan lengkap tanpa mencicipi atmosfer....", "Bagi banyak wisatawan yang melancong ke Jerman, kunjungan mereka tidak akan lengkap tanpa mencicipi atmosfer pertandingan sepakbola " +
                "Itu adalah pengalaman olahraga yang unik, berkat cara bagaimana klub dijalankan, serta hubungan dekat yang dimiliki suporter dengan tim mereka. " +
                "Aturan 50 +1 berarti bahwa klub diatur oleh penggemar mereka, selagi memastikan harga tiket dijaga relatif rendah, sehingga membuat setiap pertandingan terjangkau, bahkan saat melawan klub terbesar Bundesliga, seperti Bayern Munich dan Borussia Dortmund."))

        data?.add(DataModel(R.drawable.prancis,"Budaya Sepakbola Prancis (sang juara piala dunia 2018)","Diplomasi budaya yang dilakukan Prancis ini dilakukan dengan konsisten, sejalan dengan kepentingan negara yang lainnya seperti ...", "Diplomasi budaya yang dilakukan Prancis ini dilakukan dengan konsisten, sejalan dengan kepentingan negara yang lainnya seperti politik, militer, dan ekonomi. " +
                "Kreativitas budaya sepak bola dan cara hidup merupakan sarana yang kuat untuk menegaskan kehadiran Prancis di dunia internasional. " +
                "Salah satu diplomasi budaya yang dilakukan Prancis adalah dalam bidang olahraga, dapat diketahui pula negara ini banyak mengeluarkan talenta sepak bola berbakat."))
        data?.add(DataModel(R.drawable.kroasia,"Budaya Sepakbola di Kroasia (sang finalis piala dunia)","ketangguhan mental Kroasia dalam sepakbola, Antara lain ...", " ketangguhan mental dalam sepakbola. Antara lain memiliki keyakinan sepanjang waktu bakal sukses, memburu bola terus menerus, " +
                "bereaksi secara positif terhadap berbagai situasi, mampu bertahan dari segala macam tekanan," +
                "bisa keluar dari segala kesulitan."))

        data?.add(DataModel(R.drawable.indonesia,"Budaya Sepakbola di Tanah air Indonesia","Di Indonesia, tim yang kamu dukung adalah tim yang benar-benar ...", "Di Indonesia, tim yang kamu dukung adalah tim yang benar-benar kamu sukai. " +
                "Tidak ada tempat duduk? Tidak masalah!, Penjual makanan lokal di dalam stadion. " +
                "Persaudaraan antara klub yang kental, Kelas nyanyi (chant)"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("judul", item?.judul)
                intent.putExtra("singkat", item?.singkat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)


            }


        })


    }
}