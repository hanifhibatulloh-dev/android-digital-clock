package com.example.clocktab

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.*

// Referensi font digital ds_digi
val DigitalFont = FontFamily(
    Font(R.font.ds_digi)
)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Immersive Fullscreen (Menghilangkan semua bar sistem Android)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        // Mencegah layar mati otomatis saat aplikasi terbuka
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        setContent {
            ClockScreen()
        }
    }
}

@Composable
fun ClockScreen() {
    var currentTime by remember { mutableStateOf("") }
    var currentDate by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        while (true) {
            currentTime = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())
            currentDate = SimpleDateFormat("dd MMMM yyyy", Locale("id", "ID")).format(Date())
            delay(1000)
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Tampilan Jam (Besar & Menggunakan Font Digital)
            Text(
                text = currentTime,
                color = Color.White,
                fontSize = 350.sp,
                fontFamily = DigitalFont,
                letterSpacing = (-6).sp,
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Tampilan Tanggal (Sekarang juga ikut menggunakan Font Digital)
            Text(
                text = currentDate.uppercase(),
                color = Color.White.copy(alpha = 0.65f), // Dibuat sedikit redup agar estetik
                fontSize = 24.sp,
                fontFamily = DigitalFont, // <- Baris ini ditambahkan agar tanggal ikut digital
                letterSpacing = 2.sp      // Memberikan sedikit jarak antar huruf tanggal agar mudah dibaca
            )
        }
    }
}