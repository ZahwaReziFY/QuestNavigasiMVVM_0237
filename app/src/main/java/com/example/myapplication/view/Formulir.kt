package com.example.myapplication.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.home), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {},
            )
            HorizontalDivider(
                modifier = Modifier
                    .padding(all = 20.dp)
                    .width(250.dp), thickness = Thickness, color = Color.Red
            )
            Row {
                jenisK.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = false,
                            onClick = { item }
                        )
                        Text(text = item)
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(all = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .width(250.dp),
                label = { Text(text = "Alamat") },
                onValueChange = {},
            )
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                modifier = Modifier.fillMaxWidth(fraction = 1f)
                    .padding(all = 25.dp),
                onClick = OnSubmitBtnClick
            ) {
                Text(stringResource(id = R.string.submit))
            }
        }
    }
}