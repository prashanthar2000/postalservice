package com.example.prashanth.postalservice;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

class SimpleAlertDialog {

    public static void displayWithOK(View.OnClickListener c, String message) {
        displayWithOK((Context) c, message, "CodePath Demo Intro Android");
    }

    public static void displayWithOK(Context c, String message, String title) {
        final AlertDialog alertDialog = new AlertDialog.Builder(c).create();

        // Setting Dialog Title
        alertDialog.setTitle(title);

        // Setting Dialog Message
        alertDialog.setMessage(message);

        // Setting OK Button
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                alertDialog.hide();
            }
        });

        // Showing Alert Message
        alertDialog.show();
    }
}
