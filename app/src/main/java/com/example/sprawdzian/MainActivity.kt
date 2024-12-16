package com.example.sprawdzian

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sprawdzian.ui.theme.SprawdzianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen()
        }
    }


}

@Composable
fun Screen() {
    var context = LocalContext.current;
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.user_icon), "User Icon",
                modifier = Modifier
                    .fillMaxHeight()
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(10.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    "Marcel Giemza",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp)
                )
                Text("Git statistics", style = TextStyle(fontSize = 12.sp, color = Color.Gray))
            }
        }
        HorizontalDivider()
        Column (
            modifier = Modifier
                .padding(0.dp, 10.dp)
        ){
            Text(
                "Recent Activities",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp)
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight(0.9f)
            ) { }
        }
        HorizontalDivider()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Button(
                onClick = {
                    Toast.makeText(context, "Well done!", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text("Display Message")
            }
        }
    }
}