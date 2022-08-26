package com.example.segundaprctica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.util.Log
import org.w3c.dom.Text

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val myTxtNombre = findViewById<TextView>(R.id.textView4)
        val myNumEdad = findViewById<TextView>(R.id.textView6)
        val botonRegresar = findViewById<Button>(R.id.button2)

        var myExtras : Bundle? = intent.extras

        var nombreRecibido : String = myExtras?.getString("keyNombre")?:"NoName"
        var edadRecibida : Int = myExtras?.getInt("keyEdad")?:-1

        myTxtNombre.text = nombreRecibido
        myNumEdad.text = edadRecibida.toString()

        botonRegresar.setOnClickListener {

            val myIntent = Intent(this,MainActivity::class.java)
            startActivity(myIntent)

        }

        Log.d("MYAPP", "Fin de la ejecución de onCreate de Activity2");
    }

    override fun onStart(){
        Log.d("MYAPP", "Fin de la ejecución de onCreate de MainActivity")
        super.onStart()
    }

    override fun onResume(){
        Log.d("MYAPP", "Fin de la ejecución de onResume de Activity2")
        super.onResume()
    }

    override fun onRestart(){
        Log.d("MYAPP", "Fin de la ejecución de onRestart de Activity2")
        super.onRestart()
    }

    override fun onPause(){
        Log.d("MYAPP", "Fin de la ejecución de onPause de Activity2")
        super.onPause()
    }

    override fun onStop(){
        Log.d("MYAPP", "Fin de la ejecución de onStop de Activity2")
        super.onStop()
    }

    override fun onDestroy(){
        Log.d("MYAPP", "Fin de la ejecución de onDestroy de Activity2")
        super.onDestroy()
    }
}