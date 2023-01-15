package ucne.edu.ocupaciones.ui.Registro

import android.app.DatePickerDialog
import android.content.Context
import android.widget.DatePicker
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import ucne.edu.ocupaciones.R
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.toSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalContext
import java.util.*

@Composable
fun Personas(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        CasePersona()
    }
}

@Preview(showSystemUi = true)
@Composable
fun CasePersona() {
    Column(modifier = Modifier){
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            text = "Registro de personas", fontSize = 25.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(14.dp))
        NombresCase(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(1.dp))
        TelefonoCase(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(1.dp))
        CelularCase(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(1.dp))
        EmailCase(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(1.dp))
        DirecciónCase(Modifier.align(Alignment.CenterHorizontally))
        showDatePicker(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(1.dp))
        SelectOcupacionesCase(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(8.dp))
        ButtonGuardar(Modifier.align(Alignment.CenterHorizontally))
    }
}

@Composable
fun showDatePicker(modifier: Modifier) {

    var fecha by rememberSaveable { mutableStateOf("") }
    val anio:Int
    val mes:Int
    val dia:Int

    val mCalendar = Calendar.getInstance()
    anio = mCalendar.get(Calendar.YEAR)
    mes = mCalendar.get(Calendar.MONTH)
    dia = mCalendar.get(Calendar.DAY_OF_MONTH)

    val mDatePickerDialog = DatePickerDialog(
        LocalContext.current,
        {
                _ :DatePicker, anio:Int, mes:Int, dia:Int ->
            fecha = "$dia/${mes+1}/$anio"
        },anio,mes,dia
    )

    Row() {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth()
                .height(70.dp)
                .padding(5.dp),
            value = fecha,
            onValueChange = {fecha = it},
            readOnly = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.DateRange,
                    contentDescription = null,
                    modifier = Modifier
                        .size(33.dp)
                        .padding(4.dp)
                        .clickable {
                            mDatePickerDialog.show()
                        }
                )
            },
            label = {Text(text = "Fecha de nacimiento", fontSize = 19.sp)}
        )
    }

}

@Composable
fun NombresCase(modifier: Modifier){

    var textfieldSize by remember { mutableStateOf(Size.Zero)}

    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(5.dp)
            .onGloballyPositioned { coordinates ->
                //This value is used to assign to the DropDown the same width
                textfieldSize = coordinates.size.toSize()
            },
        label = {Text("Nombres", fontSize = 19.sp)},
    )
}

@Composable
fun TelefonoCase(modifier: Modifier){

    var textfieldSize by remember { mutableStateOf(Size.Zero)}

    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(5.dp)
            .onGloballyPositioned { coordinates ->
                //This value is used to assign to the DropDown the same width
                textfieldSize = coordinates.size.toSize()
            },
        label = {Text("Telefono", fontSize = 19.sp)},
    )
}

@Composable
fun CelularCase(modifier: Modifier){

    var expanded by remember { mutableStateOf(false) }

    var selectedText by remember { mutableStateOf("") }

    var textfieldSize by remember { mutableStateOf(Size.Zero)}

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

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
        label = {Text("Celular", fontSize = 19.sp)}
    )
}

@Composable
fun EmailCase(modifier: Modifier){

    var textfieldSize by remember { mutableStateOf(Size.Zero)}

    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(5.dp)
            .onGloballyPositioned { coordinates ->
                //This value is used to assign to the DropDown the same width
                textfieldSize = coordinates.size.toSize()
            },
        label = {Text("Email", fontSize = 19.sp)}
    )
}

@Composable
fun DirecciónCase(modifier: Modifier){

    var textfieldSize by remember { mutableStateOf(Size.Zero)}

    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(5.dp)
            .onGloballyPositioned { coordinates ->
                //This value is used to assign to the DropDown the same width
                textfieldSize = coordinates.size.toSize()
            },
        label = {Text("Dirección", fontSize = 19.sp)}
    )
}

@Composable
fun SelectOcupacionesCase(modifier: Modifier) {

    var expanded by remember { mutableStateOf(false) }

    val suggestions = listOf("Profesor", "Comediante", "Contable", "Doctor")

    var selectedText by remember { mutableStateOf("") }

    var textfieldSize by remember { mutableStateOf(Size.Zero)}

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

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
            label = {Text("Selecciona ocupaciones", fontSize = 19.sp)},
        trailingIcon = {
            Icon(icon,"contentDescription",
                modifier.clickable { expanded = !expanded })
        }
    )
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false },
        modifier = Modifier
            .width(with(LocalDensity.current){textfieldSize.width.toDp()})
    ) {
        suggestions.forEach { label ->
            DropdownMenuItem(onClick = {
                selectedText = label
                expanded = false
            }) {
                Text(text = label)
            }
        }
    }
}

@Composable
fun ButtonGuardar(modifier: Modifier) {
    Button(
        onClick = { },
        modifier = Modifier
            .height(67.dp)
            .padding(5.dp)
            .fillMaxSize()
            .width(50.dp),
        shape = RoundedCornerShape(20),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFD5A20AA),
            contentColor = Color.White,
            disabledContentColor = Color.White,
        ),
    ) {
        Image(

            painter = painterResource(id = R.drawable.check),
            contentDescription = "Header",
            modifier = modifier
        )
        Text(text = " Guardar", modifier = modifier, fontSize = 20.sp)
    }
}




