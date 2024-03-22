package edenilson.amaya.areatriangulo_edenilson

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtBase = findViewById<EditText>(R.id.txtBase)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtresultado = findViewById<TextView>(R.id.txtResultado)

        val objAreaTriangulo = AreaTriangulo()
        btnCalcular.setOnClickListener {
            val resultadoF =objAreaTriangulo.multiplicar(txtBase.text.toString().toDouble(),txtAltura.text.toString().toDouble())
            println("El resultado es: $resultadoF")
            txtresultado.text ="El resultado es $resultadoF"
        }
    }
}