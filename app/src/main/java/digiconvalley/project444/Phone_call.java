package digiconvalley.project444;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Phone_call extends Fragment {
    private View parentView;


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.phone_call,container,false);
        setUpView();
        return parentView;
    }

    private void setUpView() {
        parentView.findViewById(R.id.nav_phone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog=new AlertDialog.Builder(getActivity());
                alertDialog.setTitle("Do you want to call?");
                alertDialog.setMessage("+923084095482");
                alertDialog.setIcon(R.drawable.warning);
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent callIntent =new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:"+"923084095482"));
                        callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(callIntent);
                    }
                });
                                alertDialog.show();
            }
        });
    }
}
