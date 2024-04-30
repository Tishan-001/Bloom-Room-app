// Generated by view binder compiler. Do not edit!
package com.android.bloomroomapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.bloomroomapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCheckOutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView addressCardView;

  @NonNull
  public final View card1Div;

  @NonNull
  public final TextView card1T1;

  @NonNull
  public final TextView card1T2;

  @NonNull
  public final TextView card1T4;

  @NonNull
  public final TextView card1T6;

  @NonNull
  public final TextView card2T1;

  @NonNull
  public final TextView card2T4;

  @NonNull
  public final TextView card2T5;

  @NonNull
  public final EditText checkoutAddressView;

  @NonNull
  public final ImageView checkoutBackBtn;

  @NonNull
  public final TextView checkoutBtn;

  @NonNull
  public final RelativeLayout checkoutBtnLayout;

  @NonNull
  public final EditText checkoutCommentView;

  @NonNull
  public final TextView checkoutOrderPriceView;

  @NonNull
  public final TextView checkoutShippingPriceView;

  @NonNull
  public final TextView checkoutTotalPriceView;

  @NonNull
  public final RelativeLayout deliveryChargesLayout;

  @NonNull
  public final TextView medicineName;

  @NonNull
  public final RadioButton pinkRadioButton;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RelativeLayout relativeLayout1;

  @NonNull
  public final RelativeLayout totalPriceView;

  @NonNull
  public final RadioButton whiteRadioButton;

  private ActivityCheckOutBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView addressCardView, @NonNull View card1Div, @NonNull TextView card1T1,
      @NonNull TextView card1T2, @NonNull TextView card1T4, @NonNull TextView card1T6,
      @NonNull TextView card2T1, @NonNull TextView card2T4, @NonNull TextView card2T5,
      @NonNull EditText checkoutAddressView, @NonNull ImageView checkoutBackBtn,
      @NonNull TextView checkoutBtn, @NonNull RelativeLayout checkoutBtnLayout,
      @NonNull EditText checkoutCommentView, @NonNull TextView checkoutOrderPriceView,
      @NonNull TextView checkoutShippingPriceView, @NonNull TextView checkoutTotalPriceView,
      @NonNull RelativeLayout deliveryChargesLayout, @NonNull TextView medicineName,
      @NonNull RadioButton pinkRadioButton, @NonNull RadioGroup radioGroup,
      @NonNull RelativeLayout relativeLayout1, @NonNull RelativeLayout totalPriceView,
      @NonNull RadioButton whiteRadioButton) {
    this.rootView = rootView;
    this.addressCardView = addressCardView;
    this.card1Div = card1Div;
    this.card1T1 = card1T1;
    this.card1T2 = card1T2;
    this.card1T4 = card1T4;
    this.card1T6 = card1T6;
    this.card2T1 = card2T1;
    this.card2T4 = card2T4;
    this.card2T5 = card2T5;
    this.checkoutAddressView = checkoutAddressView;
    this.checkoutBackBtn = checkoutBackBtn;
    this.checkoutBtn = checkoutBtn;
    this.checkoutBtnLayout = checkoutBtnLayout;
    this.checkoutCommentView = checkoutCommentView;
    this.checkoutOrderPriceView = checkoutOrderPriceView;
    this.checkoutShippingPriceView = checkoutShippingPriceView;
    this.checkoutTotalPriceView = checkoutTotalPriceView;
    this.deliveryChargesLayout = deliveryChargesLayout;
    this.medicineName = medicineName;
    this.pinkRadioButton = pinkRadioButton;
    this.radioGroup = radioGroup;
    this.relativeLayout1 = relativeLayout1;
    this.totalPriceView = totalPriceView;
    this.whiteRadioButton = whiteRadioButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCheckOutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCheckOutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_check_out, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCheckOutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address_card_view;
      CardView addressCardView = ViewBindings.findChildViewById(rootView, id);
      if (addressCardView == null) {
        break missingId;
      }

      id = R.id.card1_div;
      View card1Div = ViewBindings.findChildViewById(rootView, id);
      if (card1Div == null) {
        break missingId;
      }

      id = R.id.card1_t1;
      TextView card1T1 = ViewBindings.findChildViewById(rootView, id);
      if (card1T1 == null) {
        break missingId;
      }

      id = R.id.card1_t2;
      TextView card1T2 = ViewBindings.findChildViewById(rootView, id);
      if (card1T2 == null) {
        break missingId;
      }

      id = R.id.card1_t4;
      TextView card1T4 = ViewBindings.findChildViewById(rootView, id);
      if (card1T4 == null) {
        break missingId;
      }

      id = R.id.card1_t6;
      TextView card1T6 = ViewBindings.findChildViewById(rootView, id);
      if (card1T6 == null) {
        break missingId;
      }

      id = R.id.card2_t1;
      TextView card2T1 = ViewBindings.findChildViewById(rootView, id);
      if (card2T1 == null) {
        break missingId;
      }

      id = R.id.card2_t4;
      TextView card2T4 = ViewBindings.findChildViewById(rootView, id);
      if (card2T4 == null) {
        break missingId;
      }

      id = R.id.card2_t5;
      TextView card2T5 = ViewBindings.findChildViewById(rootView, id);
      if (card2T5 == null) {
        break missingId;
      }

      id = R.id.checkout_address_view;
      EditText checkoutAddressView = ViewBindings.findChildViewById(rootView, id);
      if (checkoutAddressView == null) {
        break missingId;
      }

      id = R.id.checkout_back_btn;
      ImageView checkoutBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (checkoutBackBtn == null) {
        break missingId;
      }

      id = R.id.checkout_btn;
      TextView checkoutBtn = ViewBindings.findChildViewById(rootView, id);
      if (checkoutBtn == null) {
        break missingId;
      }

      id = R.id.checkout_btn_layout;
      RelativeLayout checkoutBtnLayout = ViewBindings.findChildViewById(rootView, id);
      if (checkoutBtnLayout == null) {
        break missingId;
      }

      id = R.id.checkout_comment_view;
      EditText checkoutCommentView = ViewBindings.findChildViewById(rootView, id);
      if (checkoutCommentView == null) {
        break missingId;
      }

      id = R.id.checkout_order_price_view;
      TextView checkoutOrderPriceView = ViewBindings.findChildViewById(rootView, id);
      if (checkoutOrderPriceView == null) {
        break missingId;
      }

      id = R.id.checkout_shipping_price_view;
      TextView checkoutShippingPriceView = ViewBindings.findChildViewById(rootView, id);
      if (checkoutShippingPriceView == null) {
        break missingId;
      }

      id = R.id.checkout_total_price_view;
      TextView checkoutTotalPriceView = ViewBindings.findChildViewById(rootView, id);
      if (checkoutTotalPriceView == null) {
        break missingId;
      }

      id = R.id.delivery_charges_layout;
      RelativeLayout deliveryChargesLayout = ViewBindings.findChildViewById(rootView, id);
      if (deliveryChargesLayout == null) {
        break missingId;
      }

      id = R.id.medicine_name;
      TextView medicineName = ViewBindings.findChildViewById(rootView, id);
      if (medicineName == null) {
        break missingId;
      }

      id = R.id.pink_radio_button;
      RadioButton pinkRadioButton = ViewBindings.findChildViewById(rootView, id);
      if (pinkRadioButton == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.relativeLayout1;
      RelativeLayout relativeLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout1 == null) {
        break missingId;
      }

      id = R.id.total_price_view;
      RelativeLayout totalPriceView = ViewBindings.findChildViewById(rootView, id);
      if (totalPriceView == null) {
        break missingId;
      }

      id = R.id.white_radio_button;
      RadioButton whiteRadioButton = ViewBindings.findChildViewById(rootView, id);
      if (whiteRadioButton == null) {
        break missingId;
      }

      return new ActivityCheckOutBinding((RelativeLayout) rootView, addressCardView, card1Div,
          card1T1, card1T2, card1T4, card1T6, card2T1, card2T4, card2T5, checkoutAddressView,
          checkoutBackBtn, checkoutBtn, checkoutBtnLayout, checkoutCommentView,
          checkoutOrderPriceView, checkoutShippingPriceView, checkoutTotalPriceView,
          deliveryChargesLayout, medicineName, pinkRadioButton, radioGroup, relativeLayout1,
          totalPriceView, whiteRadioButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
