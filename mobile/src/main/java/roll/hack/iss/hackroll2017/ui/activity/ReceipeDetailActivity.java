package roll.hack.iss.hackroll2017.ui.activity;

import android.widget.ListView;

import butterknife.Bind;
import roll.hack.iss.hackroll2017.R;
import roll.hack.iss.hackroll2017.adapter.ResultListAdapter;
import roll.hack.iss.hackroll2017.ui.base.BaseActivity;

/**
 * Created by linby on 21/01/2017.
 */

public class ReceipeDetailActivity extends BaseActivity {
    @Bind(R.id.result_listview)
    protected ListView resultListView;
    private ResultListAdapter resultListAdapter;

    @Override
    protected void initComponent() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_receipe_detail;
    }
}
