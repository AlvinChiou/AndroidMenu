package com.example.AndroidMenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        /*Line 20 to 21: 呼叫getMenuInflater()取得MenuInflater物件，
        * 此物件能呼叫inflate()方法載入menu.xml資源檔案，將檔案內容轉化為
        * 顯示在畫面上Menu*/
        return true; //寫false不會彈出選單
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Line29:使用者選取項目時，會將被選取的MenuItem元件傳遞給item參數。
        String msg = "";
        switch(item.getItemId()){
            case R.id.yangmingshan:
                msg = getString(R.string.yangmingshan);
                break;
            case R.id.yushan:
                msg = getString(R.string.yushan);
                break;
            case R.id.taroko:
                msg = getString(R.id.taroko);
                break;
            case R.id.myloc:
                msg = getString(R.id.myloc);
                break;
            case R.id.exit:
                msg = getString(R.id.exit);
                break;
            default:
            return super.onOptionsItemSelected(item);
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        return true;
    }
}
