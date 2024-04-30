// Generated by view binder compiler. Do not edit!
package com.android.bloomroomapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.bloomroomapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView forgetPass;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final AppCompatButton loginBtn;

  @NonNull
  public final EditText loginEmail;

  @NonNull
  public final EditText loginPass;

  @NonNull
  public final ProgressBar loginProgressBar;

  @NonNull
  public final TextView loginResults;

  @NonNull
  public final Button loginSignupBtn;

  @NonNull
  public final ImageView managerPortalBtn;

  @NonNull
  public final TextView usertypeLogin;

  private ActivityLoginBinding(@NonNull RelativeLayout rootView, @NonNull TextView forgetPass,
      @NonNull ImageView imageView, @NonNull LinearLayout linearLayout4,
      @NonNull AppCompatButton loginBtn, @NonNull EditText loginEmail, @NonNull EditText loginPass,
      @NonNull ProgressBar loginProgressBar, @NonNull TextView loginResults,
      @NonNull Button loginSignupBtn, @NonNull ImageView managerPortalBtn,
      @NonNull TextView usertypeLogin) {
    this.rootView = rootView;
    this.forgetPass = forgetPass;
    this.imageView = imageView;
    this.linearLayout4 = linearLayout4;
    this.loginBtn = loginBtn;
    this.loginEmail = loginEmail;
    this.loginPass = loginPass;
    this.loginProgressBar = loginProgressBar;
    this.loginResults = loginResults;
    this.loginSignupBtn = loginSignupBtn;
    this.managerPortalBtn = managerPortalBtn;
    this.usertypeLogin = usertypeLogin;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.forget_pass;
      TextView forgetPass = ViewBindings.findChildViewById(rootView, id);
      if (forgetPass == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.login_btn;
      AppCompatButton loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.login_email;
      EditText loginEmail = ViewBindings.findChildViewById(rootView, id);
      if (loginEmail == null) {
        break missingId;
      }

      id = R.id.login_pass;
      EditText loginPass = ViewBindings.findChildViewById(rootView, id);
      if (loginPass == null) {
        break missingId;
      }

      id = R.id.login_progress_bar;
      ProgressBar loginProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (loginProgressBar == null) {
        break missingId;
      }

      id = R.id.login_results;
      TextView loginResults = ViewBindings.findChildViewById(rootView, id);
      if (loginResults == null) {
        break missingId;
      }

      id = R.id.login_signup_btn;
      Button loginSignupBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginSignupBtn == null) {
        break missingId;
      }

      id = R.id.manager_portal_btn;
      ImageView managerPortalBtn = ViewBindings.findChildViewById(rootView, id);
      if (managerPortalBtn == null) {
        break missingId;
      }

      id = R.id.usertype_login;
      TextView usertypeLogin = ViewBindings.findChildViewById(rootView, id);
      if (usertypeLogin == null) {
        break missingId;
      }

      return new ActivityLoginBinding((RelativeLayout) rootView, forgetPass, imageView,
          linearLayout4, loginBtn, loginEmail, loginPass, loginProgressBar, loginResults,
          loginSignupBtn, managerPortalBtn, usertypeLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}