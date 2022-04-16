package cr.ac.calculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto : TextView = findViewById(R.id.resultado)
        val buttonC : Button = findViewById(R.id.buttonC)
        val buttonSigno : Button = findViewById(R.id.buttonSigno)
        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        val buttonDivision : Button = findViewById(R.id.buttonDivision)
        val buttonMenos : Button = findViewById(R.id.buttonMenos)
        val buttonMas : Button = findViewById(R.id.buttonMas)
        val buttonMultiplicar : Button = findViewById(R.id.buttonMultiplicar)
        val buttonComa : Button = findViewById(R.id.buttonComa)
        val buttonIgual : Button = findViewById(R.id.buttonIgual)
        val sieteBtn : Button = findViewById(R.id.sieteBtn)
        val ochoBtn : Button = findViewById(R.id.ochoBtn)
        val nueveBtn : Button = findViewById(R.id.nueveBtn)
        val cuatroBtn : Button = findViewById(R.id.cuatroBtn)
        val cincoBtn : Button = findViewById(R.id.cincoBtn)
        val seisBtn : Button = findViewById(R.id.seisBtn)
        val tresBtn : Button = findViewById(R.id.tresBtn)
        val dosBtn : Button = findViewById(R.id.dosBtn)
        val unoBtn : Button = findViewById(R.id.unoBtn)
        val ceroBtn : Button = findViewById(R.id.ceroBtn)

        buttonC.setOnClickListener{ botonClear(texto) }
        buttonSigno.setOnClickListener{ botonSigno(texto) }
        buttonPorcentaje.setOnClickListener{ botonPorcentaje(texto) }
        buttonDivision.setOnClickListener{ botonDivision(texto) }

        sieteBtn.setOnClickListener{ botonSiete(texto) }
        ochoBtn.setOnClickListener{ botonOcho(texto) }
        nueveBtn.setOnClickListener{ botonNueve(texto) }
        cuatroBtn.setOnClickListener{ botonCuatro(texto) }
        cincoBtn.setOnClickListener{ botonCinco(texto) }
        seisBtn.setOnClickListener{ botonSeis(texto) }
        tresBtn.setOnClickListener{ botonTres(texto) }
        dosBtn.setOnClickListener{ botonDos(texto) }
        unoBtn.setOnClickListener{ botonUno(texto) }
        ceroBtn.setOnClickListener{ botonCero(texto) }
        buttonComa.setOnClickListener{ botonComa(texto) }
        buttonMas.setOnClickListener{ botonMas(texto) }
        buttonMenos.setOnClickListener{ botonMenos(texto) }
        buttonIgual.setOnClickListener{ botonIgual(texto) }
        buttonMultiplicar.setOnClickListener{ botonMultiplicar(texto) }
    }

    private fun mostrarOperaciones(datos: String, texto: TextView) {
        val dato1: String =  texto.getText().toString()

        texto.setText(String.format("%s%s", dato1, datos))
    }

    private fun botonMultiplicar(texto: TextView) {
        mostrarOperaciones("*", texto)
    }

    private fun botonIgual(texto: TextView) {
        val numeros:  String =  texto.getText().toString()
        val expression = Expression(numeros)
        val res: String = expression.calculate().toString()
        texto.setText(res)
    }

    private fun botonMenos(texto: TextView) {
        mostrarOperaciones("-", texto)
    }

    private fun botonMas(texto: TextView) {
        mostrarOperaciones("+", texto)
    }

    private fun botonComa(texto: TextView) {
        mostrarOperaciones(",", texto)
    }

    private fun botonCero(texto: TextView) {
        mostrarOperaciones("0", texto)
    }

    private fun botonUno(texto: TextView) {
        mostrarOperaciones("1", texto)
    }

    private fun botonDos(texto: TextView) {
        mostrarOperaciones("2", texto)
    }

    private fun botonTres(texto: TextView) {
        mostrarOperaciones("3", texto)
    }

    private fun botonSeis(texto: TextView) {
        mostrarOperaciones("6", texto)
    }

    private fun botonCinco(texto: TextView) {
        mostrarOperaciones("5", texto)
    }

    private fun botonCuatro(texto: TextView) {
        mostrarOperaciones("4", texto)
    }

    private fun botonNueve(texto: TextView) {
        mostrarOperaciones("9", texto)
    }

    private fun botonOcho(texto: TextView) {
        mostrarOperaciones("8", texto)
    }

    private fun botonSiete(texto: TextView) {
        mostrarOperaciones("7", texto)
    }

    private fun botonDivision(texto: TextView) {
        mostrarOperaciones("/", texto)
    }

    private fun botonPorcentaje(texto: TextView) {
        mostrarOperaciones("%", texto)
    }

    private fun botonSigno(texto: TextView) {
        mostrarOperaciones("+/-", texto)
    }

    private fun botonClear(texto: TextView) {
        texto.text = ""
    }
}