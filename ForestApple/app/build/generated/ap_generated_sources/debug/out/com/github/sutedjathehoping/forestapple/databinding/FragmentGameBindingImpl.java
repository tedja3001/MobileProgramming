package com.github.sutedjathehoping.forestapple.databinding;
import com.github.sutedjathehoping.forestapple.R;
import com.github.sutedjathehoping.forestapple.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGameBindingImpl extends FragmentGameBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.actions, 6);
        sViewsWithIds.put(R.id.action_button, 7);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioGroup) bindings[6]
            , (android.widget.ScrollView) bindings[0]
            );
        this.actionOne.setTag(null);
        this.actionThree.setTag(null);
        this.actionTwo.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.scrollView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.scene == variableId) {
            setScene((com.github.sutedjathehoping.forestapple.GameFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setScene(@Nullable com.github.sutedjathehoping.forestapple.GameFragment Scene) {
        this.mScene = Scene;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.scene);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<java.lang.String> sceneCurrentSceneActions = null;
        java.lang.String sceneCurrentSceneBody = null;
        com.github.sutedjathehoping.forestapple.MyApplication.Stage sceneCurrentScene = null;
        com.github.sutedjathehoping.forestapple.GameFragment scene = mScene;
        java.lang.String sceneCurrentSceneTitle = null;
        java.lang.String sceneCurrentSceneActions1 = null;
        java.lang.String sceneCurrentSceneActions2 = null;
        java.lang.String sceneCurrentSceneActions0 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (scene != null) {
                    // read scene.currentScene
                    sceneCurrentScene = scene.getCurrentScene();
                }


                if (sceneCurrentScene != null) {
                    // read scene.currentScene.actions
                    sceneCurrentSceneActions = sceneCurrentScene.getActions();
                    // read scene.currentScene.body
                    sceneCurrentSceneBody = sceneCurrentScene.getBody();
                    // read scene.currentScene.title
                    sceneCurrentSceneTitle = sceneCurrentScene.getTitle();
                }


                if (sceneCurrentSceneActions != null) {
                    // read scene.currentScene.actions[1]
                    sceneCurrentSceneActions1 = getFromList(sceneCurrentSceneActions, 1);
                    // read scene.currentScene.actions[2]
                    sceneCurrentSceneActions2 = getFromList(sceneCurrentSceneActions, 2);
                    // read scene.currentScene.actions[0]
                    sceneCurrentSceneActions0 = getFromList(sceneCurrentSceneActions, 0);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actionOne, sceneCurrentSceneActions0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actionThree, sceneCurrentSceneActions2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actionTwo, sceneCurrentSceneActions1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, sceneCurrentSceneTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, sceneCurrentSceneBody);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): scene
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}