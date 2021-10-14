import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.college.qrscaner.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomDialog extends BottomSheetDialogFragment {
    private TextView title, link, btn_visit;
    private ImageView close;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_dialog,container,false);
        title = view.findViewById(R.id.txt_title);
        link = view.findViewById(R.id.txt_link);
        btn_visit = view.findViewById(R.id.visit_link);

        btn_visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData();
                startActivity(intent);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return view;
    }
}
