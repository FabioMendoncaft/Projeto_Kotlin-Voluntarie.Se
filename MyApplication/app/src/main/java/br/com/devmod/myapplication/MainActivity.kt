package br.com.devmod.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_login.setOnClickListener{
            IrParaLogin()
        }

        bt_cadastro.setOnClickListener{
            IrParaCadastro()
        }

        bt_dev.setOnClickListener{
            IrParaDeveloper()
        }
    }

    private fun IrParaLogin(){
        val login = Intent(this, Login::class.java)
        startActivity(login)
    }

    private fun IrParaCadastro(){
        val cadastro = Intent(this, Cadastro::class.java)
        startActivity(cadastro)
    }

    private fun IrParaDeveloper(){
        val dev = Intent(this, developer::class.java)
        startActivity(dev)
    }
}
