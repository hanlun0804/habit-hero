// Generated by view binder compiler. Do not edit!
package habit.habithero.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import habit.habithero.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddHabitBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox cbFri;

  @NonNull
  public final CheckBox cbMon;

  @NonNull
  public final CheckBox cbSat;

  @NonNull
  public final CheckBox cbSun;

  @NonNull
  public final CheckBox cbThu;

  @NonNull
  public final CheckBox cbTue;

  @NonNull
  public final CheckBox cbWed;

  @NonNull
  public final EditText etnsDate;

  @NonNull
  public final EditText etnsTimesDay;

  @NonNull
  public final FloatingActionButton fabAddHabit;

  @NonNull
  public final FloatingActionButton fabBack;

  @NonNull
  public final LinearLayout llDate;

  @NonNull
  public final LinearLayout llDays;

  @NonNull
  public final LinearLayout llTimesDay;

  @NonNull
  public final Spinner sCategory;

  @NonNull
  public final Spinner sFrequency;

  @NonNull
  public final TextInputEditText tietEnterHabit;

  @NonNull
  public final TextInputLayout tilEnterHabit;

  @NonNull
  public final TextView tvCategoryExpl;

  @NonNull
  public final TextView tvDateExpl;

  @NonNull
  public final TextView tvDaysExpl;

  @NonNull
  public final TextView tvFrequencyExpl;

  @NonNull
  public final TextView tvHabitExpl;

  @NonNull
  public final TextView tvHabitTitle;

  @NonNull
  public final TextView tvTimesDayExpl;

  @NonNull
  public final TextView tvWarning;

  private ActivityAddHabitBinding(@NonNull ConstraintLayout rootView, @NonNull CheckBox cbFri,
      @NonNull CheckBox cbMon, @NonNull CheckBox cbSat, @NonNull CheckBox cbSun,
      @NonNull CheckBox cbThu, @NonNull CheckBox cbTue, @NonNull CheckBox cbWed,
      @NonNull EditText etnsDate, @NonNull EditText etnsTimesDay,
      @NonNull FloatingActionButton fabAddHabit, @NonNull FloatingActionButton fabBack,
      @NonNull LinearLayout llDate, @NonNull LinearLayout llDays, @NonNull LinearLayout llTimesDay,
      @NonNull Spinner sCategory, @NonNull Spinner sFrequency,
      @NonNull TextInputEditText tietEnterHabit, @NonNull TextInputLayout tilEnterHabit,
      @NonNull TextView tvCategoryExpl, @NonNull TextView tvDateExpl, @NonNull TextView tvDaysExpl,
      @NonNull TextView tvFrequencyExpl, @NonNull TextView tvHabitExpl,
      @NonNull TextView tvHabitTitle, @NonNull TextView tvTimesDayExpl,
      @NonNull TextView tvWarning) {
    this.rootView = rootView;
    this.cbFri = cbFri;
    this.cbMon = cbMon;
    this.cbSat = cbSat;
    this.cbSun = cbSun;
    this.cbThu = cbThu;
    this.cbTue = cbTue;
    this.cbWed = cbWed;
    this.etnsDate = etnsDate;
    this.etnsTimesDay = etnsTimesDay;
    this.fabAddHabit = fabAddHabit;
    this.fabBack = fabBack;
    this.llDate = llDate;
    this.llDays = llDays;
    this.llTimesDay = llTimesDay;
    this.sCategory = sCategory;
    this.sFrequency = sFrequency;
    this.tietEnterHabit = tietEnterHabit;
    this.tilEnterHabit = tilEnterHabit;
    this.tvCategoryExpl = tvCategoryExpl;
    this.tvDateExpl = tvDateExpl;
    this.tvDaysExpl = tvDaysExpl;
    this.tvFrequencyExpl = tvFrequencyExpl;
    this.tvHabitExpl = tvHabitExpl;
    this.tvHabitTitle = tvHabitTitle;
    this.tvTimesDayExpl = tvTimesDayExpl;
    this.tvWarning = tvWarning;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddHabitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddHabitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_habit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddHabitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cbFri;
      CheckBox cbFri = ViewBindings.findChildViewById(rootView, id);
      if (cbFri == null) {
        break missingId;
      }

      id = R.id.cbMon;
      CheckBox cbMon = ViewBindings.findChildViewById(rootView, id);
      if (cbMon == null) {
        break missingId;
      }

      id = R.id.cbSat;
      CheckBox cbSat = ViewBindings.findChildViewById(rootView, id);
      if (cbSat == null) {
        break missingId;
      }

      id = R.id.cbSun;
      CheckBox cbSun = ViewBindings.findChildViewById(rootView, id);
      if (cbSun == null) {
        break missingId;
      }

      id = R.id.cbThu;
      CheckBox cbThu = ViewBindings.findChildViewById(rootView, id);
      if (cbThu == null) {
        break missingId;
      }

      id = R.id.cbTue;
      CheckBox cbTue = ViewBindings.findChildViewById(rootView, id);
      if (cbTue == null) {
        break missingId;
      }

      id = R.id.cbWed;
      CheckBox cbWed = ViewBindings.findChildViewById(rootView, id);
      if (cbWed == null) {
        break missingId;
      }

      id = R.id.etnsDate;
      EditText etnsDate = ViewBindings.findChildViewById(rootView, id);
      if (etnsDate == null) {
        break missingId;
      }

      id = R.id.etnsTimesDay;
      EditText etnsTimesDay = ViewBindings.findChildViewById(rootView, id);
      if (etnsTimesDay == null) {
        break missingId;
      }

      id = R.id.fabAddHabit;
      FloatingActionButton fabAddHabit = ViewBindings.findChildViewById(rootView, id);
      if (fabAddHabit == null) {
        break missingId;
      }

      id = R.id.fabBack;
      FloatingActionButton fabBack = ViewBindings.findChildViewById(rootView, id);
      if (fabBack == null) {
        break missingId;
      }

      id = R.id.llDate;
      LinearLayout llDate = ViewBindings.findChildViewById(rootView, id);
      if (llDate == null) {
        break missingId;
      }

      id = R.id.llDays;
      LinearLayout llDays = ViewBindings.findChildViewById(rootView, id);
      if (llDays == null) {
        break missingId;
      }

      id = R.id.llTimesDay;
      LinearLayout llTimesDay = ViewBindings.findChildViewById(rootView, id);
      if (llTimesDay == null) {
        break missingId;
      }

      id = R.id.sCategory;
      Spinner sCategory = ViewBindings.findChildViewById(rootView, id);
      if (sCategory == null) {
        break missingId;
      }

      id = R.id.sFrequency;
      Spinner sFrequency = ViewBindings.findChildViewById(rootView, id);
      if (sFrequency == null) {
        break missingId;
      }

      id = R.id.tietEnterHabit;
      TextInputEditText tietEnterHabit = ViewBindings.findChildViewById(rootView, id);
      if (tietEnterHabit == null) {
        break missingId;
      }

      id = R.id.tilEnterHabit;
      TextInputLayout tilEnterHabit = ViewBindings.findChildViewById(rootView, id);
      if (tilEnterHabit == null) {
        break missingId;
      }

      id = R.id.tvCategoryExpl;
      TextView tvCategoryExpl = ViewBindings.findChildViewById(rootView, id);
      if (tvCategoryExpl == null) {
        break missingId;
      }

      id = R.id.tvDateExpl;
      TextView tvDateExpl = ViewBindings.findChildViewById(rootView, id);
      if (tvDateExpl == null) {
        break missingId;
      }

      id = R.id.tvDaysExpl;
      TextView tvDaysExpl = ViewBindings.findChildViewById(rootView, id);
      if (tvDaysExpl == null) {
        break missingId;
      }

      id = R.id.tvFrequencyExpl;
      TextView tvFrequencyExpl = ViewBindings.findChildViewById(rootView, id);
      if (tvFrequencyExpl == null) {
        break missingId;
      }

      id = R.id.tvHabitExpl;
      TextView tvHabitExpl = ViewBindings.findChildViewById(rootView, id);
      if (tvHabitExpl == null) {
        break missingId;
      }

      id = R.id.tvHabitTitle;
      TextView tvHabitTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvHabitTitle == null) {
        break missingId;
      }

      id = R.id.tvTimesDayExpl;
      TextView tvTimesDayExpl = ViewBindings.findChildViewById(rootView, id);
      if (tvTimesDayExpl == null) {
        break missingId;
      }

      id = R.id.tvWarning;
      TextView tvWarning = ViewBindings.findChildViewById(rootView, id);
      if (tvWarning == null) {
        break missingId;
      }

      return new ActivityAddHabitBinding((ConstraintLayout) rootView, cbFri, cbMon, cbSat, cbSun,
          cbThu, cbTue, cbWed, etnsDate, etnsTimesDay, fabAddHabit, fabBack, llDate, llDays,
          llTimesDay, sCategory, sFrequency, tietEnterHabit, tilEnterHabit, tvCategoryExpl,
          tvDateExpl, tvDaysExpl, tvFrequencyExpl, tvHabitExpl, tvHabitTitle, tvTimesDayExpl,
          tvWarning);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
