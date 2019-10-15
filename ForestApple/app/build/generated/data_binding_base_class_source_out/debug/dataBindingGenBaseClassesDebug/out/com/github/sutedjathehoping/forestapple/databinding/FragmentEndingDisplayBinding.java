// Generated by data binding compiler. Do not edit!
package com.github.sutedjathehoping.forestapple.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.sutedjathehoping.forestapple.EndingDisplay;
import com.github.sutedjathehoping.forestapple.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEndingDisplayBinding extends ViewDataBinding {
  @Bindable
  protected EndingDisplay mEndingDisplay;

  protected FragmentEndingDisplayBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setEndingDisplay(@Nullable EndingDisplay endingDisplay);

  @Nullable
  public EndingDisplay getEndingDisplay() {
    return mEndingDisplay;
  }

  @NonNull
  public static FragmentEndingDisplayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_ending_display, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEndingDisplayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEndingDisplayBinding>inflateInternal(inflater, R.layout.fragment_ending_display, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEndingDisplayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_ending_display, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEndingDisplayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEndingDisplayBinding>inflateInternal(inflater, R.layout.fragment_ending_display, null, false, component);
  }

  public static FragmentEndingDisplayBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentEndingDisplayBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEndingDisplayBinding)bind(component, view, R.layout.fragment_ending_display);
  }
}