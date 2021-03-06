package galilel.org.galilelwallet.ui.contacts_activity;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import galilel.org.galilelwallet.R;
import galilel.org.galilelwallet.ui.base.tools.adapter.BaseRecyclerViewHolder;

public class ContactViewHolderBase extends BaseRecyclerViewHolder {

    CardView cv;
    TextView name;
    TextView address;

    ContactViewHolderBase(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        name = (TextView) itemView.findViewById(R.id.name);
        address = (TextView) itemView.findViewById(R.id.address);
    }
}
