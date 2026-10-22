package com.example.myapplication.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(
                title = {Text(stringResource(id=R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700))
            ) }