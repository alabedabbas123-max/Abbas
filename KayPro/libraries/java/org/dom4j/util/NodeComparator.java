package org.dom4j.util;

import java.util.Comparator;
import org.dom4j.Attribute;
import org.dom4j.Branch;
import org.dom4j.CharacterData;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;

public class NodeComparator implements Comparator {
    @Override
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        if (obj instanceof Node) {
            if (obj2 instanceof Node) {
                return compare((Node) obj, (Node) obj2);
            }
            return 1;
        }
        if (obj2 instanceof Node) {
            return -1;
        }
        return obj instanceof Comparable ? ((Comparable) obj).compareTo(obj2) : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }

    public int compare(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public int compare(Attribute attribute, Attribute attribute2) {
        int iCompare = compare(attribute.getQName(), attribute2.getQName());
        return iCompare == 0 ? compare(attribute.getValue(), attribute2.getValue()) : iCompare;
    }

    public int compare(CharacterData characterData, CharacterData characterData2) {
        return compare(characterData.getText(), characterData2.getText());
    }

    public int compare(Document document, Document document2) {
        int iCompare = compare(document.getDocType(), document2.getDocType());
        return iCompare == 0 ? compareContent(document, document2) : iCompare;
    }

    public int compare(DocumentType documentType, DocumentType documentType2) {
        if (documentType == documentType2) {
            return 0;
        }
        if (documentType == null) {
            return -1;
        }
        if (documentType2 == null) {
            return 1;
        }
        int iCompare = compare(documentType.getPublicID(), documentType2.getPublicID());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = compare(documentType.getSystemID(), documentType2.getSystemID());
        return iCompare2 == 0 ? compare(documentType.getName(), documentType2.getName()) : iCompare2;
    }

    public int compare(Element element, Element element2) {
        int iCompare = compare(element.getQName(), element2.getQName());
        if (iCompare != 0) {
            return iCompare;
        }
        int iAttributeCount = element.attributeCount();
        int iAttributeCount2 = iAttributeCount - element2.attributeCount();
        if (iAttributeCount2 != 0) {
            return iAttributeCount2;
        }
        for (int i = 0; i < iAttributeCount; i++) {
            Attribute attribute = element.attribute(i);
            int iCompare2 = compare(attribute, element2.attribute(attribute.getQName()));
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return compareContent(element, element2);
    }

    public int compare(Entity entity, Entity entity2) {
        int iCompare = compare(entity.getName(), entity2.getName());
        return iCompare == 0 ? compare(entity.getText(), entity2.getText()) : iCompare;
    }

    public int compare(Namespace namespace, Namespace namespace2) {
        int iCompare = compare(namespace.getURI(), namespace2.getURI());
        return iCompare == 0 ? compare(namespace.getPrefix(), namespace2.getPrefix()) : iCompare;
    }

    public int compare(Node node, Node node2) {
        short nodeType = node.getNodeType();
        int nodeType2 = nodeType - node2.getNodeType();
        if (nodeType2 != 0) {
            return nodeType2;
        }
        switch (nodeType) {
            case 1:
                return compare((Element) node, (Element) node2);
            case 2:
                return compare((Attribute) node, (Attribute) node2);
            case 3:
                return compare((CharacterData) node, (CharacterData) node2);
            case 4:
                return compare((CharacterData) node, (CharacterData) node2);
            case 5:
                return compare((Entity) node, (Entity) node2);
            case 6:
            case 11:
            case 12:
            default:
                throw new RuntimeException(new StringBuffer().append("Invalid node types. node1: ").append(node).append(" and node2: ").append(node2).toString());
            case 7:
                return compare((ProcessingInstruction) node, (ProcessingInstruction) node2);
            case 8:
                return compare((CharacterData) node, (CharacterData) node2);
            case 9:
                return compare((Document) node, (Document) node2);
            case 10:
                return compare((DocumentType) node, (DocumentType) node2);
            case 13:
                return compare((Namespace) node, (Namespace) node2);
        }
    }

    public int compare(ProcessingInstruction processingInstruction, ProcessingInstruction processingInstruction2) {
        int iCompare = compare(processingInstruction.getTarget(), processingInstruction2.getTarget());
        return iCompare == 0 ? compare(processingInstruction.getText(), processingInstruction2.getText()) : iCompare;
    }

    public int compare(QName qName, QName qName2) {
        int iCompare = compare(qName.getNamespaceURI(), qName2.getNamespaceURI());
        return iCompare == 0 ? compare(qName.getQualifiedName(), qName2.getQualifiedName()) : iCompare;
    }

    public int compareContent(Branch branch, Branch branch2) {
        int iNodeCount = branch.nodeCount();
        int iNodeCount2 = iNodeCount - branch2.nodeCount();
        if (iNodeCount2 == 0) {
            for (int i = 0; i < iNodeCount; i++) {
                iNodeCount2 = compare(branch.node(i), branch2.node(i));
                if (iNodeCount2 != 0) {
                    break;
                }
            }
        }
        return iNodeCount2;
    }
}
