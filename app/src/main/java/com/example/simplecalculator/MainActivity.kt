package com.example.simplecalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.math.*
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var res=0.0
    fun onAdd(view:View){
        if(num1.text.isBlank() or num2.text.isBlank())
            tvRes.text="No Input"
        else {

            var a = num1.text.toString().toDouble()
            var b = num2.text.toString().toDouble()

            res = a + b
        }
        //tvRes.text="Result= "+res

    }
    fun onMin(view:View){
        if(num1.text.isBlank() or num2.text.isBlank())
            tvRes.text="No Input"
        else {
            var a = num1.text.toString().toDouble()
            var b = num2.text.toString().toDouble()

            res = a - b
        }
        //tvRes.text="Result= "+res

    }
    fun onMul(view:View){
        if(num1.text.isBlank() or num2.text.isBlank())
            tvRes.text="No Input"
        else {
            var a = num1.text.toString().toDouble()
            var b = num2.text.toString().toDouble()

            res = a * b
        }
        //tvRes.text="Result= "+res

    }
    fun onDiv(view:View){
        if(num1.text.isBlank() or num2.text.isBlank())
            tvRes.text="No Input"
        else {
            var a = num1.text.toString().toDouble()
            var b = num2.text.toString().toDouble()

            if (b.toInt() == 0) {
                tvRes.text = "Cannot Evaluate!"

            } else
                res = a / b
        }
        //tvRes.text="Result= "+res

    }
    fun onEqual(view:View) {

        if(num1.text.isBlank() or num2.text.isBlank())
            tvRes.text="No Input"
        else {
            if (floor(res) == ceil(res)) {
                var result: Int = res.toInt()
                tvRes.text = "Result= " + result

            } else {
                var result: Double = Math.round(res * 10000.0) / 10000.0
                tvRes.text = "Result= " + result

            }
        }



    }
    fun onReset(view: View){
        num1.text.clear()
        num2.text.clear()
        tvRes.text="Result= 0"
    }

}