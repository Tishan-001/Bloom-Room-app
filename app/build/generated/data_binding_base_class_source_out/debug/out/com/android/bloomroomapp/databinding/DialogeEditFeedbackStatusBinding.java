// Generated by view binder compiler. Do not edit!
package com.android.bloomroomapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.bloomroomapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogeEditFeedbackStatusBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatButton cancelBtn;

  @NonNull
  public final ImageView closeBtn;

  @NonNull
  public final AppCompatButton completedBtn;

  @NonNull
  public final ProgressBar dialogeBar;

  private DialogeEditFeedbackStatusBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatButton cancelBtn, @NonNull ImageView closeBtn,
      @NonNull AppCompatButton completedBtn, @NonNull ProgressBar dialogeBar) {
    this.rootView = rootView;
    this.cancelBtn = cancelBtn;
    this.closeBtn = closeBtn;
    this.completedBtn = completedBtn;
    this.dialogeBar = dialogeBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogeEditFeedbackStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogeEditFeedbackStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialoge_edit_feedback_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogeEditFeedbackStatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_btn;
      AppCompatButton cancelBtn = ViewBindings.findChildViewById(rootView, id);
      if (cancelBtn == null) {
        break missingId;
      }

      id = R.id.close_btn;
      ImageView closeBtn = ViewBindings.findChildViewById(rootView, id);
      if (closeBtn == null) {
        break missingId;
      }

      id = R.id.completed_btn;
      AppCompatButton completedBtn = ViewBindings.findChildViewById(rootView, id);
      if (completedBtn == null) {
        break missingId;
      }

      id = R.id.dialoge_bar;
      ProgressBar dialogeBar = ViewBindings.findChildViewById(rootView, id);
      if (dialogeBar == null) {
        break missingId;
      }

      return new DialogeEditFeedbackStatusBinding((RelativeLayout) rootView, cancelBtn, closeBtn,
          completedBtn, dialogeBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
