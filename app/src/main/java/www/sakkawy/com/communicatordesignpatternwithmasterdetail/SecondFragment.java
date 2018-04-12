package www.sakkawy.com.communicatordesignpatternwithmasterdetail;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private TextView resultText;
    private String mData;

    public SecondFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        if(savedInstanceState !=null){
            mData = savedInstanceState.getString("text");
            resultText = (TextView)  view.findViewById(R.id.tv_showResult);
            resultText.setText(mData);
        }

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        resultText = (TextView)getActivity().findViewById(R.id.tv_showResult);
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",mData);
    }

    public void changeText(String data){
        this.mData = data;
        resultText.setText(mData);
    }
}
