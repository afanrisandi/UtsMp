package com.AfanRisandi.headphoneinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.headphone1,"HyperX Cloud Alpha","Rp850.000 – Rp1,3 juta","Headset gaming terbaik yang pertama dengan harga terjangkau adalah HyperX Cloud Alpha. Sesuai dengan harganya, headset ini masih menggunakan kabel jack 3,5 mm." +
                "Namun, kabel ini bisa dilepas, sama seperti mikrofonnya. Sehingga mudah disimpan atau dibawa kemana saja. Meskipun kualitas suara standar karena belum dibekali dengan teknologi Surround Sound, namun tetap enak didengar. " +
                "Kenyamanan penggunaan pun terjamin HyperX Cloud Alpha memiliki desain yang simple, dilengkapi bantalan lembut, dan mikrofon peredam bising yang membuat suara saat berkomunikasi terdengar jelas."))

        data?.add(DataModel(R.drawable.headphone2,"Corsair HS70 Pro","Rp1,3 juta – Rp1,5 juta", "Di urutan kedua, ada Corsair HS70 Pro yang memiliki desain minimalis berbalut cover warna hitam yang modern. " +
                "Kamu bisa menggunakan headset ini dengan leluasa karena sudah dilengkapi dengan teknologi nirkabel 2,4 GHz, dan kualitas ketahanan baterai yang bagus." +
                "Kualitas suara juga mantap terdengar berkat teknologi Surround Sound 7.1, sehingga setiap detil suara dapat terdengar dengan jelas." +
                "Untuk menambah kenyamanan, Corsair HS70 Pro juga memiliki bantalan yang empuk."))

        data?.add(DataModel(R.drawable.headphone3,"Razer Kraken X","Rp700.000 – Rp1,3 juta", "Untuk kategori headset gaming terbaik harga murah lainnya, kamu bisa memilih Razer Kraken X yang sudah dibekali dengan teknologi Surroun Sound 7.1. " +
                "Keunggulan lain dari headset ini adalah kenyamanan pengguna yang diutamakan. " +
                "Bobot headset ringan, yakni hanya 250 gram, bantalan empuk, serta mikrofon tipe polar cardioid yang bisa ditekuk dan padding kepala yang lembut."))

        data?.add(DataModel(R.drawable.headphone4,"SteelSeries Arctis 7","Rp1,8 juta – Rp2,3 juta", "SteelSeries memang dikenal sebagai merk headset gaming terbaik. Varian SteelSeries Arctis 7 pun tergolong memiliki harga menengah, dengan spesifikasi yang menggiurkan." +
                "Yakni dibekali dengan teknologi DTS Surround Sound X v2.0, baterai yang tahan lama hingga 24 jam pemakaian, dan metode penggunaan nirkabel 2,4 GHz." +
                "Selain itu, produk headset SteelSeries selalu disertakan dengan pita karet Velcro yang membuat pengguna bisa menyesuaikan pemakaian headset dengan bentuk kepala."))

        data?.add(DataModel(R.drawable.headphone5,"SteelSeries Arctis Pro","Rp2,8 juta – Rp3 juta", "Selain varian Arctis 7, SteelSeries juga memiliki varian Arctis Pro yang menjadi headset game terbaik " +
                "Teknologi DTS Surround Sound X v.20 memungkinkan pengguna merasakan pengalaman main game dengan suara yang menggelegar.Pita karet Velcro khas SteelSeries juga bisa disesuaikan dengan kepala pengguna agar semakin nyaman. " +
                "Yang menarik dari SteelSeries Arctis Pro adalah adanya lampu RGB dengan berbagai warna yang menyala dalam gelap. Enggak heran jika harga headset ini pun lebih mahal daripada varian Arctis 7."))

        data?.add(DataModel(R.drawable.headphone6,"Razer Thresher Ultimate","Rp3,4 juta – Rp4,2 juta", "Mau merasakan headset dengan kualitas suara bagus berkat teknologi Dolby Surround Sound? Pilih saja headset gaming terbaik seperti Razer Thresher Ultimate ini." +
                "dHeadset nirkabel ini diklaim bebas lag, dan bisa digunakan hingga jarak maksimal 12 meter. Desainnya simple, lengkap dengan bantalan telinga yang meredam kebisingan. " +
                "Pengguna bisa fokus mendengar efek suara game, tanpa perlu khawatir terganggu dengan gangguan suara (noise) lainnya."))

        data?.add(DataModel(R.drawable.headphone7,"Astro A50 Wireless","Rp5,8 juta – Rp6,7 juta", "Jika kamu memiliki budget lebih untuk membeli headset gaming terbaik dengan harga jual yang tinggi, kamu bisa memilih Astro A50 Wireless." +
                "Dengan satu headset nirkabel ini, kamu bisa menikmati game di hampir semua perangkat. Seperti PS3 dan PS4, Xbox One dan Xbox 360, serta digunakan di PC atau handphone." +
                "Kualitas suara dijamin dengan teknolongi Surround Sound 7.1 Dolvy Virtual, serta tiga pilihan pengaturan suara yang disebut EQ Preset."))


        data?.add(DataModel(R.drawable.headphone8,"Asus ROG Centurion 7.1","Rp4 juta -an", "Rekomendasi headset gaming terbaik yang terakhir jatuh kepada Asus ROG Centurion 7.1 yang tentu saja sudah diketahui sebagai merk ternama untuk produk pendukung main game." +
                "Asus ROG Centurion 7.1 dilengkapi dengan teknologi Surroun Sound 7.1 yang membuat kualitas audio terdengar jelas dan detil, serta bisa digunakan pada Sonic Software. HMikrofon dengan peredam bising bikin pengguna bisa menikmati momen main game tanpa khawatir adanya noise." +
                "Setiap pembelian Asus ROG Centurion 7.1 akan mendapat ROG Stand atau tiang peletak headset dengan warna hitam senada yang bisa dipakai ketika headset sedang tidak digunakan."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}