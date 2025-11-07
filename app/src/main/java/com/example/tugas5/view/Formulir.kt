package com.example.tugas5.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanTampilData(
    peserta: Peserta,
    onBackBtnClick: () -> Unit,
){
    val blueTheme = Color(0xFF673AB7)

    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Fahmi"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Lelaki"),
        Pair(stringResource(id = R.string.status_kawin), "Duda anak 2"),
        Pair(stringResource(id = R.string.alamat), "Dubai")
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.form_pend), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = blueTheme
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items.forEach { item ->
                    Column {
                        Text(
                            text = item.first.uppercase(),
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 20.sp
                        )
                    }
                    HorizontalDivider(thickness = 1.dp, color = blueTheme.copy(alpha = 0.5f))
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .height(56.dp),
                onClick = onBackBtnClick,
                colors = ButtonDefaults.buttonColors(containerColor = blueTheme)
            ) {
                Text(text = "KEMBALI KE DAFTAR", fontSize = 18.sp)
            }
        }
    }
}