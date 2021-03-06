package cn.xiaojii.cashgift.view.inter.fragment;

import java.util.List;

import cn.xiaojii.cashgift.bean.fragment.ProjectBean;

/**
 * @author dmrfcoder
 * @date 2018/8/8
 */

public interface IFriendsAndRelativesItemView {
    /**
     * 更新顶部信息栏
     * @param totalMoney
     * @param inCount
     * @param outCount
     */
    public void updateView(int totalMoney,int inCount,int outCount,String name);

    /**
     * 更新；listview
     * @param projectBeanList
     */
    public void updateListView(List<ProjectBean> projectBeanList);

    /**
     * 更新TextView
     */
     void updateTextView();
}
