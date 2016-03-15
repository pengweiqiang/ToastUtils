package toast.util.com.toastutil;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import toast.util.com.toastutil.utils.ToastUtils;

/**
 * 重复显示Toast
 */
public class MainActivity extends AppCompatActivity {

    Button mBtnToastBefore,//有问题的Toast
            mBtnToastAfter;//解决重复显示的Toast
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtnToastBefore = (Button) findViewById(R.id.btn_toast_before);
        mBtnToastBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ;i < 10;i ++){
                    Toast.makeText(MainActivity.this, "before "+i, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtnToastAfter = (Button) findViewById(R.id.btn_toast_after);
        mBtnToastAfter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //模拟重复点击10次
                for (int i = 0 ;i < 10;i++){
                    ToastUtils.showToast(MainActivity.this, "after " + i, Toast.LENGTH_LONG);
                }
            }
        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }




}
