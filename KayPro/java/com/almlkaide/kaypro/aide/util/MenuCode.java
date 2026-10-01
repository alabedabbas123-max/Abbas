package com.almlkaide.kaypro.aide.util;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.baidu.mobstat.Config;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MenuCode implements MenuItem.OnMenuItemClickListener {
    private OnMenuItemClickListener OnMenuItemClickListener;
    private Node node;
    private Object object;

    public interface OnMenuItemClickListener {
        void onMenuItemClick(MenuItem menuItem, String str);
    }

    public boolean isMenuItem() {
        return this.object instanceof MenuItem;
    }

    public MenuItem getMenuItem() {
        return isSubMenu() ? getSubMenu().getItem() : (MenuItem) this.object;
    }

    public boolean isSubMenu() {
        return this.object instanceof SubMenu;
    }

    public SubMenu getSubMenu() {
        return isMenuItem() ? getMenuItem().getSubMenu() : (SubMenu) this.object;
    }

    public MenuCode(MenuItem menuItem, Node node, OnMenuItemClickListener onMenuItemClickListener) {
        this.object = menuItem;
        this.node = node;
        this.OnMenuItemClickListener = onMenuItemClickListener;
        menuItem.setOnMenuItemClickListener(this);
    }

    public MenuCode(SubMenu subMenu, Node node, OnMenuItemClickListener onMenuItemClickListener) {
        this.object = subMenu;
        this.node = node;
        this.OnMenuItemClickListener = onMenuItemClickListener;
        subMenu.getItem().setOnMenuItemClickListener(this);
    }

    public static MenuCode[] m7104add(Menu menu, InputStream inputStream, String str, OnMenuItemClickListener onMenuItemClickListener) throws ParserConfigurationException, SAXException, IOException {
        NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            String valueByName = getValueByName(nodeItem.getAttributes(), "format");
            if (valueByName != null && Pattern.matches(valueByName, str)) {
                return (MenuCode[]) m7103add(menu, nodeItem.getChildNodes(), onMenuItemClickListener).toArray(new MenuCode[0]);
            }
        }
        return (MenuCode[]) null;
    }

    public static MenuCode m7102add(Menu menu, Node node, OnMenuItemClickListener onMenuItemClickListener) {
        String nodeName = node.getNodeName();
        String valueByName = getValueByName(node.getAttributes(), Config.FEED_LIST_ITEM_TITLE);
        if ("item".equals(nodeName)) {
            return new MenuCode(menu.add(valueByName), node, onMenuItemClickListener);
        }
        if ("menu".equals(node.getNodeName())) {
            return new MenuCode(menu.addSubMenu(valueByName), node, onMenuItemClickListener);
        }
        return (MenuCode) null;
    }

    public static List<MenuCode> m7103add(Menu menu, NodeList nodeList, OnMenuItemClickListener onMenuItemClickListener) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < nodeList.getLength(); i++) {
            MenuCode menuCodeM7102add = m7102add(menu, nodeList.item(i), onMenuItemClickListener);
            if (menuCodeM7102add != null) {
                arrayList.add(menuCodeM7102add);
            }
        }
        return arrayList;
    }

    private static String getValueByName(NamedNodeMap namedNodeMap, String str) {
        for (int i = 0; namedNodeMap != null && i < namedNodeMap.getLength(); i++) {
            Node nodeItem = namedNodeMap.item(i);
            if (str.equals(nodeItem.getNodeName())) {
                return nodeItem.getNodeValue();
            }
        }
        return "unknown";
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (isSubMenu()) {
            SubMenu subMenu = getSubMenu();
            subMenu.clear();
            m7103add(subMenu, this.node.getChildNodes(), this.OnMenuItemClickListener);
        } else if (isMenuItem()) {
            this.OnMenuItemClickListener.onMenuItemClick(menuItem, this.node.getTextContent());
        } else {
            return false;
        }
        return true;
    }
}
