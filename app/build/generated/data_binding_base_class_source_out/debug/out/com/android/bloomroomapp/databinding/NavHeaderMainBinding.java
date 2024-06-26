// Generated by view binder compiler. Do not edit!
package com.android.bloomroomapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.bloomroomapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavHeaderMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleImageView layoutProfilePictureImagePreferred;

  @NonNull
  public final CircleImageView navEditProfileButton;

  @NonNull
  public final ProgressBar profileProgressBar;

  @NonNull
  public final TextView usernameDrawer;

  private NavHeaderMainBinding(@NonNull LinearLayout rootView,
      @NonNull CircleImageView layoutProfilePictureImagePreferred,
      @NonNull CircleImageView navEditProfileButton, @NonNull ProgressBar profileProgressBar,
      @NonNull TextView usernameDrawer) {
    this.rootView = rootView;
    this.layoutProfilePictureImagePreferred = layoutProfilePictureImagePreferred;
    this.navEditProfileButton = navEditProfileButton;
    this.profileProgressBar = profileProgressBar;
    this.usernameDrawer = usernameDrawer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_header_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavHeaderMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layout_profile_picture_image_preferred;
      CircleImageView layoutProfilePictureImagePreferred = ViewBindings.findChildViewById(rootView, id);
      if (layoutProfilePictureImagePreferred == null) {
        break missingId;
      }

      id = R.id.nav_edit_profile_button;
      CircleImageView navEditProfileButton = ViewBindings.findChildViewById(rootView, id);
      if (navEditProfileButton == null) {
        break missingId;
      }

      id = R.id.profile_progress_bar;
      ProgressBar profileProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (profileProgressBar == null) {
        break missingId;
      }

      id = R.id.username_drawer;
      TextView usernameDrawer = ViewBindings.findChildViewById(rootView, id);
      if (usernameDrawer == null) {
        break missingId;
      }

      return new NavHeaderMainBinding((LinearLayout) rootView, layoutProfilePictureImagePreferred,
          navEditProfileButton, profileProgressBar, usernameDrawer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
