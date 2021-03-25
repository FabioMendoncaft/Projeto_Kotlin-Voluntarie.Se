package br.com.devmod.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_developer.*
import kotlinx.android.synthetic.main.activity_main.*

class developer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)

        bt_x_3.setOnClickListener{
            IrParaIndex()
        }

        bt_nassau.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uninassau.edu.br"))
            startActivity(i)
        })
    }

    private fun IrParaIndex(){
        val index = Intent(this, MainActivity::class.java)
        startActivity(index)
    }
}