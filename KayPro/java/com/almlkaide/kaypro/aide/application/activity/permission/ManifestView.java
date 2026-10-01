package com.almlkaide.kaypro.aide.application.activity.permission;

import android.content.Context;
import android.text.TextUtils;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.widget.CustomListView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ManifestView extends CustomListView {
    private Context mContext;

    public ManifestView(Context context) {
        super(context);
        this.mContext = context;
    }

    public List<Permission> load(File file) throws ParserConfigurationException, SAXException, IOException {
        return load(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file));
    }

    public List<Permission> load(Document document) throws SAXException {
        NodeList elementsByTagName = document.getElementsByTagName("manifest");
        if (elementsByTagName.getLength() == 0) {
            throw new SAXException(Utils.isCN() ? "找不到manifest节点" : "No manifest node found");
        }
        return load(elementsByTagName.item(0).getChildNodes());
    }

    public List<Permission> load(NodeList nodeList) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodeItem = nodeList.item(i);
            NamedNodeMap attributes = nodeItem.getAttributes();
            if ("uses-permission".equals(nodeItem.getNodeName()) && attributes.getLength() == 1) {
                for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                    Node nodeItem2 = attributes.item(i2);
                    if ("android:name".equals(nodeItem2.getNodeName())) {
                        String nodeValue = nodeItem2.getNodeValue();
                        if (!TextUtils.isEmpty(nodeValue.trim()) && !ManifestAdapter.hasAdded(arrayList, nodeValue)) {
                            arrayList.add(new Permission(this.mContext.getPackageManager(), nodeValue));
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
