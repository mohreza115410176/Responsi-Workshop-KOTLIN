package com.example.usergate.kamusbahasabuol

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.CardView
import android.view.ListView
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    internal var mType   : EditText
    internal var mSearch : Button
    internal var mResult : TextView
    //variabel pada aplikasi berupa pencarian kata, tombol, dan hasil.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mType = findViewById(R.id.typeWordTxt) as EditText
        mSearch = findViewById(R.id.findBtn) as Button
        mResult = findViewById(R.id.resultsTxt) as TextView
        //digunakan untuk mencari id view pada (typeWordTxt, findBtn, dan resultTxt).

        mSearch.setOnClickListener {
            //untuk menentukan apa yang akan kata apa yang akan cari ketika objek btn di-klik.

            if (mType.text.toString().trim { it <= ' ' } == "satu" + "tetu") {
            //kata yang dapat di cari untuk diterjemahkan.

                mResult.text = "Indonesia : Satu"
                mResult.text = "Buol      : Tetu"
                //menampikan hasil dari terjemahan.

            } else if (mType.text.toString().trim { it <= ' ' } == "dua" + "duia") {
            //kata yang dapat di cari untuk diterjemahkan.

                mResult.text = "Indonesia : Dua"
                mResult.text = "Buol      : Duia"
                //menampikan hasil dari terjemahan.

            } else if (mType.text.toString().trim { it <= ' ' } == "tiga" + "totoyu") {
            //kata yang dapat di cari untuk diterjemahkan.

                mResult.text = "Indonesia : Tiga"
                mResult.text = "Buol      : Totoyu"
                //menampikan hasil dari terjemahan.

            } else {
                mResult.text = "Tidak Ada Kata"
                //alternatif jika kata yang dicari tidak ada.
            }
        }
    }
}