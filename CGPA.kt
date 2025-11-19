<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/tv1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Dinesh"
        android:textColor="#000000"
        android:textSize="30sp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintVertical_bias="0.02" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="253dp"
        android:layout_height="240dp"
        android:layout_marginTop="60dp"
        android:src="@drawable/img"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/tv2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/label_name"
        android:textColor="#000000"
        android:textSize="25sp"
        android:layout_marginTop="12dp"
        app:layout_constraintTop_toBottomOf="@+id/imageView"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <EditText
        android:id="@+id/et1"
        android:layout_width="0dp"
        android:layout_height="48dp"
        android:hint="@string/hint_enter_name"
        android:textColor="#000000"
        android:textColorHint="#808080"
        android:padding="8dp"
        android:minHeight="48dp"
        android:inputType="textPersonName"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tv2" />

    <TextView
        android:id="@+id/tv3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/label_registration_number"
        android:textColor="#000000"
        android:textSize="25sp"
        android:layout_marginTop="20dp"
        app:layout_constraintTop_toBottomOf="@+id/et1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <EditText
        android:id="@+id/et2"
        android:layout_width="0dp"
        android:layout_height="48dp"
        android:hint="@string/hint_reg_number"
        android:textColor="#000000"
        android:textColorHint="#808080"
        android:padding="8dp"
        android:minHeight="48dp"
        android:inputType="number"
        android:layout_marginTop="10dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tv3" />

    <TextView
        android:id="@+id/tv4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/label_issue_date"
        android:textColor="#000000"
        android:textSize="25sp"
        android:layout_marginTop="20dp"
        app:layout_constraintTop_toBottomOf="@+id/et2"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <EditText
        android:id="@+id/et3"
        android:layout_width="0dp"
        android:layout_height="48dp"
        android:hint="@string/hint_issue_date"
        android:textColor="#000000"
        android:textColorHint="#808080"
        android:padding="8dp"
        android:minHeight="48dp"
        android:inputType="date"
        android:layout_marginTop="10dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tv4" />

    <TextView
        android:id="@+id/tv5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/label_return_date"
        android:textColor="#000000"
        android:textSize="25sp"
        android:layout_marginTop="20dp"
        app:layout_constraintTop_toBottomOf="@+id/et3"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <EditText
        android:id="@+id/et4"
        android:layout_width="0dp"
        android:layout_height="48dp"
        android:hint="@string/hint_return_date"
        android:textColor="#000000"
        android:textColorHint="#808080"
        android:padding="8dp"
        android:minHeight="48dp"
        android:inputType="date"
        android:layout_marginTop="10dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tv5" />

    <Button
        android:id="@+id/bn1"
        android:layout_width="wrap_content"
        android:layout_height="48dp"
        android:minHeight="48dp"
        android:text="@string/calculate_fine"
        app:layout_constraintTop_toBottomOf="@+id/et4"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginTop="24dp"/>
</androidx.constraintlayout.widget.ConstraintLayout>
