import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import com.example.myfirstjatpackcompose.Odevler.Harcama
import com.example.myfirstjatpackcompose.Odevler.Odev3Classes
import com.example.myfirstjatpackcompose.R


@Composable
fun Odev3Page() {
    val current_user = Odev3Classes("Selman", "Atabek", 23, "Endüstri Mühendisi")
    val bakiye = 1250.75
    val harcamalar = listOf(
        Harcama("15 Ağustos 2024", "Market Alışverişi", -150.75),
        Harcama("12 Ağustos 2024", "Restoran", -45.50),
        Harcama("10 Ağustos 2024", "Akaryakıt", -200.00)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,

                    modifier = Modifier.padding(16.dp).fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .background(Color.Gray),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "${current_user.ad} ${current_user.soyad}",
                        style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "${current_user.edu} , ${current_user.yas} yaşında",
                        style = TextStyle(fontSize = 16.sp),
                        color = Color.Gray,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 24.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Bakiye: ₺$bakiye",
                        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                        color = Color(0xFF6200EE)
                    )

                }
            }
            Text(
                text = "Son Harcamalar",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                color = Color.Black,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Column(modifier = Modifier.fillMaxWidth()) {
                harcamalar.forEach { harcama ->
                    Card(
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(text = harcama.tarih, color = Color.Gray)
                                Text(text = harcama.aciklama, color = Color.Black)
                            }
                            Text(
                                text = "₺${harcama.tutar}",
                                color = if (harcama.tutar < 0) Color.Red else Color.Green,
                                style = TextStyle(fontWeight = FontWeight.Bold)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOdev3Page() {
    Odev3Page()
}
