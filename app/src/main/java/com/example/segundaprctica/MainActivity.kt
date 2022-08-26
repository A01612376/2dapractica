package com.example.segundaprctica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Button
import java.lang.Integer.parseInt



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTxtNombre = findViewById<EditText>(R.id.txtNombre)
        val myNumEdad = findViewById<EditText>(R.id.numEdad)
        val myButtonSubmit = findViewById<Button>(R.id.button)


        myButtonSubmit.setOnClickListener {
            var elNombre : String = myTxtNombre.text.toString()
            var laEdad : Int = parseInt(myNumEdad.text.toString())

            val myIntent = Intent(this, Activity2::class.java)

            myIntent.putExtra("keyNombre", elNombre)
            myIntent.putExtra("keyEdad", laEdad)
            startActivity(myIntent)
        }

        Log.d("MYAPP", "Fin de la ejecución de onCreate de MainActivity");
    }

    override fun onStart(){
        Log.d("MYAPP", "Fin de la ejecución de onCreate de MainActivity")
        super.onStart()
    }

    override fun onResume(){
        Log.d("MYAPP", "Fin de la ejecución de onResume de MainActivity")
        super.onResume()
    }

    override fun onRestart(){
        Log.d("MYAPP", "Fin de la ejecución de onRestart de MainActivity")
        super.onRestart()
    }

    override fun onPause(){
        Log.d("MYAPP", "Fin de la ejecución de onPause de MainActivity")
        super.onPause()
    }

    override fun onStop(){
        Log.d("MYAPP", "Fin de la ejecución de onStop de MainActivity")
        super.onStop()
    }

    override fun onDestroy(){
        Log.d("MYAPP", "Fin de la ejecución de onDestroy de MainActivity")
        super.onDestroy()
    }
}