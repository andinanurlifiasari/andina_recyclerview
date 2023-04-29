package com.example.andina_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable.andina,
            namamhs = "AndinaNur",
            Nimmhs = "2010",
            Telpmhs = "0812345"
        ),
        Inis_Variable(
            R.drawable.andina,
            namamhs = "Andinanay",
            Nimmhs = "2011",
            Telpmhs = "08123456"

        ),
        Inis_Variable(
            R.drawable.andina2,
            namamhs = "AndinaCantik",
            Nimmhs = "2012",
            Telpmhs = "081234567"
        ),
        Inis_Variable(
            R.drawable.andina3,
            namamhs = "Andinanana",
            Nimmhs = "2013",
            Telpmhs =  "0812345678"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        ShowListMahasiswa()
        ShowGridMahasiswa()
        ShowCardMahasiswa()


    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = Card_MahasiswaAdapter(this,Datamahasiswa){

        }
        recyclerView.adapter = adapter
    }

    private fun ShowGridMahasiswa() {
        val adapter = grid_mhsadapter(grid_mhs = Datamahasiswa){

        }
        val recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.layoutManager = GridLayoutManager (this, 2)
        recyclerView.adapter = grid_mhsadapter (Datamahasiswa){

        }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= List_MahasiswaAdapter(this, Datamahasiswa){

        }
    }


}