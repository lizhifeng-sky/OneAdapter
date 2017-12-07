package lzf.one.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhifeng on 2017/12/7 0007.
 */

public class UserViewModel {
    private List<UserInfo> userInfoList;

    public UserViewModel() {
        this.userInfoList = new ArrayList<>();
    }

    public List<UserInfo> getUserInfoList(){
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        userInfoList.add(new UserInfo("张三","25岁"));
        return userInfoList;
    }
}
