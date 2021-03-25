package br.com.devmod.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_main.*

class Cadastro : AppCompatActivity() {

    private lateinit var editTextNome: EditText
    private lateinit var editTextCep: EditText
    private lateinit var editTextLogradouro: EditText
    private lateinit var editTextNumero: EditText
    private lateinit var editTextComplemento: EditText
    private lateinit var botaoCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        editTextNome = findViewById(R.id.inputNome)
        editTextCep = findViewById(R.id.inputCep)
        editTextLogradouro = findViewById(R.id.inputLogradouro)
        editTextNumero = findViewById(R.id.inputNumero)
        editTextComplemento = findViewById(R.id.inputComp)
        botaoCalcular = findViewById(R.id.bt_cadastrar)

        bt_x_2.setOnClickListener{
            IrParaIndex()
        }

        //Testar os campos
        botaoCalcular.setOnClickListener{
            validaForm()
        }
    }

    private fun IrParaIndex(){
        val index = Intent(this, MainActivity::class.java)
        startActivity(index)
    }

    private fun validaForm() : Boolean{
        var error = false

        if(editTextNome.text.isEmpty()){
            editTextNome.error = "Campo obrigatório!"
            error = true
        }

        if(editTextCep.text.isEmpty()){
            editTextCep.error = "Campo obrigatório!"
            error = true
        }

        if(editTextLogradouro.text.isEmpty()){
            editTextLogradouro.error = "Campo obrigatório!"
            error = true
        }

        if(editTextNumero.text.isEmpty()){
            editTextNumero.error = "Campo obrigatório!"
            error = true
        }

        if(editTextComplemento.text.isEmpty()){
            editTextComplemento.error = "Campo obrigatório!"
            error = true
        }

        return error
    }
}