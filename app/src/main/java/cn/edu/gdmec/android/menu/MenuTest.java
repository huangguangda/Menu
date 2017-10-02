package cn.edu.gdmec.android.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MenuTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_menu_test );
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add ( 0, 1, 1, R.string.exit );
        menu.add ( 0, 2, 2, R.string.about );
        //第一种
//        return super.onCreateOptionsMenu ( menu );
        //第二种
        SubMenu subMenu = menu.addSubMenu ( 1, 100, 100, "游戏" );
        subMenu.add ( 2, 3, 3, "铁拳" );
        subMenu.add ( 2, 4, 4, "流行蝴蝶剑" );
        return super.onCreateOptionsMenu ( menu );
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId ()==1)
        {
            finish ();
        }else if (item.getItemId ()==2)
        {
            Toast toast=Toast.makeText ( this,"这是个Menu菜单的练习", Toast.LENGTH_SHORT );
            toast.show ();
        }
        return super.onOptionsItemSelected ( item );
    }
}
