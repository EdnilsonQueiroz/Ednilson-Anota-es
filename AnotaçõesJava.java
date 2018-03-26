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


       gerar numero aleatorio

                 Random random = new Random();

                 int numeroAleatorio = random.nextInt(11);

                 idResultado.setText("Numero escolhido e :'"  + numeroAleatorio);
             }

__________________________________________________________________________________________________________

//Recuperar oque foi digitado

 String textoDigitado = idText.getText().toString();


 isEmpty() -  Verificar se a string estar vazia

 Integer.parseInt - tranforma um string em um valor inteiro

____________________________________________________________________________________________

Navegar de uma Activity para outra.


botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SegundaActivity.class));
            }
        });


_______________________________________________________________________________________________________
 Toast - objeto que monstra uma mensagem 

Ex:

 Toast.makeText(getApplicationContext(),"OnStart metodo chamado", Toast.LENGTH_LONG);



________________________________________________________________________________________________________


Recuperar imagem,

Bundle extra = getIntent().getExtras();

        if (extra != null){
            String opcapEscolhida = extra.getString("opcao");
            if (opcapEscolhida.equals("cara")){
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else {
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }



------------------------------------------------------------------------------------------------
Criar Dialog

public class DialogActivity extends AppCompatActivity {

    private Button btnDia;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        btnDia = (Button) findViewById(R.id.btnDiaid);
        
        btnDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                dialog = new AlertDialog.Builder(DialogActivity.this);
                
                dialog.setTitle("Titulo da DiaLog");
                dialog.setMessage("Mensagem da Dialog");
                
                dialog.setCancelable(false);
                
                dialog.setIcon(android.R.drawable.ic_dialog_alert);
                
                dialog.setNegativeButton("Nao",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogActivity.this, "pressionado o botão nao", Toast.LENGTH_LONG).show();
                            }
                        });
                dialog.setPositiveButton("sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogActivity.this, "pressionado o botão sim", Toast.LENGTH_LONG).show();
                            }
                        });
                
                dialog.create();
                dialog.show();
            }
        });

    }
}






















*/
