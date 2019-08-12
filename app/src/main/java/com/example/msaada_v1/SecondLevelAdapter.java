
/*
MIT License

Copyright (c) 2018 CompSci408_2018Fall

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

*/

/*
Authored by Catie Grasse, Carly Levi, Rachel Settle, Phil Kariuki
12/18/18
 */

package com.example.msaada_v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SecondLevelAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String> headers;
    private List<String> originalHeaders;
    private HashMap<String, List<String>> listHashMap;

    ImageView ivGroupIndicator;

    //constructor
    public SecondLevelAdapter(Context context, List<String> headers, List<String> originalHeaders,  HashMap<String, List<String>> listHashMap) {
        this.context = context;
        this.headers = headers;
        this.originalHeaders = originalHeaders;
        this.listHashMap = listHashMap;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return headers.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return headers.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override //allows a user to see all questions on the page
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String groupText = getGroup(groupPosition).toString();
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_second, null);
        }
        TextView text = (TextView) convertView.findViewById(R.id.rowSecondText);
        text.setText(groupText);
        return convertView;
    }

    @Override //get answer to user's question, so that if they click it, they will be able to see it
    public Object getChild(int groupPosition, int childPosition) {
        return listHashMap.get(headers.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) { return childPosition; }

    @Override //allows you to see the answer to the question you clicked
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null); //child_row
        }

        TextView textView = (TextView) convertView.findViewById(R.id.question_name);
        textView.setText(childText);

        return convertView;

    }

    @Override //should always be 1
    public int getChildrenCount(int groupPosition) {
        return listHashMap.get(headers.get(groupPosition)).size();
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override //can click on question to expand and see answer
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    //function that takes a user's search query and checks through questions to see if there is a match
    public void filterData(String query){
        query = query.toLowerCase();

        if(query.isEmpty()){
            headers=originalHeaders; //nothing searched
        } else{
            ArrayList<String> newList = new ArrayList<>();
            for(String question: originalHeaders) { //loop through questions
                if (question.toLowerCase().contains(query)) {
                    newList.add(question); //add to list if query is in question
                }
            }
            if(newList.size() > 0){
                headers=newList; //assign newList to headers and send back to FAQActivity
            }
        }
        notifyDataSetChanged();
    }
}