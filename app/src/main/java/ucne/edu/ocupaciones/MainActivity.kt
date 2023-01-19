package ucne.edu.ocupaciones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ucne.edu.ocupaciones.ui.Registro.Personas
import java.security.Permission
import ucne.edu.ocupaciones.ui.Registro.Ocupaciones

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scroll = rememberScrollState()
            Column (modifier = Modifier.verticalScroll(scroll)){
                Ocupaciones()
                Personas()
            }
        }
    }
}
