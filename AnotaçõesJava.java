// Autor :Ednilson Queiroz de Castro
// Anotações Java para criação de aplicativos
// Data : 22/03/2018


/*

findViewById - Usado para recuperar um id na tela

Ex: atributo     item      classeJava  complemento   
    idBtnJogar = (Button) findViewById(R.id.idBtnJogar)

____________________________________________________________________________________________________________
setOnClickListener  - Um evento ao click do botão. 
Ex: 

   idBtnJogar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Random random = new Random();

                 int numeroAleatorio = random.nextInt(11);

                 idResultado.setText("Numero escolhido e :'"  + numeroAleatorio);
             }

__________________________________________________________________________________________________________

//Recuperar oque foi digitado

 String textoDigitado = idText.getText().toString();


 isEmpty() -  Verificar se a string estar vazia

 Integer.parseInt - tranforma um string em um valor inteiro



*/