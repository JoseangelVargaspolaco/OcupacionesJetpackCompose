package ucne.edu.ocupaciones.ui.Registro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import ucne.edu.ocupaciones.R

@Composable
fun Ocupaciones() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        /*Ir al MainActivity para cambiar de registro*/
        OcupacionesCase()
    }
}

@Preview(showSystemUi = true)
@Composable
fun OcupacionesCase() {
    Column(modifier = Modifier) {
        Spacer(modifier = Modifier.padding(110.dp))
        Text(
            text = "Registro de ocupaciones", fontSize = 27.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(20.dp))
        DescripciónCase(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(4.dp))
        SalarioCase(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(8.dp))
        GuardarButton(Modifier.align(Alignment.CenterHorizontally))
    }
}

@Composable
fun DescripciónCase(modifier: Modifier) {

    var textfieldSize by remember { mutableStateOf(Size.Zero) }
    var selectedText by remember { mutableStateOf("") }

    OutlinedTextField(
        value = selectedText,
        onValueChange = { selectedText = it },
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(5.dp)
            .onGloballyPositioned { coordinates ->
                textfieldSize = coordinates.size.toSize()
            },
        label = { Text("Descripción", fontSize = 19.sp) }
    )
}

@Composable
fun SalarioCase(modifier: Modifier) {

    var textfieldSize by remember { mutableStateOf(Size.Zero) }
    var selectedText by remember { mutableStateOf("") }

    OutlinedTextField(
        value = selectedText,
        onValueChange = { selectedText = it },
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(5.dp)
            .onGloballyPositioned { coordinates ->
                //This value is used to assign to the DropDown the same width
                textfieldSize = coordinates.size.toSize()
            },
        label = { Text("Salario", fontSize = 19.sp) },
    )
}

@Composable
fun GuardarButton(modifier: Modifier) {
    Button(
        onClick = { },
        modifier = Modifier
            .height(64.dp)
            .padding(5.dp)
            .fillMaxSize()
            .width(50.dp),
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFD5A20AA),
            contentColor = Color.White,
            disabledContentColor = Color.White,
        ),
    ) {
        Image(

            painter = painterResource(id = R.drawable.save),
            contentDescription = "Header",
            modifier = modifier
        )
        Text(text = " Guardar", modifier = modifier, fontSize = 20.sp)
    }
}




