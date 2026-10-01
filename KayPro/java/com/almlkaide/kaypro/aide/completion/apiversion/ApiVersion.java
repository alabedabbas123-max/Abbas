package com.almlkaide.kaypro.aide.completion.apiversion;

import com.blankj.utilcode.util.LogUtils;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.almlkaide.kaypro.aide.application.App;
import com.almlkaide.kaypro.util.Utils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ApiVersion {
    private static Set<String> keySet;
    private static Map<String, ClassApi> sClassApis;
    private static Map<String, ClassApi> sClassApisCache = new ConcurrentHashMap();

    public static Set<String> getKeySet() {
        if (keySet == null) {
            keySet = getClassApis().keySet();
        }
        return keySet;
    }

    public static void init() {
        getClassApis();
    }

    public static Map<String, ClassApi> getClassApis() {
        if (sClassApis == null) {
            try {
                sClassApis = parseClassApi();
            } catch (Throwable th) {
                LogUtils.e(new Object[]{th});
            }
        }
        return sClassApis;
    }

    public static ClassApi findClass(Class cls) {
        return findClass(cls.getName());
    }

    public static ClassApi findClass(String str) {
        String strReplace = str.replace(".", "/");
        ClassApi classApi = sClassApisCache.get(strReplace);
        if (classApi == null && (classApi = getClassApis().get(strReplace)) != null) {
            sClassApisCache.put(strReplace, classApi);
        }
        return classApi;
    }

    public static ApiInfo findApi(String str, String str2) {
        ClassApi classApi = getClassApis().get(str.replace(".", "/"));
        return classApi == null ? (ApiInfo) null : classApi.findApi(str2);
    }

    private static Map<String, ClassApi> parseClassApi() throws ParserConfigurationException, SAXException, IOException {
        HashMap map = new HashMap();
        NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(App.getApp().getAssets().open(Utils.getAssetsDataFile("api-versions.xml"))).getElementsByTagName("api").item(0).getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            try {
                Node nodeItem = childNodes.item(i);
                ClassApi classApi = (ClassApi) createApiInfo(nodeItem, new ClassApi());
                if (classApi.name != null) {
                    NodeList childNodes2 = nodeItem.getChildNodes();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        try {
                            ApiInfo apiInfoCreateApiInfo = createApiInfo(childNodes2.item(i2), new ApiInfo());
                            String str = apiInfoCreateApiInfo.name;
                            if (str != null) {
                                if (ApiInfo.Type.METHOD.equals(apiInfoCreateApiInfo.type)) {
                                    classApi.apiInfos.put(str.substring(0, str.lastIndexOf(")") + 1), apiInfoCreateApiInfo);
                                } else {
                                    classApi.apiInfos.put(str, apiInfoCreateApiInfo);
                                }
                            }
                        } catch (Throwable th) {
                        }
                    }
                    map.put(classApi.name, classApi);
                }
            } catch (Throwable th2) {
            }
        }
        return map;
    }

    private static ApiInfo createApiInfo(Node node, ApiInfo apiInfo) {
        if (node instanceof Element) {
            NamedNodeMap attributes = node.getAttributes();
            String nodeName = node.getNodeName();
            if (nodeName.equals(SvgConstants.ATTR_CLASS)) {
                apiInfo.type = ApiInfo.Type.CLASS;
            } else if (nodeName.equals("method")) {
                apiInfo.type = ApiInfo.Type.METHOD;
            } else if (nodeName.equals("field")) {
                apiInfo.type = ApiInfo.Type.FIELD;
            }
            for (int i = 0; attributes != null && i < attributes.getLength(); i++) {
                Node nodeItem = attributes.item(i);
                String nodeName2 = nodeItem.getNodeName();
                String nodeValue = nodeItem.getNodeValue();
                if (nodeName2.equals("name")) {
                    apiInfo.name = nodeValue;
                } else if (nodeName2.equals("since")) {
                    apiInfo.since = Integer.parseInt(nodeValue);
                } else if (nodeName2.equals("deprecated")) {
                    apiInfo.deprecated = Integer.parseInt(nodeValue);
                } else if (nodeName2.equals("removed")) {
                    apiInfo.removed = Integer.parseInt(nodeValue);
                }
            }
        }
        return apiInfo;
    }
}
