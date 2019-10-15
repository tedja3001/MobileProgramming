package com.github.sutedjathehoping.forestapple;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.github.sutedjathehoping.forestapple.databinding.ActivityMainBindingImpl;
import com.github.sutedjathehoping.forestapple.databinding.FragmentEndingDisplayBindingImpl;
import com.github.sutedjathehoping.forestapple.databinding.FragmentGameBindingImpl;
import com.github.sutedjathehoping.forestapple.databinding.FragmentHowToPlayBindingImpl;
import com.github.sutedjathehoping.forestapple.databinding.FragmentMainMenuBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTENDINGDISPLAY = 2;

  private static final int LAYOUT_FRAGMENTGAME = 3;

  private static final int LAYOUT_FRAGMENTHOWTOPLAY = 4;

  private static final int LAYOUT_FRAGMENTMAINMENU = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.github.sutedjathehoping.forestapple.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.github.sutedjathehoping.forestapple.R.layout.fragment_ending_display, LAYOUT_FRAGMENTENDINGDISPLAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.github.sutedjathehoping.forestapple.R.layout.fragment_game, LAYOUT_FRAGMENTGAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.github.sutedjathehoping.forestapple.R.layout.fragment_how_to_play, LAYOUT_FRAGMENTHOWTOPLAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.github.sutedjathehoping.forestapple.R.layout.fragment_main_menu, LAYOUT_FRAGMENTMAINMENU);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTENDINGDISPLAY: {
          if ("layout/fragment_ending_display_0".equals(tag)) {
            return new FragmentEndingDisplayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_ending_display is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGAME: {
          if ("layout/fragment_game_0".equals(tag)) {
            return new FragmentGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_game is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOWTOPLAY: {
          if ("layout/fragment_how_to_play_0".equals(tag)) {
            return new FragmentHowToPlayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_how_to_play is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAINMENU: {
          if ("layout/fragment_main_menu_0".equals(tag)) {
            return new FragmentMainMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main_menu is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "endingDisplay");
      sKeys.put(2, "scene");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.github.sutedjathehoping.forestapple.R.layout.activity_main);
      sKeys.put("layout/fragment_ending_display_0", com.github.sutedjathehoping.forestapple.R.layout.fragment_ending_display);
      sKeys.put("layout/fragment_game_0", com.github.sutedjathehoping.forestapple.R.layout.fragment_game);
      sKeys.put("layout/fragment_how_to_play_0", com.github.sutedjathehoping.forestapple.R.layout.fragment_how_to_play);
      sKeys.put("layout/fragment_main_menu_0", com.github.sutedjathehoping.forestapple.R.layout.fragment_main_menu);
    }
  }
}
