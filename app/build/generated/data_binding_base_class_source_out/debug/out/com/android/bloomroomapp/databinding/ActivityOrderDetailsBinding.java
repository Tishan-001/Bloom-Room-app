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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.bloomroomapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrderDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView address;

  @NonNull
  public final TextView date;

  @NonNull
  public final ImageView detaislBackBtn;

  @NonNull
  public final TextView medicineName;

  @NonNull
  public final RecyclerView productList;

  @NonNull
  public final RelativeLayout relativeLayout1;

  @NonNull
  public final TextView status;

  @NonNull
  public final TextView totalPrice;

  private ActivityOrderDetailsBinding(@NonNull LinearLayout rootView, @NonNull TextView address,
      @NonNull TextView date, @NonNull ImageView detaislBackBtn, @NonNull TextView medicineName,
      @NonNull RecyclerView productList, @NonNull RelativeLayout relativeLayout1,
      @NonNull TextView status, @NonNull TextView totalPrice) {
    this.rootView = rootView;
    this.address = address;
    this.date = date;
    this.detaislBackBtn = detaislBackBtn;
    this.medicineName = medicineName;
    this.productList = productList;
    this.relativeLayout1 = relativeLayout1;
    this.status = status;
    this.totalPrice = totalPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.detaisl_backBtn;
      ImageView detaislBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (detaislBackBtn == null) {
        break missingId;
      }

      id = R.id.medicine_name;
      TextView medicineName = ViewBindings.findChildViewById(rootView, id);
      if (medicineName == null) {
        break missingId;
      }

      id = R.id.product_list;
      RecyclerView productList = ViewBindings.findChildViewById(rootView, id);
      if (productList == null) {
        break missingId;
      }

      id = R.id.relativeLayout1;
      RelativeLayout relativeLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout1 == null) {
        break missingId;
      }

      id = R.id.status;
      TextView status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      id = R.id.total_price;
      TextView totalPrice = ViewBindings.findChildViewById(rootView, id);
      if (totalPrice == null) {
        break missingId;
      }

      return new ActivityOrderDetailsBinding((LinearLayout) rootView, address, date, detaislBackBtn,
          medicineName, productList, relativeLayout1, status, totalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}