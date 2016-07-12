package com.myowncompany.github_task;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView_details;
    private DetailsListAdapter detailsListAdapter;
    private List<Details> mdetailsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView_details= (ListView) findViewById(R.id.listView_details);
        mdetailsList=new ArrayList<>();
        mdetailsList.add(new Details(1,"Shashi","Hello","How are You"));
        mdetailsList.add(new Details(2,"Shashi Ranjan","9939621111","How are You"));
        mdetailsList.add(new Details(3,"Ravi","Appointment","You are eligible"));
        mdetailsList.add(new Details(4,"Sultan","8892885726","How are You"));
        mdetailsList.add(new Details(5,"Saroj","Leave","Unable to Attend"));
        mdetailsList.add(new Details(6,"Shyam","Hello","How are You"));
        mdetailsList.add(new Details(7,"Deepak","Hello","How are You"));
        mdetailsList.add(new Details(8,"Neha","Hello","How are You"));
        mdetailsList.add(new Details(9,"Shreya","Hello","How are You"));
        mdetailsList.add(new Details(10,"Prince","Hello","How are You"));
        mdetailsList.add(new Details(11,"Mohan","Leave","Unable to Attend"));
        mdetailsList.add(new Details(12,"Hemant","Hello","How are You"));
        detailsListAdapter=new DetailsListAdapter(getApplicationContext(),mdetailsList);
        listView_details.setAdapter(detailsListAdapter);
        listView_details.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Clicked_Details_id=" + view.getTag(),Toast.LENGTH_SHORT);
            }
        });

    }
}
