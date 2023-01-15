package ucne.edu.ocupaciones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ucne.edu.ocupaciones.ui.Registro.Personas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Ocupaciones()
            Personas()
        }
    }
}
