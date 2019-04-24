package com.example.maccalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isNewOperation = true;
    var op = ""
    var oldnumber = ""

fun doOperation(view:View){
    var buSelected = view as Button
    //var buClickValue :String = et.text.toString()
    when(buSelected.id) {
        buttonplus.id ->{
            op  = "+"
        }
        buttonmin.id ->{
            op = "-"
        }
        buttonmul.id ->{
            op  = "*"
        }
        buttondiv.id ->{
            op = "/"
        }

    }
    oldnumber = et.text.toString()
    isNewOperation = true;

}
fun buttonPress(view: View){

    if(isNewOperation){
        et.setText("")
    }

    isNewOperation = false;
    var buSelected : Button = view as Button

    var buClickValue :String = et.text.toString()
    when(buSelected.id) {
        button0.id ->{
            buClickValue += "0"
        }
        button1.id ->{
            buClickValue += "1"
        }
        button2.id ->{
            buClickValue += "2"
        }

        button3.id ->{
            buClickValue += "3"
        }
        button4.id ->{
            buClickValue += "4"
        }
        button5.id ->{
            buClickValue += "5"
        }
        button6.id ->{
            buClickValue += "6"
        }
        button7.id ->{
            buClickValue += "7"
        }
        button0.id ->{
            buClickValue += "0"
        }
        button8.id ->{
            buClickValue += "8"
        }
        button9.id ->{
            buClickValue += "9"
        }
        buttondot.id ->{
            buClickValue += "."
        }
        buttonplusminus.id ->{
            buClickValue = "-" + buClickValue
        }
    }

    et.setText(buClickValue)

}


    fun doEqualOperation(view : View){
        var newNumber = et.text.toString()
        var resNumber : Double? = null;

        when(op){

            "+" -> {
                resNumber = oldnumber.toDouble() + newNumber.toDouble()
            }

            "-" -> {
                resNumber = oldnumber.toDouble() - newNumber.toDouble()
            }


            "*" -> {
                resNumber = oldnumber.toDouble() * newNumber.toDouble()
            }

            "/" -> {
                resNumber = oldnumber.toDouble() / newNumber.toDouble()
            }
        }

        et.setText(resNumber.toString())
        isNewOperation = true
    }


    fun buttonAllClear(view:View){
        et.setText("")
        isNewOperation = true;
    }

    fun doPercentage(view : View){
        val res = et.text.toString().toDouble()/100;
        et.setText(res.toString())
    }
}
