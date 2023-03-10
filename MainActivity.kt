package com.ekiramadhan.asmaul

import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ekiramadhan.asmaul.adapter.RecyclerViewAdapter
import com.ekiramadhan.asmaul.adapter.RecyclerViewAdapterBacaan


class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var recyclerView1: RecyclerView? = null
    var recyclerViewAdapter: RecyclerViewAdapter? = null
    var recyclerViewAdapterBacaan: RecyclerViewAdapterBacaan? = null
    var recyclerViewLayoutManager: RecyclerView.LayoutManager? = null
    var recyclerViewLayoutManager1: RecyclerView.LayoutManager? = null
    var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Asmaul Husna"
        mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.asmaul_husna)
        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        recyclerView1 = findViewById<View>(R.id.recycler_view1) as RecyclerView
        recyclerView!!.isNestedScrollingEnabled = true

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = GridLayoutManager(this, 1)
        (recyclerViewLayoutManager as GridLayoutManager).setAutoMeasureEnabled(true)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = recyclerViewLayoutManager
        recyclerView!!.adapter = recyclerViewAdapter
        recyclerViewLayoutManager1 = GridLayoutManager(this, 1)
        (recyclerViewLayoutManager1 as GridLayoutManager).setAutoMeasureEnabled(true)
        recyclerView1!!.setHasFixedSize(true)
        recyclerView1!!.layoutManager = recyclerViewLayoutManager1
        recyclerViewAdapterBacaan = RecyclerViewAdapterBacaan(
            applicationContext,
            userInformationn
        )
        recyclerView1!!.adapter = recyclerViewAdapterBacaan
    }

    private val userInformationn: List<User2>
        private get() {
            val userList: MutableList<User2> = ArrayList()
            userList.add(
                User2(
                    "???????? ???? ???? ?????? ?????? ???????? ?????????? ???? ???????? ???????? ????????",
                    "Asyhadu an laa ilaaha illall??h wa asyhadu anna Muhammad Rasuulull??h.",
                    "Aku bersaksi bahwa tiada Tuhan melainkan Allah dan Aku bersaksi Nabi Muhammad utusan Allah."
                )
            )
            userList.add(
                User2(
                    "???????????????? ?????????? ?????????? ????????????????     ???????????????? ?????????? ???????????????? ????????????????",
                    "Allahumma sholli ala muhammad ya robbi sholli alaihi wasallim",
                    "Ya Allah, limpahkanlah rahmat atas Nabi Muhammad Ya Tuhanku, limpahkanlah rahmat dan kesejahteraan atas beliau"
                )
            )
            userList.add(
                User2(
                    "?????????????????? ???????????????????????? ?????????????????????? ???????????????????? ?????????? ?? ???????????????? ?????????????????? ?????????????????????? ?????? ?????????????????????? ?? ???????????????????????? ?????? ?????????????? ??????????????????????",
                    "Walillahil asmaa-ul husna faad'uuhu bihaa wadzaruul-ladziina yulhiduuna fii asmaa-ihi sayujzauna maa kaanuu ya'maluun(a)",
                    "Hanya milik Allah asmaa-ul husna, maka bermohonlah kepada-Nya dengan menyebut asmaa-ul husna itu dan tinggalkanlah orang-orang yang menyimpang dari kebenaran dalam (menyebut) nama-nama-Nya. Nanti mereka akan mendapat balasan terhadap apa yang telah mereka kerjakan."
                )
            )
            return userList
        }
    private val userInformation: List<User>
        private get() {
            val userList: MutableList<User> = ArrayList()
            userList.add(User("", "????????", "Allah", "Allah"))
            userList.add(User("1", "????????????", "Ar Rahman", "Yang Maha Pengasih"))
            userList.add(User("2", "????????????", "Ar Rahiim", "Yang Maha Penyayang"))
            userList.add(User("3", "??????????", "Al Malik", "Yang Maha Merajai / Memerintah"))
            userList.add(User("4", "????????????", "Al Quddus", "Yang Maha Suci"))
            userList.add(User("5", "????????????", "As Salaam", "Yang Maha Memberi Kesejahteraan"))
            userList.add(User("6", "????????????", "Al Mu`min", "Yang Maha Memberi Keamanan"))
            userList.add(User("7", "??????????????", "Al Muhaimin", "Yang Maha Pemelihara"))
            userList.add(User("8", "????????????", "Al `Aziiz", "Yang Maha PerkasaYang Maha Perkasa"))
            userList.add(User("9", "????????????", "Al Jabbar", "Yang Memiliki Mutlak Kegagahan"))
            userList.add(
                User(
                    "10",
                    "??????????????",
                    "Al Mutakabbir",
                    "Yang Maha Megah, Yang Memiliki Kebesaran"
                )
            )
            userList.add(User("11", "????????????", "Al Khaliq", "Yang Maha Pencipta"))
            userList.add(
                User(
                    "12",
                    "????????????",
                    "Al Baari`",
                    "Yang Maha Melepaskan (Membuat, Membentuk, Menyeimbangkan)"
                )
            )
            userList.add(
                User(
                    "13",
                    "????????????",
                    "Al Mushawwir",
                    "Yang Maha Membentuk Rupa (makhluknya)"
                )
            )
            userList.add(User("14", "????????????", "Al Ghaffaar", "Yang Maha Pengampun"))
            userList.add(User("15", "????????????", "Al Qahhaar", "Yang Maha Menundukan"))
            userList.add(User("16", "????????????", "Al Wahhaab", "Yang Maha Pemberi Karunia"))
            userList.add(User("17", "????????????", "Ar Razzaaq", "Yang Maha Pemberi Rezeki"))
            userList.add(User("18", "????????????", "Al Fattaah", "Yang Maha Pembuka Rahmat"))
            userList.add(User("19", "????????????", "Al `Aliim", "Yang Maha Mengetahui (Memiliki Ilmu)"))
            userList.add(User("20", "????????????", "Al Qaabidh", "Yang Maha Menyempitkan (makhluknya)"))
            userList.add(User("21", "????????????", "Al Baasith", "Yang Maha Melapangkan (makhluknya)"))
            userList.add(User("22", "????????????", "Al Khaafidh", "Yang Maha Merendahkan (makhluknya)"))
            userList.add(User("23", "????????????", "Ar Raafi`", "Yang Maha Meninggikan (makhluknya)"))
            userList.add(User("24", "??????????", "Al Mu`izz", "Yang Maha Memuliakan (makhluknya)"))
            userList.add(User("25", "??????????", "Al Mudzil", "Yang Maha Menghinakan (makhluknya)"))
            userList.add(User("26", "????????????", "Al Samii`", "Yang Maha Mendengar"))
            userList.add(User("27", "????????????", "Al Bashiir", "Yang Maha Melihat"))
            userList.add(User("28", "??????????,", "Al Hakam", "Yang Maha Menetapkan"))
            userList.add(User("29", "??????????", "Al `Adl", "Yang Maha Adil"))
            userList.add(User("30", "????????????", "Al Lathiif", "Yang Maha Lembut"))
            userList.add(User("31", "????????????", "Al Khabiir", "Yang Maha Mengenal"))
            userList.add(User("32", "????????????", "Al Haliim", "Yang Maha Penyantun"))
            userList.add(User("33", "????????????", "Al `Azhiim", "Allah Yang Maha Agung"))
            userList.add(User("34", "????????????", "Al Ghafuur", "Allah Yang Maha Memberi Pengampunan"))
            userList.add(
                User(
                    "35",
                    "????????????",
                    "As Syakuur",
                    "Allah Yang Maha Pembalas Budi (Menghargai)"
                )
            )
            userList.add(User("36", "??????????", "Al `Aliy", "Allah Yang Maha Tinggi"))
            userList.add(User("37", "????????????", "Al Kabiir", "Yang Maha Besar"))
            userList.add(User("38", "????????????", "Al Hafizh", "Allah Yang Maha Memelihara"))
            userList.add(User("39", "????????????", "Al Muqiit", "Allah Yang Maha Pemberi Kecukupan"))
            userList.add(User("40", "????????????", "Al Hasiib", "Allah Yang Maha Membuat Perhitungan"))
            userList.add(User("41", "????????????", "Al Jaliil", "Allah Yang Maha Luhur"))
            userList.add(User("42", "????????????", "Al Kariim", "Allah Yang Maha Pemurah"))
            userList.add(User("43", "????????????", "Ar Raqiib", "Allah Yang Maha Mengawasi"))
            userList.add(User("44", "????????????", "Al Mujiib", "Allah Yang Maha Mengabulkan"))
            userList.add(User("45", "????????????", "Al Waasi`", "Allah Yang Maha Luas"))
            userList.add(User("46", "????????????", "Al Hakim", "Allah Yang Maha Bijaksana"))
            userList.add(User("47", "????????????", "Al Waduud", "Allah Yang Maha Mengasihi"))
            userList.add(User("48", "????????????", "Al Majiid", "Allah Yang Maha Mulia"))
            userList.add(User("49", "????????????", "Al Baa`its", "Allah Yang Maha Membangkitkan"))
            userList.add(User("50", "????????????", "As Syahiid", "Allah Yang Maha Menyaksikan"))
            userList.add(User("51", "????????", "Al Haqq", "Allah Yang Maha Benar"))
            userList.add(User("52", "????????????", "Al Wakiil", "Allah Yang Maha Memelihara"))
            userList.add(User("53", "??????????", "Al Qawiyyu", "Allah Yang Maha Kuat"))
            userList.add(User("54", "????????????", "Al Matiin", "Allah Yang Maha Kokoh"))
            userList.add(User("55", "??????????", "Al Waliyy", "Allah Yang Maha Melindungi"))
            userList.add(User("56", "????????????", "Al Hamiid", "Allah Yang Maha Terpuji"))
            userList.add(
                User(
                    "57",
                    "????????????",
                    "Al Muhshii",
                    "Allah Yang Maha Mengalkulasi (Menghitung Segala Sesuatu)"
                )
            )
            userList.add(User("58", "????????????", "Al Mubdi`", "Allah Yang Maha Memulai"))
            userList.add(
                User(
                    "59",
                    "????????????",
                    "Al Mu`iid",
                    "Allah Yang Maha Mengembalikan Kehidupan"
                )
            )
            userList.add(User("60", "????????????", "Al Muhyii", "Allah Yang Maha Menghidupkan"))
            userList.add(User("61", "????????????", "Al Mumiitu", "Allah Yang Maha Mematikan"))
            userList.add(User("62", "????????", "Al Hayyu", "Allah Yang Maha Hidup"))
            userList.add(User("63", "????????????", "Al Qayyuum", "Allah Yang Maha Mandiri"))
            userList.add(User("64", "????????????", "Al Waajid", "Allah Yang Maha Penemu"))
            userList.add(User("65", "????????????", "Al Maajid", "Allah Yang Maha Mulia"))
            userList.add(User("66", "????????????", "Al Wahid", "Allah Yang Maha Tunggal"))
            userList.add(User("67", "??????????", "Al Ahad", "Allah Yang Maha Esa"))
            userList.add(
                User(
                    "68",
                    "??????????",
                    "As Shamad",
                    "Allah Yang Maha Dibutuhkan, Tempat Meminta"
                )
            )
            userList.add(
                User(
                    "69",
                    "????????????",
                    "Al Qaadir",
                    "Allah Yang Maha Menentukan, Maha Menyeimbangkan"
                )
            )
            userList.add(User("70", "??????????????", "Al Muqtadir", "Allah Yang Maha Berkuasa"))
            userList.add(User("71", "????????????", "Al Muqaddim", "Allah Yang Maha Mendahulukan"))
            userList.add(User("72", "????????????", "Al Mu`akkhir", "Allah Yang Maha Mengakhirkan"))
            userList.add(User("73", "??????????", "Al Awwal", "Allah Yang Maha Awal"))
            userList.add(User("74", "??????????", "Al Aakhir", "Allah Yang Maha Akhir"))
            userList.add(User("75", "????????????", "Az Zhaahir", "Allah Yang Maha Nyata"))
            userList.add(User("76", "????????????", "Al Baathin", "Allah Yang Maha Ghaib"))
            userList.add(User("77", "????????????", "Al Waali", "Allah Yang Maha Memerintah"))
            userList.add(User("78", "????????????????", "Al Muta`aalii", "Allah Yang Maha Tinggi"))
            userList.add(
                User(
                    "79",
                    "????????",
                    "Al Barru",
                    "Allah Yang Maha Penderma (Maha Pemberi Kebajikan)"
                )
            )
            userList.add(User("80", "????????????", "At Tawwaab", "Allah Yang Maha Penerima Tobat"))
            userList.add(User("81", "??????????????", "Al Muntaqim", "Allah Yang Maha Pemberi Balasan"))
            userList.add(User("82", "??????????", "Al Afuww", "Allah Yang Maha Pemaaf"))
            userList.add(User("83", "????????????", "Ar Ra`uuf", "Allah Yang Maha Pengasuh"))
            userList.add(
                User(
                    "84",
                    "???????? ??????????",
                    "Malikul Mulk",
                    "Allah Yang Maha Penguasa Kerajaan (Semesta)"
                )
            )
            userList.add(
                User(
                    "85",
                    "???? ???????????? ?? ??????????????",
                    "Dzul Jalaali Wal Ikraam",
                    "Allah Yang Maha Pemilik Kebesaran dan Kemuliaan"
                )
            )
            userList.add(User("86", "????????????", "Al Muqsith", "Allah Yang Maha Pemberi Keadilan"))
            userList.add(User("87", "????????????", "Al Jamii`", "Allah Yang Maha Mengumpulkan"))
            userList.add(User("88", "??????????", "Al Ghaniyy", "Allah Yang Maha Kaya"))
            userList.add(User("89", "????????????", "Al Mughnii", "Allah Yang Maha Pemberi Kekayaan"))
            userList.add(User("90", "????????????", "Al Maani", "Allah Yang Maha Mencegah"))
            userList.add(User("91", "??????????", "Ad Dhaar", "Allah Yang Maha Penimpa Kemudharatan"))
            userList.add(User("92", "????????????", "An Nafii`", "Allah Yang Maha Memberi Manfaat"))
            userList.add(
                User(
                    "93",
                    "??????????",
                    "An Nuur",
                    "Allah Yang Maha Bercahaya (Menerangi, Memberi Cahaya)"
                )
            )
            userList.add(User("94", "????????????", "Al Haadii", "Allah Yang Maha Pemberi Petunjuk"))
            userList.add(
                User(
                    "95",
                    "????????????",
                    "Al Badii???",
                    "Allah Yang Maha Pencipta Yang Tiada Bandingannya"
                )
            )
            userList.add(User("96", "????????????", "Al Baaqii", "Allah Yang Maha Kekal"))
            userList.add(User("97", "????????????", "Al Waarits", "Allah Yang Maha Pewaris"))
            userList.add(User("98", "????????????", "Ar Rasyiid", "Allah Yang Maha Pandai"))
            userList.add(User("99", "????????????", "As Shabuur", "Allah Yang Maha Sabar"))
            return userList
        }

    class User(val no: String, val ayat: String, val bacaan: String, val arti: String)

    class User2(val bacaan: String, val arti: String, val bacaanLatin: String)

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    //Tombol Kembali
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.ket -> {
                mediaPlayer!!.reset()
                mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.asmaul_husna)
            }
            R.id.suara -> if (mediaPlayer!!.isPlaying) {
                mediaPlayer!!.pause()
                item.setIcon(R.drawable.ic_play)
            } else {
                mediaPlayer!!.start()
                Toast.makeText(
                    this@MainActivity,
                    "Suara Dari Bapak Dr. H.C Ary Ginanjar Agustian",
                    Toast.LENGTH_SHORT
                ).show()
                item.setIcon(R.drawable.ic_pause)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // return to the App's Home Activity
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            mediaPlayer!!.stop()
            mediaPlayer!!.reset()
            val alBuilder: androidx.appcompat.app.AlertDialog.Builder =
                androidx.appcompat.app.AlertDialog.Builder(this@MainActivity)
            alBuilder.setMessage("Apa kamu ingin menutup aplikasi ini ?")
            alBuilder.setPositiveButton("Iya",
                DialogInterface.OnClickListener { dialog, which ->
                    val keluar = Intent(Intent.ACTION_MAIN)
                    keluar.addCategory(Intent.CATEGORY_HOME)
                    keluar.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(keluar)
                }).setNegativeButton("Tidak",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
            val dialog: AlertDialog
            dialog = alBuilder.create()
            dialog.show()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}
