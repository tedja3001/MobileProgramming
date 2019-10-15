// Generated by data binding compiler. Do not edit!
package com.github.sutedjathehoping.forestapple.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.sutedjathehoping.forestapple.GameFragment;
import com.github.sutedjathehoping.forestapple.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentGameBinding extends ViewDataBinding {
  @NonNull
  public final Button actionButton;

  @NonNull
  public final RadioButton actionOne;

  @NonNull
  public final RadioButton actionThree;

  @NonNull
  public final RadioButton actionTwo;

  @NonNull
  public final RadioGroup actions;

  @NonNull
  public final ScrollView scrollView;

  @Bindable
  protected GameFragment mScene;

  protected FragmentGameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button actionButton, RadioButton actionOne, RadioButton actionThree, RadioButton actionTwo,
      RadioGroup actions, ScrollView scrollView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionButton = actionButton;
    this.actionOne = actionOne;
    this.actionThree = actionThree;
    this.actionTwo = actionTwo;
    this.actions = actions;
    this.scrollView = scrollView;
  }

  public abstract void setScene(@Nullable GameFragment scene);

  @Nullable
  public GameFragment getScene() {
    return mScene;
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGameBinding>inflateInternal(inflater, R.layout.fragment_game, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGameBinding>inflateInternal(inflater, R.layout.fragment_game, null, false, component);
  }

  public static FragmentGameBinding bind(@NonNull View view) {
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
  public static FragmentGameBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGameBinding)bind(component, view, R.layout.fragment_game);
  }
}