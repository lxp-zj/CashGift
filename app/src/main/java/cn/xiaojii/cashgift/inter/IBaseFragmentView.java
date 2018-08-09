package cn.xiaojii.cashgift.inter;

import android.content.Context;

import java.util.List;

/**
 * @author dmrfcoder
 * @date 2018/8/2
 */

public interface IBaseFragmentView  {

    /**
     * 更新数据list，泛型
     *
     * @param classList
     */
    void updateData(List<Class> classList);


    /**
     *新增条目
     * @param context
     * @param tag
     */
    void showAddProjectFragmentDialog(Context context, String tag);
}
