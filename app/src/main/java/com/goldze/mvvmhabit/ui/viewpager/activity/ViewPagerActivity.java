package com.goldze.mvvmhabit.ui.viewpager.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;

import com.goldze.mvvmhabit.BR;
import com.goldze.mvvmhabit.R;
import com.goldze.mvvmhabit.databinding.FragmentViewpagerBinding;
import com.goldze.mvvmhabit.ui.viewpager.vm.ViewPagerViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * ViewPager绑定的例子, 更多绑定方式，请参考 https://github.com/evant/binding-collection-adapter
 * Created by goldze on 2018/7/18.
 */

public class ViewPagerActivity extends BaseActivity<FragmentViewpagerBinding, ViewPagerViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.fragment_viewpager;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {
        // 使用 TabLayout 和 ViewPager 相关联
        binding.tabs.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
    }

    @Override
    public void initViewObservable() {
        viewModel.addPage();
    }
}
