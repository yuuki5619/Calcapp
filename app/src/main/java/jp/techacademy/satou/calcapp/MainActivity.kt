package jp.techacademy.satou.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() , View.OnClickListener {
    var edit1:Double=0.0
    var edit2:Double=0.0
    var result:Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonpluss.setOnClickListener(this)
        buttonminass.setOnClickListener(this)
        buttonkakeru.setOnClickListener(this)
        buttonwaru.setOnClickListener(this)




    }




    override fun onClick(v: View) {


        if ( edittext1.text.length == 0 || edittext2.text.length == 0 ) {
            val message = "何か値を入力してください"
            val intent = Intent(this, CalcApp2::class.java)
            intent.putExtra("VALUE2",message)
            startActivity(intent)
        }else {

            when (v.id) {
                R.id.buttonpluss -> {
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    result = edit1 + edit2
                    intent1()
                }
                R.id.buttonminass -> {
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    result = (edit1 - edit2)
                    intent1()
                }
                R.id.buttonkakeru -> {
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    result =  (edit1 * edit2)
                    intent1()
                }
                R.id.buttonwaru -> {
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    result = (edit1 / edit2)
                    intent1()
                }else -> 0.0

                }

            }

        }

    private fun intent1(){
        val intent1 = Intent(this,CalcApp2::class.java)
        intent1.putExtra("VALUE",result)
        startActivity(intent1)

    }




}