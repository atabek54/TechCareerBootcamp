package com.example.myfirstjatpackcompose.Odevler

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculaterScreen() {
    var input by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0.0) }
    var operation by remember { mutableStateOf<Char?>(null) }
    var previousValue by remember { mutableStateOf(0.0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Giriş ve Sonuç Alanı
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = input,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = result.toString(),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
        }

        // Numpad ve İşlemler
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            val buttons = listOf(
                listOf("7", "8", "9", "AC"),
                listOf("4", "5", "6", "C"),
                listOf("1", "2", "3", "+"),
                listOf("0", "=",)
            )

            buttons.forEach { row ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    row.forEach { label ->
                        Button(
                            onClick = {
                                when (label) {
                                    "AC" -> {
                                        input = ""
                                        result = 0.0
                                        previousValue = 0.0
                                        operation = null
                                    }
                                    "C" -> input = ""
                                    "=" -> {
                                        val currentValue = input.toDoubleOrNull()
                                        if (currentValue != null) {
                                            when (operation) {
                                                '+' -> result = previousValue + currentValue
                                                '-' -> result = previousValue - currentValue
                                            }
                                            previousValue = result
                                        }
                                        input = result.toString()
                                    }
                                    "+" -> {
                                        val currentValue = input.toDoubleOrNull()
                                        if (currentValue != null) {
                                            previousValue = currentValue
                                        }
                                        operation = '+'
                                        input = ""
                                    }
                                    "-" -> {
                                        val currentValue = input.toDoubleOrNull()
                                        if (currentValue != null) {
                                            previousValue = currentValue
                                        }
                                        operation = '-'
                                        input = ""
                                    }
                                    else -> input += label
                                }
                            },
                            modifier = Modifier
                                .padding(8.dp)
                                .weight(1f)
                        ) {
                            Text(text = label, fontSize = 22.sp)
                        }
                    }
                }
            }
        }
    }
}
