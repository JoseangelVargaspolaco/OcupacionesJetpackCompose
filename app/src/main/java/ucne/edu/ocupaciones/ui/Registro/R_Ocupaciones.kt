package ucne.edu.ocupaciones.ui.Registro

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp
import ucne.edu.ocupaciones.R

@Composable
fun Ocupaciones(){
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
fun OcupacionesCase(){
    Column(modifier = Modifier){
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
fun DescripciónCase(modifier: Modifier){
    TextField(
        value = "Descripción", onValueChange = { },
        modifier = Modifier.border(BorderStroke(2.dp,Color.Gray), RoundedCornerShape(10))
            .fillMaxWidth()
            .height(70.dp)
            .padding(5.dp)
            .width(50.dp),
        placeholder = { Text(text = "Descripción", fontSize = 23.sp) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Transparent,
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun SalarioCase(modifier: Modifier){
    TextField(
        value = "Salario", onValueChange = { },
        modifier = Modifier.border(BorderStroke(2.dp,Color.Gray), RoundedCornerShape(10))
            .height(70.dp)
            .padding(5.dp)
            .fillMaxSize()
            .width(50.dp),
        placeholder = { Text(text = "Salario", fontSize = 23.sp) },
        shape = RoundedCornerShape(10),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Transparent,
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
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




