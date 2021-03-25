package br.com.devmod.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {
    private lateinit var editTextEmail: EditText
    private lateinit var editTextSenha: EditText
    private lateinit var botaoEntrar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextEmail = findViewById(R.id.inputEmail)
        editTextSenha = findViewById(R.id.inputSenha)
        botaoEntrar = findViewById(R.id.bt_entrar)

        bt_x_1.setOnClickListener{
            IrParaIndex()
        }

        //Testar os campos
        botaoEntrar.setOnClickListener{
            validaForm()
        }
    }

    private fun IrParaIndex(){
        val index = Intent(this, MainActivity::class.java)
        startActivity(index)
    }
    private fun validaForm() : Boolean {
        var error = false

        if (editTextEmail.text.isEmpty()) {
            editTextEmail.error = "Digite seu E-mail!"
            error = true
        }

        if (editTextSenha.text.isEmpty()) {
            editTextSenha.error = "Digite sua senha!"
            error = true
        }

        return error
    }
}
