package com.javiereduardo.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var operacion = ""
    var operacionPendiente = false

    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button
    lateinit var btn0:Button
    lateinit var btnIgual:Button
    lateinit var btnMult:Button
    lateinit var btnDiv:Button
    lateinit var btnRes:Button
    lateinit var btnSum:Button
    lateinit var etVisor:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }
    private fun initUi(){
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnIgual = findViewById(R.id.btnIgual)
        btnMult = findViewById(R.id.btnMulti)
        btnDiv = findViewById(R.id.btnDiv)
        btnRes = findViewById(R.id.btnRes)
        btnSum = findViewById(R.id.btnSum)
        etVisor = findViewById(R.id.etVisor)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnIgual.setOnClickListener(this)
        btn0.setOnClickListener(this)
        btnMult.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
        btnRes.setOnClickListener(this)
        btnSum.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id){
            R.id.btn1 ->{
                etVisor.append("1")
            }
            R.id.btn2 ->{
                etVisor.append("2")
            }
            R.id.btn3 ->{
                etVisor.append("3")
            }
            R.id.btn4 ->{
                etVisor.append("4")
            }
            R.id.btn5 ->{
                etVisor.append("5")
            }
            R.id.btn6 ->{
                etVisor.append("6")
            }
            R.id.btn7 ->{
                etVisor.append("7")
            }
            R.id.btn8 ->{
                etVisor.append("8")
            }
            R.id.btn9 ->{
                etVisor.append("9")
            }
            R.id.btn0 ->{
                etVisor.append("0")
            }
        }
    }
}