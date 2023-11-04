package com.example.cardviewinjpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardviewinjpack.ui.theme.CardViewInJpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setUi()
        }
    }


    @Composable
    fun setUi() {
        Card(
            modifier = Modifier
                .padding(40.dp),

            elevation = CardDefaults
                .elevatedCardElevation(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),

                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                )
                Text(
                    text = "ANDROID",
                    color = Color.Red,
                    fontSize = 20.sp,

                    modifier = Modifier
                        .padding(start = 20.dp)

                )
                Button(
                    onClick = {
                        Toast.makeText(
                            this@MainActivity,
                            "Test Application",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier
                        .height(60.dp)
                        .width(200.dp)
                        .padding(top = 3.dp, start = 20.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray
                    )

                ) {
                    Text(
                        text = "ANDROID",
                        color = Color.Red,
                        fontSize = 12.sp,

                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp)

                    )

                }
                Column(
                    modifier = Modifier
                        .width(250.dp)
                        .height(250.dp)
                        .padding(top = 5.dp, start = 20.dp)
                        .background(
                            Brush.sweepGradient(
//                                listOf(
//                                    Color.Red,
//                                    Color.Blue,
//                                    Color.Green
//                                )
//                                Pair(0.2f,Color.Red),
//                                Pair(0.3f, Color.Green),
//                                Pair(0.5f,Color.Magenta)
                                listOf(
                                    Color.Transparent,
                                    Color.Black
                                )
                            )
                        )
                ) {

                    {

                    }
                }

            }

        }


    }

    @Preview(
        showBackground = true,
        name = "Test",
        showSystemUi = true,
        // device = Devices.NEXUS_10
    )
    @Composable
    fun setPreview() {
        setUi()

    }
}

// fun test():Pair<Int,String>{
//     return Pair(120,"m")
// }


//fun test(value: Pair<Int,String>){
//
//}