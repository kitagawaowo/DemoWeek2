package pe.edu.upc.demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.upc.demo.ui.theme.DemoTheme

@Composable
fun Login() {
    Column {
        Text(text = "Login")
        TextField(value = "User", onValueChange = {})
        TextField(value = "Password", onValueChange = {})
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign in")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign up")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Forgot password")
        }
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
