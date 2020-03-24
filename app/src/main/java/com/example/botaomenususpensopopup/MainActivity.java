package com.example.botaomenususpensopopup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

//Aqui abaixo temos a classe principal "MainActivity" desta activity
public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    //Aqui abaixo temos o método principal "onCreate" desta activite
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Aqui abaixo temos a implementação do método "apresentarMenuSuspenso()" que apresentará os itens de menu
    public void apresentarMenuSuspenso(View view){
        //Aqui abaixo temos a criação de um objeto "popupMenu" do tipo "PopupMenu" que tem como parâmetro o contexto "this" e a
        //visualização "view" da classe "View"
        PopupMenu  popupMenu = new PopupMenu(this, view);
        //O objeto "popupMenu" setará o método "setOnMenuItemClickListener()" que selecionará os itens de menu dentro deste
        //contexto "this"
        popupMenu.setOnMenuItemClickListener(this);
        //Aqui o objeto "popupMenu" setará o método "inflate()" para trazer da referência "R" da aplicação, o arquivo "popup_menu.xml"
        //do diretório "menu" os itens de menu que consta neste arquivo
        popupMenu.inflate(R.menu.popup_menu);
        //Aqui o objeto "popupMenu" setará o método "show()" que exibirá na tela do usuário os itens para serem selecionados ou clicados
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        //return false; <- Este é do código original
        //Aqui abaixo temos um atributo de escolha "switch" que dá opções de escolha para ao usuário da aplicação
        switch(item.getItemId()){
            //Caso a escolha seja relacionada ao "idItem01", ou seja, se este menu foi clicado
            case R.id.idItem01:
                //Aqui será implementada uma mensagem do tipo "Toast -> LENGTH_LONG" que será exibida ao usuário caso seja escolhido
                Toast.makeText(this, "Primeiro Item Clicado!", Toast.LENGTH_LONG).show();
                //Aqui abaixo o retorno é verdadeiro "True", ou seja, o item de menu será apresentado ao usuário
                return true;

            //Caso a escolha seja relacionada ao "idItem01", ou seja, se este menu foi clicado
            case R.id.idItem02:
                //Aqui será implementada uma mensagem do tipo "Toast -> LENGTH_LONG" que será exibida ao usuário caso seja escolhido
                Toast.makeText(this, "Segundo Item Clicado!", Toast.LENGTH_LONG).show();
                //Aqui abaixo o retorno é verdadeiro "True", ou seja, o item de menu será apresentado ao usuário
                return true;

            //Caso a escolha seja relacionada ao "idItem01", ou seja, se este menu foi clicado
            case R.id.idItem03:
                //Aqui será implementada uma mensagem do tipo "Toast -> LENGTH_LONG" que será exibida ao usuário caso seja escolhido
                Toast.makeText(this, "Terceiro Item Clicado!", Toast.LENGTH_LONG).show();
                //Aqui abaixo o retorno é verdadeiro "True", ou seja, o item de menu será apresentado ao usuário
                return true;

            //Caso a escolha seja relacionada ao "idItem01", ou seja, se este menu foi clicado
            case R.id.idItem04:
                //Aqui será implementada uma mensagem do tipo "Toast -> LENGTH_LONG" que será exibida ao usuário caso seja escolhido
                Toast.makeText(this, "Quarto Item Clicado!", Toast.LENGTH_LONG).show();
                //Aqui abaixo o retorno é verdadeiro "True", ou seja, o item de menu será apresentado ao usuário
                return true;

            //Caso a escolha seja relacionada ao "idItem01", ou seja, se este menu foi clicado
            case R.id.idItem05:
                //Aqui será implementada uma mensagem do tipo "Toast -> LENGTH_LONG" que será exibida ao usuário caso seja escolhido
                Toast.makeText(this, "Quinto Item Clicado!", Toast.LENGTH_LONG).show();
                //Aqui abaixo o retorno é verdadeiro "True", ou seja, o item de menu será apresentado ao usuário
                return true;

            //Caso a escolha seja relacionada ao "idItem01", ou seja, se este menu foi clicado
            case R.id.idItem06:
                //Aqui será implementada uma mensagem do tipo "Toast -> LENGTH_LONG" que será exibida ao usuário caso seja escolhido
                Toast.makeText(this, "Sexto Item Clicado!", Toast.LENGTH_LONG).show();
                //Aqui abaixo o retorno é verdadeiro "True", ou seja, o item de menu será apresentado ao usuário
                return true;

            //Caso a escolha seja relacionada ao "idItem01", ou seja, se este menu foi clicado
            case R.id.idItem07:
                //Aqui abaixo temos a criação de um novo objeto "objIntent" do tiço "Intent" que estartará a "SegundaActivity"
                Intent objIntent = new Intent(this, SegundaActivity.class);
                //Aqui abaixo temos o método "startActivity()" que abrirá ou inicializará o objeto "objIntente" que representa
                //a "SegundaActivity"
                startActivity(objIntent);
                //Obs: Com a utilização dos espaços na string abaixo, pode-se organizar as mensagens tipo centralizando-as cada parte
                //Aqui será implementada uma mensagem do tipo "Toast -> LENGTH_LONG" que será exibida ao usuário caso seja escolhido
                Toast.makeText(this, "      Sétimo Item Clicado! \nAbrindo a Segunda Activity", Toast.LENGTH_LONG).show();
                //Aqui abaixo o retorno é verdadeiro "True", ou seja, o item de menu será apresentado ao usuário
                return true;

            //Aqui abaixo temos uma opção "default" que retorna "false" caso nenhum dos itens de menus seja selecionado
            default:
                return false;
        }
    }
}
