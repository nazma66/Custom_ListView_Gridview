package com.example.custom_and_image_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BA_MyCustomAdapter01 extends BaseAdapter {

    public BA_MyCustomAdapter01(Activity context, String[] headline, Integer[] imageId, String[] date, String[] repname, String[] details) {
        this.context = context;
        this.headline = headline;
        this.imageId = imageId;
        this.date = date;
        this.repname = repname;
        this.details = details;
    }

    private final Activity context;
    private final String[] headline;

    private final Integer[] imageId;
    private final String[] date;

    private final String[] repname;

    private final String[] details;


    @Override
    public int getCount() {
        return headline.length;
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
        ViewHolder vh;

        if (convertView == null) {
            LayoutInflater inflator = context.getLayoutInflater();
            convertView = inflator.inflate(R.layout.ba_activity01, null, true);

            vh= new ViewHolder(convertView);
            convertView.setTag(vh);
        }
        else {
            vh=(ViewHolder) convertView.getTag();
        }
//        LayoutInflater inflator = context.getLayoutInflater();
//        View rowView = inflator.inflate(R.layout.ba_activity01,null,true);


//        TextView textView = (TextView) convertView.findViewById(R.id.textView);
//        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
//        TextView textView4 = (TextView) convertView.findViewById(R.id.textView4);
//        TextView textView2 = (TextView) convertView.findViewById(R.id.textView2);
//        TextView textView5 = (TextView) convertView.findViewById(R.id.textView5);

//        TextView textView = (TextView) rowView.findViewById(R.id.textView);
//        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
//        TextView textView4 = (TextView) rowView.findViewById(R.id.textView4);
//        TextView textView2 = (TextView) rowView.findViewById(R.id.textView2);
//        TextView textView5 = (TextView) rowView.findViewById(R.id.textView5);


//        textView.setText(headline[position]);
//        imageView.setImageResource(imageId[position]);
//        textView4.setText(date[position]);
//        textView2.setText(repname[position]);
//        textView5.setText(details[position]);

        vh.textView.setText(headline[position]);
      vh.imageView.setImageResource(imageId[position]);
        vh.textView4.setText(date[position]);
        vh.textView2.setText(repname[position]);
        vh.textView5.setText(details[position]);

        return convertView;
    }

    private class ViewHolder {
        TextView textView, textView4, textView2, textView5;
        ImageView imageView;

        public ViewHolder(View view) {
            textView = (TextView) view.findViewById(R.id.textView);
            imageView = (ImageView) view.findViewById(R.id.imageView);
            textView4 = (TextView) view.findViewById(R.id.textView4);
            textView2 = (TextView) view.findViewById(R.id.textView2);
            textView5 = (TextView) view.findViewById(R.id.textView5);

        }
    }
}

