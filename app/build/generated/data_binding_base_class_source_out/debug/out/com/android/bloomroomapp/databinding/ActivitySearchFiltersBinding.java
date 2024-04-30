// Generated by view binder compiler. Do not edit!
package com.android.bloomroomapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.bloomroomapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySearchFiltersBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView cartBackArrow;

  @NonNull
  public final LinearLayout catAnniversary;

  @NonNull
  public final LinearLayout catBirthdayflowers;

  @NonNull
  public final LinearLayout catGraduation;

  @NonNull
  public final LinearLayout catHousewarmingflowers;

  @NonNull
  public final LinearLayout catMothersDay;

  @NonNull
  public final LinearLayout catNewBaby;

  @NonNull
  public final LinearLayout catSympathyflowers;

  @NonNull
  public final LinearLayout catValentinesDay;

  @NonNull
  public final TextView idClearBtn;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final RelativeLayout toolbar;

  private ActivitySearchFiltersBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView cartBackArrow, @NonNull LinearLayout catAnniversary,
      @NonNull LinearLayout catBirthdayflowers, @NonNull LinearLayout catGraduation,
      @NonNull LinearLayout catHousewarmingflowers, @NonNull LinearLayout catMothersDay,
      @NonNull LinearLayout catNewBaby, @NonNull LinearLayout catSympathyflowers,
      @NonNull LinearLayout catValentinesDay, @NonNull TextView idClearBtn,
      @NonNull TextView textView4, @NonNull RelativeLayout toolbar) {
    this.rootView = rootView;
    this.cartBackArrow = cartBackArrow;
    this.catAnniversary = catAnniversary;
    this.catBirthdayflowers = catBirthdayflowers;
    this.catGraduation = catGraduation;
    this.catHousewarmingflowers = catHousewarmingflowers;
    this.catMothersDay = catMothersDay;
    this.catNewBaby = catNewBaby;
    this.catSympathyflowers = catSympathyflowers;
    this.catValentinesDay = catValentinesDay;
    this.idClearBtn = idClearBtn;
    this.textView4 = textView4;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySearchFiltersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySearchFiltersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_search_filters, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySearchFiltersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cart_back_arrow;
      ImageView cartBackArrow = ViewBindings.findChildViewById(rootView, id);
      if (cartBackArrow == null) {
        break missingId;
      }

      id = R.id.cat_Anniversary;
      LinearLayout catAnniversary = ViewBindings.findChildViewById(rootView, id);
      if (catAnniversary == null) {
        break missingId;
      }

      id = R.id.cat_Birthdayflowers;
      LinearLayout catBirthdayflowers = ViewBindings.findChildViewById(rootView, id);
      if (catBirthdayflowers == null) {
        break missingId;
      }

      id = R.id.cat_Graduation;
      LinearLayout catGraduation = ViewBindings.findChildViewById(rootView, id);
      if (catGraduation == null) {
        break missingId;
      }

      id = R.id.cat_Housewarmingflowers;
      LinearLayout catHousewarmingflowers = ViewBindings.findChildViewById(rootView, id);
      if (catHousewarmingflowers == null) {
        break missingId;
      }

      id = R.id.cat_MothersDay;
      LinearLayout catMothersDay = ViewBindings.findChildViewById(rootView, id);
      if (catMothersDay == null) {
        break missingId;
      }

      id = R.id.cat_NewBaby;
      LinearLayout catNewBaby = ViewBindings.findChildViewById(rootView, id);
      if (catNewBaby == null) {
        break missingId;
      }

      id = R.id.cat_Sympathyflowers;
      LinearLayout catSympathyflowers = ViewBindings.findChildViewById(rootView, id);
      if (catSympathyflowers == null) {
        break missingId;
      }

      id = R.id.cat_ValentinesDay;
      LinearLayout catValentinesDay = ViewBindings.findChildViewById(rootView, id);
      if (catValentinesDay == null) {
        break missingId;
      }

      id = R.id.id_clear_btn;
      TextView idClearBtn = ViewBindings.findChildViewById(rootView, id);
      if (idClearBtn == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivitySearchFiltersBinding((LinearLayout) rootView, cartBackArrow,
          catAnniversary, catBirthdayflowers, catGraduation, catHousewarmingflowers, catMothersDay,
          catNewBaby, catSympathyflowers, catValentinesDay, idClearBtn, textView4, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
