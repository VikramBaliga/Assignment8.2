package projects.android.my.listviewdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String[] name = {"AAA","BBB","CCC"};
    String[] number = {"000","111","222"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.myList);


        ContactAdapter contactAdapter = new ContactAdapter(name,number);

        listView.setAdapter(contactAdapter);
    }

    public  class ContactAdapter extends BaseAdapter
    {
        String[] name ;
        String[] number;

        public ContactAdapter(String[] name,String[] number)
        {
            this.name=name;
            this.number=number;
        }
        @Override
        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.listviewdetails,null);

            TextView contactName = (TextView) view.findViewById(R.id.contactName);
            TextView contactNumber = (TextView) view.findViewById(R.id.contactNumber);

            contactName.setText(name[position]);
            contactNumber.setText(number[position]);

            return  view;
        }
    }
}
