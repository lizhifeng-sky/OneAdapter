package lzf.one.adapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import lzf.one.adapter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBind;
    private UserViewModel userViewModel;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBind.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBind.recycler.setVisibility(View.VISIBLE);
            }
        });
        mBind.recycler.setLayoutManager(new LinearLayoutManager(this));
        userViewModel=new UserViewModel();
        adapter=new MyAdapter(this,userViewModel.getUserInfoList());
        mBind.recycler.setAdapter(adapter);
    }
}
