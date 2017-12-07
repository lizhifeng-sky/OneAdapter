package lzf.one.adapter;

import android.view.View;
import android.widget.Toast;

/**
 *
 * @author lizhifeng
 * @date 2017/12/7 0007
 */

public class UserInfo implements BindAdapterType {
    private String name;
    private String age;

    public UserInfo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void clickName(View view) {
        Toast.makeText(view.getContext(), name, Toast.LENGTH_SHORT).show();
    }

    public void clickAge(View view) {
        Toast.makeText(view.getContext(), age, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getType() {
        return R.layout.user_item;
    }

    @Override
    public int getId() {
        return BR.user;
    }
}
