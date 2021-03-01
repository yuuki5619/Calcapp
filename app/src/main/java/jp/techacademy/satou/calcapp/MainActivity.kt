package jp.techacademy.satou.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

    var edit1:Double=0.0
    var edit2:Double=0.0
    var result:Double=0.0

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonpluss.setOnClickListener(this)
        buttonminass.setOnClickListener(this)
        buttonkakeru.setOnClickListener(this)
        buttonwaru.setOnClickListener(this)




    }




    override fun onClick(v: View) {
         val zizen1 = edittext1.text.toString()
         val zizen2 = edittext2.text.toString()

        if ( zizen1.length == 0 && zizen2.length == 0 ) {
            val message = "何か値を入力してください"
            val intent = Intent(this, CalcApp2::class.java)
            intent.putExtra("VALUE2",message)
            startActivity(intent)
        }else {

            result = when (v.id) {
                R.id.buttonpluss -> { if (zizen1.length == 0 && zizen2.length != 0){
                    edit2 = edittext2.text.toString().toDouble()
                    0 + edit2
                } else if (zizen1.length != 0 && zizen2.length == 0){
                    edit1 = edittext1.text.toString().toDouble()
                    edit1 + 0
                }else{
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    edit1 + edit2
                }
                }
                R.id.buttonminass -> { if (zizen1.length == 0 && zizen2.length != 0){
                    edit2 = edittext2.text.toString().toDouble()
                    0 - edit2
                } else if (zizen1.length != 0 && zizen2.length == 0){
                    edit1 = edittext1.text.toString().toDouble()
                    edit1 - 0
                }else {
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    edit1 - edit2
                }
                }
                R.id.buttonkakeru -> { if (zizen1.length == 0 && zizen2.length != 0){
                    edit2 = edittext2.text.toString().toDouble()
                    0 * edit2
                } else if (zizen1.length != 0 && zizen2.length == 0){
                    edit1 = edittext1.text.toString().toDouble()
                    edit1 * 0
                }else {
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    edit1 * edit2
                }
                }
                R.id.buttonwaru -> { if (zizen1.length == 0 && zizen2.length != 0){
                    edit2 = edittext2.text.toString().toDouble()
                    0 / edit2
                } else if (zizen1.length != 0 && zizen2.length == 0){
                    edit1 = edittext1.text.toString().toDouble()
                    edit1 / 0
                }else {
                    edit1 = edittext1.text.toString().toDouble()
                    edit2 = edittext2.text.toString().toDouble()
                    edit1 / edit2
                }
                }
                else -> 0.0
            }
            val intent = Intent(this, CalcApp2::class.java)
            intent.putExtra("VALUE", result)
            startActivity(intent)
        }
        }


}