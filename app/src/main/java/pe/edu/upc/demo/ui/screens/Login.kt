package pe.edu.upc.demo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upc.demo.ui.theme.DemoTheme

@Composable
fun Login() {
    var username = remember { mutableStateOf(TextFieldValue())}
    var password = remember { mutableStateOf(TextFieldValue()) }
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(text = "Login", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = username.value, onValueChange = {}, placeholder = { Text("Username") })
        Spacer(modifier = Modifier.height(20.dp))

        //TextField(value = "", onValueChange = {}, placeholder = { Text("Password") })
        TextField(value = password.value, onValueChange = {}, placeholder = { Text("Username") })
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign in")
        }
        Box(
            modifier = Modifier.padding(40.dp, 0.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(50.dp)
            ) {
                Text(text = "Sign up")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        ClickableText(text = AnnotatedString("Forgot password"), onClick = {})
    }
}

// Default preview to use my functions
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoTheme {
        Login()
    }
}
