package com.AfanRisandi.headphoneinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Device"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.headphone1))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewHargaDetail.text = intent.getStringExtra("harga")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
