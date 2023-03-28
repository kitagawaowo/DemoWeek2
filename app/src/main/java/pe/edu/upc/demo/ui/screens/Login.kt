package pe.edu.upc.demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.upc.demo.ui.theme.DemoTheme

@Composable
fun Login() {
    Column {
        Text(text = "Login")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign in")
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
