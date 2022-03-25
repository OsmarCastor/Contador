package castor.no.c.pro.omegalul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enlazo elementos
        val textcont = findViewById<TextView>(R.id.txtNumero)
        val boton = findViewById<Button>(R.id.btnAumentar)
        val reset = findViewById<Button>(R.id.btnReiniciar)
        var conteo:Int
        var bandera = true
        conteo = 0
        //esto es un sam(simple abstract method)
        boton.setOnClickListener{
            if (conteo<10){
                if (bandera){
                    conteo = conteo.inc()
                }else if(conteo>1 && !bandera){
                    conteo = conteo.dec()
                }else{
                    bandera = true
                    conteo = conteo.inc()
                }
            }else if (conteo == 10){
                bandera = false
                conteo = conteo.dec()
            }
            textcont.text = "$conteo"
        }
        reset.setOnClickListener{
            conteo = 0
            textcont.text = "$conteo"
        }
    }
}