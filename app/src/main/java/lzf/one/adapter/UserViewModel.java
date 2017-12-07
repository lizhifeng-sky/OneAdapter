package lzf.one.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhifeng on 2017/12/7 0007.
 */

public class UserViewModel {
    private List<BindAdapterType> userInfoList;

    public UserViewModel() {
        this.userInfoList = new ArrayList<>();
    }

    public List<BindAdapterType> getUserInfoList(){
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new StudentInfo(R.mipmap.ic_launcher_round,"学生","15岁"));
        return userInfoList;
    }
}
