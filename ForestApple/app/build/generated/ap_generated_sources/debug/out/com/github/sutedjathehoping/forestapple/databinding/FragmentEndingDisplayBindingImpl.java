package com.github.sutedjathehoping.forestapple.databinding;
import com.github.sutedjathehoping.forestapple.R;
import com.github.sutedjathehoping.forestapple.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEndingDisplayBindingImpl extends FragmentEndingDisplayBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEndingDisplayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentEndingDisplayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.endingDisplay == variableId) {
            setEndingDisplay((com.github.sutedjathehoping.forestapple.EndingDisplay) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEndingDisplay(@Nullable com.github.sutedjathehoping.forestapple.EndingDisplay EndingDisplay) {
        this.mEndingDisplay = EndingDisplay;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.endingDisplay);
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
        com.github.sutedjathehoping.forestapple.EndingDisplay endingDisplay = mEndingDisplay;
        java.lang.String endingDisplayCurrentEndingTitle = null;
        com.github.sutedjathehoping.forestapple.MyApplication.Stage endingDisplayCurrentEnding = null;
        java.lang.String endingDisplayCurrentEndingBody = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (endingDisplay != null) {
                    // read endingDisplay.currentEnding
                    endingDisplayCurrentEnding = endingDisplay.getCurrentEnding();
                }


                if (endingDisplayCurrentEnding != null) {
                    // read endingDisplay.currentEnding.title
                    endingDisplayCurrentEndingTitle = endingDisplayCurrentEnding.getTitle();
                    // read endingDisplay.currentEnding.body
                    endingDisplayCurrentEndingBody = endingDisplayCurrentEnding.getBody();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, endingDisplayCurrentEndingTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, endingDisplayCurrentEndingBody);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): endingDisplay
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}