package com.almlkaide.kaypro.aide.project.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.almlkaide.kaypro.aide.project.PUtils;
import com.almlkaide.kaypro.aide.project.jsonbean.Category;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateAdapter extends BaseExpandableListAdapter {
    private Context context;
    private Map<Object, Bitmap> iconMap;
    private List<Category> list;

    @Override
    public Object getChild(int i, int i2) {
        return getChild(i, i2);
    }

    @Override
    public Object getGroup(int i) {
        return getGroup(i);
    }

    public TemplateAdapter(Context context) {
        this.list = new ArrayList();
        this.iconMap = new HashMap();
        this.context = context;
    }

    public TemplateAdapter(Context context, List<Category> list) {
        this.list = new ArrayList();
        this.iconMap = new HashMap();
        this.context = context;
        this.list = list;
    }

    public TemplateAdapter m7101add(Category category) {
        getList().add(category);
        return this;
    }

    @Override
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View templateView = view == null ? new TemplateView(this.context) : view;
        TemplateView.ViewHolder viewHolder = ((TemplateView) templateView).holder;
        Category group = getGroup(i);
        viewHolder.setIcon(getIcon(group.getIcon()), true);
        viewHolder.setTitle(group.getTitle());
        viewHolder.setSubtitle(group.getDescribes());
        return templateView;
    }

    @Override
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        View templateView = view == null ? new TemplateView(this.context) : view;
        TemplateView.ViewHolder viewHolder = ((TemplateView) templateView).holder;
        Category.Templates child = getChild(i, i2);
        viewHolder.setIcon(getIcon(child.getIcon()), false);
        viewHolder.setTitle(child.getTitle());
        viewHolder.setSubtitle(child.getDescribes());
        return templateView;
    }

    private Bitmap getIcon(String str) {
        Bitmap bitmap = this.iconMap.get(str);
        if (bitmap == null) {
            Bitmap icon = PUtils.getIcon(this.context, str);
            this.iconMap.put(str, icon);
            return icon;
        }
        return bitmap;
    }

    public void setList(List<Category> list) {
        this.list = list;
    }

    public List<Category> getList() {
        return this.list;
    }

    @Override
    public int getGroupCount() {
        return getList().size();
    }

    @Override
    public int getChildrenCount(int i) {
        return getGroup(i).getTemplates().size();
    }

    @Override
    public Category getGroup(int i) {
        return getList().get(i);
    }

    @Override
    public Category.Templates getChild(int i, int i2) {
        return getGroup(i).getTemplates().get(i2);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
