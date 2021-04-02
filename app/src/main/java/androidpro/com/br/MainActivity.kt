package androidpro.com.br

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var edtValorTemp: EditText
    lateinit var celciusRadio: RadioButton
    lateinit var fahreinheitRadio: RadioButton
    lateinit var converterButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtValorTemp = findViewById(R.id.edtValorTemp)
        celciusRadio = findViewById(R.id.celciusRadio)
        fahreinheitRadio = findViewById(R.id.fahreinheitRadio)
        converterButton = findViewById(R.id.converterButton)

        converterButton.setOnClickListener { converter(it) }
    }

    fun converter(view: View) {
        var temp: Double = edtValorTemp.text.toString().toDouble()

        if (celciusRadio.isChecked) {
            temp = (temp - 32) * 5/9
        } else if (fahreinheitRadio.isChecked) {
            temp = temp * 9/5 + 32
        }

        edtValorTemp.setText(temp.toString())
    }
}
