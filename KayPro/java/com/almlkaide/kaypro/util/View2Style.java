package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class View2Style {
    public static void showDialog(Activity activity, String str) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(Utils.dp2px(24), Utils.dp2px(10), Utils.dp2px(24), Utils.dp2px(0));
        EditText editText = new EditText(activity);
        editText.setHint(Utils.isCN() ? "输入Style名" : "Input style name");
        linearLayout.addView(editText, -1, -2);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "配置" : "Configured").setView(linearLayout).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(editText, str, activity, alertDialogCreate) {
            private final Activity val$activity;
            private final AlertDialog val$dialog;
            private final EditText val$et_input;
            private final String val$selectionContent;

            {
                this.val$et_input = editText;
                this.val$selectionContent = str;
                this.val$activity = activity;
                this.val$dialog = alertDialogCreate;
            }

            @Override
            public void onClick(View view) {
                try {
                    String strXml2Style = View2Style.xml2Style(this.val$selectionContent, this.val$et_input.getText().toString().trim());
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.val$activity).setTitle(Utils.isCN() ? "结果" : "Result").setMessage(strXml2Style).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, strXml2Style) {
                        private final AnonymousClass100000001 this$0;
                        private final String val$data;

                        {
                            this.this$0 = this;
                            this.val$data = strXml2Style;
                        }

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Utils.copyToClipboard(this.val$data);
                        }
                    }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
                    alertDialogCreate2.show();
                    Utils.setMessageIsSelectable(alertDialogCreate2);
                    this.val$dialog.dismiss();
                } catch (Throwable th) {
                    Utils.showExDialog(this.val$activity, th);
                }
            }
        });
    }

    public static String xml2Style(String str, String str2) throws ParserConfigurationException, SAXException, IOException {
        Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str))).getDocumentElement();
        StringBuilder sb = new StringBuilder();
        if (str2 == null || str2.length() == 0) {
            str2 = new StringBuffer().append("Style_").append(documentElement.getNodeName()).toString();
        }
        sb.append(String.format("<style name=\"%s\">", str2));
        NamedNodeMap attributes = documentElement.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node nodeItem = attributes.item(i);
            String nodeName = nodeItem.getNodeName();
            if (!"xmlns:android".equals(nodeName)) {
                sb.append(String.format("\n    <item name=\"%1$s\">%2$s</item>", nodeName, nodeItem.getNodeValue()));
            }
        }
        sb.append(String.format("\n</style>", str2));
        return sb.toString().trim();
    }
}
