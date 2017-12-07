package lzf.one.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import lzf.one.adapter.databinding.UserItemBinding;

/**
 *
 * @author lizhifeng
 * @date 2017/12/7 0007
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private Context context;
    private List<? extends BindAdapterType> userInfoList;

    MyAdapter(Context context, List<UserInfo> userInfoList) {
        this.context = context;
        this.userInfoList = userInfoList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(DataBindingUtil.
                inflate(LayoutInflater.from(context),
                        viewType,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.getViewDataBinding().setVariable(userInfoList.get(position).getId(),userInfoList.get(position));
        holder.getViewDataBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return userInfoList==null?0:userInfoList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return userInfoList.get(position).getType();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ViewDataBinding viewDataBinding;
        MyViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            this.viewDataBinding=viewDataBinding;
        }

        ViewDataBinding getViewDataBinding() {
            return viewDataBinding;
        }
    }
}
