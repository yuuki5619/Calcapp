package jp.techacademy.satou.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_app2.*

class CalcApp2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_app2)

        val value = intent.getDoubleExtra("VALUE",0.0)
        calcapp2.text = value.toDouble().toString()

        val value2 = intent.getStringExtra("VALUE2")
        calcapp2.text = value2.toString()
    }
}