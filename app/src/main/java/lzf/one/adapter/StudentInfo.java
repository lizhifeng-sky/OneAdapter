package lzf.one.adapter;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by lizhifeng on 2017/12/7 0007.
 */

public class StudentInfo implements BindAdapterType{
    private int mipmap;
    private String name;
    private String age;

    public StudentInfo(int mipmap, String name, String age) {
        this.mipmap = mipmap;
        this.name = name;
        this.age = age;
    }

    public int getMipmap() {
        return mipmap;
    }

    public void setMipmap(int mipmap) {
        this.mipmap = mipmap;
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

    @BindingAdapter("mipmap")
    public static void setUserInfoAvtor(ImageView imageView, int mipmap) {
        imageView.setImageResource(mipmap);
    }
    @Override
    public int getType() {
        return R.layout.student_item;
    }

    @Override
    public int getId() {
        return BR.student;
    }
}
