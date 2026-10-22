package com.example.myapplication.view

import androidx.compose.material3.ExperimentalMaterial3Api

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
) {
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )
    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {Text(text = stringResource(id="Tampilan Data"), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors( containerColor = colorResource(id=R.color.teal_700))
            )
        }){ isiRuang ->
        Column(modifier = Modifier.padding( paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier.padding( all = dimensionResource(id=16dp)),
                verticalArrangement = Arrangement.spacedBy (dimensionResource(id = 10dp))) {
                items.forEach { item ->
                    Column {
                        Text(text = item.first.uppercase(), fontSize = 16.sp)
                        Text(text = item.second, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize
                    }
                    HorizontalDivider(thickness = 1.dp, color = Color.Cyan)
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBackBtnClick) {
                    Text(text = stringResource(id=R.string.back))
                }
            }
        }
    }
}